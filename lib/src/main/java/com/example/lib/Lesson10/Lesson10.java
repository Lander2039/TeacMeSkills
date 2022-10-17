package com.example.lib.Lesson10;

import java.util.ArrayList;

public class Lesson10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("bye");
        arrayList.add("world");
//        System.out.println(arrayList.get(1)); // показываем что под индексом 1
//        System.out.println(arrayList.indexOf("Hello")); // показывет под каким индексом хеллоу
//        arrayList.remove("bye");
//        System.out.println(arrayList.get(1));
//        arrayList.clear();
//        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("bye")); // Вставляем хай вместо бай со сдвигом
        arrayList.add(1,"hi");
        System.out.println(arrayList.indexOf("bye"));





    }
}
