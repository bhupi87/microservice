package com.micro.bhupi.shoppinglist.api.mapper;

import com.micro.bhupi.shoppinglist.api.model.CreateOrUpdateShoppingListPayload;
import com.micro.bhupi.shoppinglist.api.model.QueryShoppingListResult;
import com.micro.bhupi.shoppinglist.domain.ShoppingList;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper
public interface ShoppingListMapper {

    ShoppingList toShoppingList(CreateOrUpdateShoppingListPayload payload);

    QueryShoppingListResult toQueryShoppingListResult(ShoppingList shoppingList);

    void updateShoppingList(CreateOrUpdateShoppingListPayload payload, @MappingTarget ShoppingList shoppingList);
}