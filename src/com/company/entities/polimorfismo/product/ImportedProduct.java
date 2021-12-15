package com.company.entities.polimorfismo.product;

public final class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag() {
        return String.format(getName() + " $ %.2f", totalPrice() + " (Customs fee: $ ", getCustomsFee() + ")");
    }

    public final double totalPrice(){
        return getPrice() + getCustomsFee();
    }
}
