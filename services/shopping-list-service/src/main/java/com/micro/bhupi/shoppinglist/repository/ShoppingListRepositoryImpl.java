package com.micro.bhupi.shoppinglist.repository;

import com.micro.bhupi.shoppinglist.domain.ShoppingList;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class ShoppingListRepositoryImpl implements ShoppingListRepositoryCustom {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void deleteProductsById(String id) {
        mongoOperations.updateMulti(new Query(), new Update().pull("items", new BasicDBObject("id", id)), ShoppingList.class);
    }
}