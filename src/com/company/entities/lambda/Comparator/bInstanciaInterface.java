package com.company.entities.lambda.Comparator;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;


public class bInstanciaInterface {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 400.00));


        //instancia da interface
        list.sort(new bInteraceMyComparator());

        for (Product p : list){
            System.out.println(p);
        }
    }
}
