package com.mdspecht.fdvv.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mdspecht.fdvv.document.Product;
import com.mdspecht.fdvv.repository.ProductRepository;

import reactor.core.publisher.Flux;

//@Component
//public class DummyData implements CommandLineRunner{
//	
//	private final ProductRepository productRepository;
//	
//    DummyData(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    	productRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                                .map(name -> new Product(UUID.randomUUID().toString(), name))
//                                .flatMap(productRepository::save))
//                .subscribe(System.out::println);
//    }
//
//
//}