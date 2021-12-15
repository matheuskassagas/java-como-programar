package com.company.entities.lambda.interfaceFuncional.consumer;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class bConsumer {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        //recebe um consumer como argumento
        // vai percorrer a lista, colecao e executar um consumer para cada elemento
        //list.forEach(new ProductConsumer());
        //list.forEach(System.out::println); //Referenciamento o metodo para o print ln


        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        list.forEach(System.out::println);
    }
}
