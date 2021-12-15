package com.company.entities.lambda.interfaceFuncional.function;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cFunction {

    public static void main (String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
        //names.forEach(System.out::println);

//        Function<Product, String> func = p -> p.getName().toUpperCase();
//        List<String> name = list.stream().map(func).collect(Collectors.toList());
//        name.forEach(System.out::println);



        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);



    }
}
