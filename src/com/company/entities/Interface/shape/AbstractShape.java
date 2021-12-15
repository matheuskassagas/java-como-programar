package com.company.entities.Interface.shape;

import com.company.entities.polimorfismo.shape.enums.Color;

public abstract class AbstractShape implements Shape{

    private Color color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }
}
