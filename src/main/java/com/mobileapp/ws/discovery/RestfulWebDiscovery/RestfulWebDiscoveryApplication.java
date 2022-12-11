 package com.mobileapp.ws.discovery.RestfulWebDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 @SpringBootApplication
 @EnableEurekaServer
public class RestfulWebDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebDiscoveryApplication.class, args);
	}

}
