package com.mdspecht.fdvv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdspecht.fdvv.document.Product;
import com.mdspecht.fdvv.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Flux<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Mono<Product> findById(String id) {
		return productRepository.findById(id);
	}

	@Override
	public Mono<Product> save(Product product) {
		return productRepository.save(product);
	}
	
}
