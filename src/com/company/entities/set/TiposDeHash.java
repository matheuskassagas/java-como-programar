package com.company.entities.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TiposDeHash {
    public static void main (String[] args){

        //rapido mas nao mantem a ordem
        Set<String> hashSet = new HashSet<>();


        //ordena a lista
        Set<String> treeSet = new TreeSet<>();

        //mesma ordem que foram adicionados'
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");

        System.out.println(hashSet.contains("Notebook"));

        hashSet.remove("Tablet");


        //remover algum predicado que eu colocar...
        //remover tdo elemento x, tal que x.length seja maior ou igual a 3
        hashSet.removeIf(x -> x.length() >= 3);

        //remover tdo mundo que tenha a primeira letra igual a letra T
        hashSet.removeIf(x -> x.charAt(0) == 'T');

        for (String p: hashSet){
            System.out.println(p);
        }

    }
}
