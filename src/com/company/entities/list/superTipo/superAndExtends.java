package com.company.entities.list.superTipo;

import java.util.ArrayList;
import java.util.List;

public class superAndExtends {

    public static void main (String[] args){

        //COVARIANCIA
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList; // EXTENDS pode ser qualquer tipo de numero

        Number x = list.get(0);
        System.out.println(x);

        // list.add(20);
        // erro de compilacao o compilador nao aceita por nao saber qual e o tipo da lista, pois a lista e E GENERICA PARA QUALQUER TIPO DE NUMERO.


        //CONTRAVARIANCIA
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs; // SUPER pode ser tanto number quanto OBJECT

        myNums.add(10);
        myNums.add(3.14);


        //Number x = myNums.get(0);
        // erro de compilacao pois o compilador nao sabe qual é o objeto a obter .
    }


}
