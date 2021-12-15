package com.company.entities.polimorfismo.product;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);


        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++ ){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                products.add(new UsedProduct(name, price, date));

            }else if (ch == 'i'){
                System.out.print("Custmos fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                products.add(new Product(name, price));

            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product prod: products){
            System.out.println(prod.priceTag());
        }

    }
}
