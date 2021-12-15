package com.company.entities.list.typeT;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //GENERICS ACEITA STRING
        PrintService<String> myNames = new PrintService<>();
        System.out.print("How many values? ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            String name = sc.next();
            myNames.addValue(name);
        }
        myNames.print();
        String firstName = myNames.first();
        System.out.println("First name: " + firstName);

        System.out.print("Qual posição no vetor de String deseja acessar ");
        int position = sc.nextInt();
        String positionEscolhido = myNames.getPosition(position);
        System.out.println("Name na position " + position + ": " + positionEscolhido);

        //GENERICS ACEITA NUMBER
        PrintService<Integer> myNumber = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            myNumber.addValue(value);
        }

        myNumber.print();
        Integer firstNumber = myNumber.first();
        System.out.println("First number: " + firstNumber);

        System.out.print("Qual posição no vetor de Numeros deseja acessar ");
        int positionInt = sc.nextInt();
        String positionEscolhido2 = myNames.getPosition(position);
        System.out.println("Number na position " + positionInt + ": " + positionEscolhido2);


        sc.close();
    }
}
