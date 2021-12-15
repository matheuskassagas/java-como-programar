package com.company.entities.lambda.Comparator;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class aCollectionsSort {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 400.00));

        Collections.sort(list);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
