package com.company.entities.Interface.shape;

import com.company.entities.polimorfismo.shape.enums.Color;

public class Retangulo extends AbstractShape{

    private Double width;
    private Double height;

    public Retangulo(){
        super();
    }

    public Retangulo(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}
