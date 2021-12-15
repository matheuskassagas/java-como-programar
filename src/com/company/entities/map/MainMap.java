package com.company.entities.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainMap {
    public static void main (String[] args){

        Map<String, Integer> votes = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader lendo = new BufferedReader(new FileReader(path))){

            String itemCsv = lendo.readLine();
            while(itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);


                //se em votos houver a chave na posicao do vetor, ele acessa o if e faz a contagem
                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                } else{
                    votes.put(name, count);
                }
                itemCsv  = lendo.readLine();
            }

            for (String key: votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
