package com.company.entities.lambda.interfaceFuncional.predicate;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class aPredicate {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //expressao lambda
        //list.removeIf(p -> p.getPrice() >= 100);

        //consumindo uma interface funcional
        //list.removeIf(new ProductPredicate());

        //referencia para metodo statico, nome da "class::metodo"
        //list.removeIf(Product::staticProductPredicate);

        //referencia para metodo, nome da "class::metodo"
        //list.removeIf(Product::nonStaticProductPredicate);

        //expressao lambda declarada
        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);

        //expressao lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
