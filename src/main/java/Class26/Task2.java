package Class26;

import java.util.*;

public class Task2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop.
Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Bolivia", "Sucre");
        countries.put("Chile", "Santiago");
        countries.put("Brazil", "Brasilia");
        countries.put("Venezuela", "Caracas");
        countries.put("USA", "Washington DC");

        Set<String>countrySet=countries.keySet();
        System.out.println(countries);

        System.out.println("*********");
        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("**********");
        for (String v : countries.values()) {
            System.out.println(v);
        }
        System.out.println("************");
        //var keywords is used here instead of typing Map.Entry<String, String>
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+", "+e.getValue());
        }
    }
}



