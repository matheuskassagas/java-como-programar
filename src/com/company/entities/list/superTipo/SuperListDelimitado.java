package com.company.entities.list.superTipo;


import com.company.entities.Interface.shape.Circulo;
import com.company.entities.Interface.shape.Retangulo;
import com.company.entities.Interface.shape.Shape;
import com.company.entities.polimorfismo.shape.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class SuperListDelimitado {
    public static void main (String[] args){

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Retangulo(Color.BLACK,3.0, 2.0));
        myShapes.add(new Circulo(Color.BLACK, 2.0));

        List<Circulo> myCircles = new ArrayList<>();
        myCircles.add(new Circulo(Color.BLACK, 10.0));
        myCircles.add(new Circulo(Color.BLACK, 2.0));

        System.out.println("Total area: " + totalArea(myCircles));

    }

    //<? extends Shape> minha lista pode ser de SHAPE ou de qualquer tipo que seja um subtipo SHAPE
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum+= s.area();
        }return sum;
    }

    //public static double totalArea(List<? extends Shape> list){  metodo so funcioanaria para uma lista de SHAPE
}
