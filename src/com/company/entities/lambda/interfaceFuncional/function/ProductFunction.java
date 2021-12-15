package com.company.entities.lambda.interfaceFuncional.function;

import com.company.entities.lambda.Product;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
