package com.company.entities.lambda.interfaceFuncional.predicate;

import com.company.entities.lambda.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
