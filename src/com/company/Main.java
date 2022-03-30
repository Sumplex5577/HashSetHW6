package com.company;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add("One");
    System.out.println("size is  "  + set.size());
    set.add("two");
    System.out.println("Size is: " + set.size());
    set.add("three");
    System.out.println("Size is: " + set.size());
    set.add("four");
    System.out.println("Size is: " + set.size());
    set.add("five");
    System.out.println("Size is: " + set.size());

    System.out.println(set);
    System.out.println(set.hashCode());


    System.out.println("Is Empty: " + set.isEmpty());

    System.out.println("Remove 1: " + set.remove("One"));
    System.out.println("Remove 2: " + set.remove("two"));
    System.out.println(set);
    System.out.println("");
    set.add("six");
    set.add("seven");
    System.out.println(set);
    System.out.println(set.contains("seven"));

  //  System.out.println(set.toArray());



    set.clear();
    System.out.println(set);







    }
}
