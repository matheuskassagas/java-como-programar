package com.company.entities.Interface.shape;

import com.company.entities.polimorfismo.shape.enums.Color;

public class MainShape {

    public static void main(String[] args){

        AbstractShape s1 = new Circulo(Color.BLACK, 2.0);
        AbstractShape s2 = new Retangulo(Color.BLUE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s2.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }
}
