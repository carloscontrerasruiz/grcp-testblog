package com.test.blog.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

public class BlogServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Blog Server");
		
		//Plain text server
		Server server = ServerBuilder.forPort(9090)
				.addService(new BlogServiceImpl())
				.addService(ProtoReflectionService.newInstance())//reflection
				.build();
		
		//secure server
		/*Server server = ServerBuilder.forPort(9090)
				.addService(new BlogServiceImpl())
				.addService(ProtoReflectionService.newInstance())//reflection
				.useTransportSecurity(
						new File("ssl/server.crt"), 
						new File("ssl/server.pem")
						)
				.build();*/
		
		server.start();
		
		Runtime.getRuntime().addShutdownHook(new Thread(
				()->{
					System.out.println("Recevied shutdown request");
					server.shutdown();
					System.out.println("Succesfully stopped the server");
				}
			));
		
		server.awaitTermination();
	}
}
