package com.micro.bhupi.product.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.micro.bhupi.product.api.model.CreateOrUpdateProductPayload;
import com.micro.bhupi.product.api.model.QueryProductResult;
import com.micro.bhupi.product.domain.Product;

@Mapper
public interface ProductMapper {

    Product toProduct(CreateOrUpdateProductPayload payload);

    QueryProductResult toQueryProductResult(Product product);

    void updateProduct(CreateOrUpdateProductPayload payload, @MappingTarget Product product);
}
