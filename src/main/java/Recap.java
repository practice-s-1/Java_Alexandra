package main.java;

import java.util.*;

public class Recap {
    public static void main(String[] args) {


        String[] names = {"Ana", "Maria", "Ion", "Diana"};

        // array dimension
        System.out.println("Dimension: " + names.length);
        // "na"

        for (String currentName : names) {
            if (currentName.contains("na")) {
                System.out.println(currentName);
            }
        }



        List<String> namesList = new ArrayList<>(); // value -> null, empty
        namesList.add("Ioana");
        namesList.add("Ana");
        namesList.add("Gina");
        System.out.println("The initial list is: " + namesList);

        System.out.println("Congrats: " + namesList.get(2));

        // Gina
        List<String> namesAfterFor = new ArrayList<>();
        for (String name : namesList) {
            if (name.equals("Gina")) {
                namesAfterFor.add(name);
                System.out.println("The new list: " + namesAfterFor);
            }
        }

        Collections.sort(namesList);

        // SET - duplicates not allowed
        Set<String> setNames = new HashSet<>(); // random
        // Set<String> setNames = new LinkedHashSet<>(); // keep the insertion data
        // Set<String> setNames = new TreeSet<>(); // sort set A-Z, 1-n


        Map<Integer, String> namesMap = new HashMap<>();

    }
}
