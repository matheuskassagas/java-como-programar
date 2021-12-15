package com.company.entities.lambda.interfaceFuncional.consumer;

import com.company.entities.lambda.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
