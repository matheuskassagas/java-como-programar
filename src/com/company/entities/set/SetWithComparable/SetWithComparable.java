package com.company.entities.set.SetWithComparable;

import java.util.Set;
import java.util.TreeSet;

public class SetWithComparable {

    public static void main (String[] args){

        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("TV", 900.00));
        set.add(new Produto("Notebook", 1200.00));
        set.add(new Produto("Tablet", 400.00));


        for (Produto p : set){
            System.out.println(p);
        }
    }


}
