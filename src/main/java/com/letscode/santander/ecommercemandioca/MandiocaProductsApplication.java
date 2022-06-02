package com.letscode.santander.ecommercemandioca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MandiocaProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MandiocaProductsApplication.class, args);
		System.out.println("\n\nMandiocaProducts rodando!!!\n\n");
	}

}
