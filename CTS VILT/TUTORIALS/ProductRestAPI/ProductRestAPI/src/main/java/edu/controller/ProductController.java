package edu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import edu.model.Product;

@RestController
public class ProductController {

		private static Map<String, Product> repo=new HashMap<>();
		
		static
		{

			Product honey=new Product();
			honey.setId("1");
			honey.setName("Honey");
			repo.put(honey.getId(), honey);
			
			
			Product almond=new Product();
			almond.setId("2");
			almond.setName("Almond");
			repo.put(almond.getId(), almond);
			
		}
	
		@GetMapping("/products")
		public ResponseEntity<Object> getProducts()
		{
			return new ResponseEntity<Object>(repo.values(), HttpStatus.OK);
		}
		@GetMapping("/product/{id}")
		public ResponseEntity<Object> getProduct(@PathVariable("id")String id)
		{
			
			Product pro=repo.get(id);
			
	return new ResponseEntity<Object>(pro, HttpStatus.OK);
		}

		
		@PostMapping("/product")
		public ResponseEntity<Object> addProduct(@RequestBody Product product)
		{
			repo.put(product.getId(), product);
			
	return new ResponseEntity<Object>("Product added Successfully", HttpStatus.OK);
		}
		
		@DeleteMapping("/product/{id}")
		public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id)
		{
			repo.remove(id);
			
	return new ResponseEntity<Object>("Product Deleted Successfully", HttpStatus.ACCEPTED);
		}
		
		

		@PutExchange("/product/{id}")
		public ResponseEntity<Object> updateProduct(@PathVariable("id") String id , @RequestBody Product product)
		{
			repo.remove(id);
			product.setId(id);
			repo.put(id, product);
			
	return new ResponseEntity<Object>("Product updated Successfully", HttpStatus.ACCEPTED);
		}
		
		
}
