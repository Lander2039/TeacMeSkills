package com.example.lib.Lesson10;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson10_7 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("four");
        arrayList.add("five");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();

        int index = arrayList.indexOf("two");// поиск объекта
        arrayList.remove(index);
        System.out.println(arrayList);
    }
}
