package com.company.entities.list.superTipo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperList {
    public static void main (String[] args) {


        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        //myObjs = myNumbers; nao pode converter, integer nao e subtipo de object.  nao eh possivel upcasting .

        //SUPERTIPO de qualquer tipo de lista <?>
        List<?> myObjs1 = new ArrayList<>();
        List<Integer> myNumbers1 = new ArrayList<>();
        myObjs1 = myNumbers1;




        List<Integer> myInts  = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrgs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrgs);


    }

    public static void printList (List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}