package com.test.blog.client;

import com.test.blog.protofiles.Blog;
import com.test.blog.protofiles.BlogServiceGrpc;
import com.test.blog.protofiles.CreateBlogRequest;
import com.test.blog.protofiles.CreateBlogResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BlogClient {
	public static void main(String[] args) {
		System.out.println("Start client");

		//create the channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
				.usePlaintext()
				.build();
	
		//Create secure channel
		/*ManagedChannel secureChannel = NettyChannelBuilder.forAddress("localhost",9090)
				.sslContext(GrpcSslContexts
								.forClient()
								.trustManager(new File("ssl/ca.crt"))
								.build()
							).build();*/
		
		BlogClient.createBlog(channel);

	}

	private static void createBlog(ManagedChannel channel) {
		
		BlogServiceGrpc.BlogServiceBlockingStub blogClient = BlogServiceGrpc.newBlockingStub(channel);
		
		Blog blog = Blog.newBuilder()
				.setContent("First blog entry body ttttttt")
				.setAuthorId("Carlos")
				.setTitle("First Bog entry")
				.build();
		
		CreateBlogResponse response = blogClient.createBlog(CreateBlogRequest.newBuilder()
				.setBlog(blog)
				.build());
			
		System.out.println("Response completed");
		System.out.println(response);
		
	}
}
