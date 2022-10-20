package com.example.lib.Lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sasha");
        arrayList.add("Olya");
        arrayList.add("Sasha");
        arrayList.add("Masha");
//        System.out.println(arrayList.get(1)); // показываем что под индексом 1
//        System.out.println(arrayList.indexOf("Hello")); // показывет под каким индексом хеллоу
//        arrayList.remove("bye");
//        System.out.println(arrayList.get(1));
//        arrayList.clear();
//        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("bye")); // Вставляем хай вместо бай со сдвигом
        arrayList.add(1,"Yura");
        System.out.println(arrayList.indexOf("bye"));

        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.println(arrayList);
        System.out.println();

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);






    }
}
