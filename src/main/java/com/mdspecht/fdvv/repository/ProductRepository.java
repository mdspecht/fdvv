package com.mdspecht.fdvv.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mdspecht.fdvv.document.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

}
