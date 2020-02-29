package com.mdspecht.fdvv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mdspecht.fdvv.document.Product;
import com.mdspecht.fdvv.services.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping(value="/products")
	public Flux<Product> getAllProducts(){
		return service.findAll();
	}
	
	@GetMapping(value="/product/{id}")
	public Mono<Product> getProductById(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping(value="/product")
	public Mono<Product> save(@RequestBody Product product){
		return service.save(product);
	}
	
}
