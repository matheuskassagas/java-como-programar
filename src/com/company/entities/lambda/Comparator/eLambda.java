package com.company.entities.lambda.Comparator;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;


public class eLambda {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 400.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}