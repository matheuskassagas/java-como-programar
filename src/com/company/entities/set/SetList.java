package com.company.entities.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
    public static void main (String[] args) {

        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection - aquele elementos em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference - remover do conjunto e tdo mundo que esta no conjunto b
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
