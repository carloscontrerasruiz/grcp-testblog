package com.test.blog.server;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.test.blog.protofiles.Blog;
import com.test.blog.protofiles.BlogServiceGrpc.BlogServiceImplBase;
import com.test.blog.protofiles.CreateBlogRequest;
import com.test.blog.protofiles.CreateBlogResponse;

import io.grpc.stub.StreamObserver;

public class BlogServiceImpl extends BlogServiceImplBase{
	
	
	private MongoClient mongoClient = MongoClients
			.create("mongodb://root:example@localhost:27017");
	
	private MongoDatabase database = mongoClient.getDatabase("dbblog");
	
	private MongoCollection<Document> collection = database.getCollection("blog");
	
	@Override
	public void createBlog(CreateBlogRequest request, StreamObserver<CreateBlogResponse> responseObserver) {
		
		System.out.println("Request receveid");
		
		//request del cliente
		Blog blog = request.getBlog();
		
		//se crea documento bson
		Document document = new Document("author_id",blog.getAuthorId())
				.append("title", blog.getTitle())
				.append("content", blog.getContent());
		
		//se inserta en mongodb
		collection.insertOne(document);
		
		System.out.println("Blog inserted");
		
		//id generado por mongo
		String id = document.getObjectId("_id").toString();
		
		/*CreateBlogResponse response = CreateBlogResponse.newBuilder()
				.setBlog(Blog.newBuilder()
						.setAuthorId(blog.getAuthorId())
						.setContent(blog.getContent())
						.setTitle(blog.getTitle())
						.setId(id)
						.build()
						)
				.build();*/
		
		CreateBlogResponse response = CreateBlogResponse.newBuilder()
				.setBlog(blog.toBuilder().setId(id).build())
				.build();
		
		mongoClient.close();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
