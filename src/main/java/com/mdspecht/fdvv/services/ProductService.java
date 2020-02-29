package com.mdspecht.fdvv.services;

import com.mdspecht.fdvv.document.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
	
	Flux<Product> findAll();
	Mono<Product> findById(String id);
	Mono<Product> save(Product product);
	
}
