package com.sda.collections;

import com.sda.vehicles.Car;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
        // Lista
        List<String> list = new ArrayList<>();
        List<String> list2 = List.of("A", "B", "C"); //immutable

        list.add("Hania");
        list.add("Michal");
        list.add("Krzys");
        list.add("Michal");
        list.addAll(list2);

        for (String imie : list) {
            System.out.println(imie);
        }
      /*  for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        } */

        // Set  - nie przechowuje duplikatow
        Set<String> texts = new HashSet<>();
        texts.add("1st");
        texts.add("2nd");
        texts.add("3rd");
        texts.add("4th");
        texts.add("2nd");
        for (String text : texts) {
            System.out.println(text);
        }

        // Map

        Map<String, String> people = new HashMap<>();
        people.put("Michal", "nawigator");
        people.put("Hania", "nauczycielka");
        people.put("Ula","farmaceutka");
        people.put("Radek","malarz");
        // iterowanie po kluczach
        for (String names : people.keySet()) {
            System.out.println(names);
        }
        // iterowanie po wartosciach
        for (String job : people.values()) {
            System.out.println(job);
        }
        // iterowanie po parach
        for (Map.Entry<String, String> pair: people.entrySet()){
            System.out.println("Imie: " + pair.getKey() + "; zawod " + pair.getValue());
        }
        System.out.println(people);
    }
}
