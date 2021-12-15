package com.company.entities.lambda;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;

    public Product(){

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return String.format(getName() + " $ %.2f",  getPrice());
    }

    //metodo estatico que recebe qualquer objeto produto
    public static boolean nonStaticProductPredicate (Product p){
        return p.getPrice() >= 100.0;
    }

    //trabalha com o proprio objeto
    public boolean staticProductPredicate (){
        return price >= 100.0;
    }


    @Override
    public int compareTo(Product product) {
        return name.toUpperCase().compareTo(product.getName().toUpperCase());
    }
}
