package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashSet implements SetInterface {
 //     private int size = 0;
    //    private int capacity = 16;


   private HashMap<String, Object> map = new HashMap<>();

   private static final Object PRESENT = new Object();

   int size = 0;


   @Override
    public boolean add(String e) {
        if (e ==null)
            size++;
        return map.put(e, PRESENT)== null;
    }

    @Override
    public void clear() {
       map.clear();

    }

    @Override
    public boolean contains(String e) {
        return map.containsKey(e);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(String e) {
        return map.remove(e)==PRESENT;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}