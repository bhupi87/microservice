package com.micro.bhupi.shoppinglist.repository;

import com.micro.bhupi.shoppinglist.domain.ShoppingList;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ShoppingListRepository extends MongoRepository<ShoppingList, String>, ShoppingListRepositoryCustom {

}
