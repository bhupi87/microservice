package com.micro.bhupi.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.micro.bhupi.product.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>  {

}
