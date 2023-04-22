package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    // 2.Stwórz dwa HashSety integerów i zaimplementuj dla nich następujące działania rachunków zbiorów: suma, część wspólna,
    // różnica, suma bez części wspólnej. Wynik działania powinien trafić do trzeciego zbioru.

    Set<Integer> names = new HashSet<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);
        names.add(5);

    Set<Integer> second = new HashSet<>();
        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        second.add(9);

        for (Integer i : names) {
            for (Integer j : second) {
                if (i == j)
                    System.out.println("Czesc wspolna " + j);
            }
        }


        // Stwórz dwie HashMapy<String, Integer> (jak w liście zakupów) i zaimplementuj ich sumowanie. Np jedna mapa to Jajka:
        // 3; Mleko: 1, a druga to Jajka: 2; Kiełbasa: 2, wynik to Jajka: 5; Mleko: 1; Kiełbasa: 2

//        Map<String, Integer> groceries = new HashMap<>();
//        groceries.put("Eggs", 3);
//        groceries.put("Milk", 1);
//
//        Map<String, Integer> shopping = new HashMap<>();
//        shopping.put("Eggs", 2);
//        shopping.put("Sausage", 2);


    }
}
