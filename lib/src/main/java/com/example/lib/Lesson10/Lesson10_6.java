package com.example.lib.Lesson10;

import java.util.HashMap;
import java.util.TreeMap;

public class Lesson10_6 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Planet","Saturn");
        hashMap.put("Earth", "Country");
        hashMap.put("Animal", "cat");
//        hashMap.put("Earth", "Ocean");

        System.out.println(hashMap);
        System.out.println(hashMap.get("Animal"));
        hashMap.remove("Animal");
        System.out.println(hashMap);

        System.out.println("Task_2");

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A","C");
        treeMap.put("D", "A");
        treeMap.put("B", "D");
        treeMap.put("C", "B");

        System.out.println(treeMap);




    }
}
