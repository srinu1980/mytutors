package edu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ProductRestApiApplication {

	@Value("${spring.application.name}")
	private String name;
	
	@GetMapping("/show")
	public String names()
	{
		return name;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductRestApiApplication.class, args);
	
	ProductRestApiApplication ob=new ProductRestApiApplication();

	}

}
