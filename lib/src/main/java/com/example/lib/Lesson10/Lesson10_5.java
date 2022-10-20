package com.example.lib.Lesson10;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Lesson10_5 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("ios developer");
        arrayDeque.addFirst("android developer");
        arrayDeque.addLast("python developer");
        arrayDeque.push("flutter developer");

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());

        ArrayList<String> arrayList = new ArrayList<>(arrayDeque);
        System.out.print(arrayList.get(2));
    }
}
