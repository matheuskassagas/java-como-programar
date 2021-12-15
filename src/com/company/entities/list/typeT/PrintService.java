package com.company.entities.list.typeT;


import java.util.ArrayList;
import java.util.List;


//<T> lista generica, aceita qualquer tipo para ser instanciado
public class PrintService<T> {

        private List<T> list = new ArrayList<>();

        public void addValue(T value) {
            list.add(value);
        }

        public T first() {
            if (list.isEmpty()) {
                throw new IllegalStateException("List is empty");
            }
            return list.get(0);
        }

    public T getPosition(Integer position) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(position);
    }

        public void print() {
            System.out.print("[");
            if (!list.isEmpty()) {
                System.out.print(list.get(0));
            }
            for (int i = 1; i < list.size(); i++) {
                System.out.print(", " + list.get(i));
            }
            System.out.println("]");
        }
}
