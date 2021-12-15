package com.company.entities.lambda.Comparator;

import com.company.entities.lambda.Product;

import java.util.Comparator;

public class bInteraceMyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
