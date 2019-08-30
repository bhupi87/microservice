package com.micro.bhupi.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.micro.bhupi.product.service.ProductOutputChannel;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({ProductOutputChannel.class})
public class Application {
	
	public static void main(String w[]){
		
		SpringApplication.run(Application.class, w);
	}

}
