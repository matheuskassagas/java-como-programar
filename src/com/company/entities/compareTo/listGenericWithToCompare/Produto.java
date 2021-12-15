package com.company.entities.compareTo.listGenericWithToCompare;

public class Produto implements Comparable<Produto>{

    private String name;
    private Double price;

    public Produto() {
    }

    public Produto(String name, Double price) {
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

    @Override
    public String toString() {
        return name + ", " + String.format("%2.f", price);
    }

    @Override
    public int compareTo(Produto produto) {
        return price.compareTo(getPrice());
    }
}