package com.company.entities.lambda.interfaceFuncional.myFunction;

import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = filterdSum(list, p -> p.getName().charAt(0) == 'T');

    }

    public static double filterdSum (List<Product> list, Predicate<Product> criteria){
            double sum = 0.0;
            for (Product p : list) {
                if (criteria.test(p)) {
                    sum = sum + p.getPrice();
                }

            }
            return sum;
    }
}
