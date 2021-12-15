package com.company.entities.list.listGenericWithToCompare;

import java.util.List;

public class CalculationService {

    //operacao static, nao tendo necessidade de instacionar a classe.
    //<T> lista generica que aceita qualquer objeto.
    //para usar o caompareTo preciso definir para o TIPO T... declaracao no public static diz: o metodo trabalha com qualquer tipo T
    //desde que o T seja qualquer subtipo de compareble T
    public static <T extends Comparable<? super T>> T max(List<T> list){
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        //algoritmo que pega o primeiro membro da lista.
        T max = list.get(0);
        //para tdo inteiro item na minha list
        for (T item : list){
            //para usar o caompareTo preciso definir para o TIPO T
            if(item.compareTo(max) > 0){
                max = item;
            }
        } return max;
    }
}