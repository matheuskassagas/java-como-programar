package com.company.entities.polimorfismo.shape;

import com.company.entities.polimorfismo.shape.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
