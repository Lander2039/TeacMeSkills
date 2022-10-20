package com.example.lib.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson10_3 {
    public static void main(String[] args) {

        Object[] numbers = {3, 1, 4, 6, 2, 5, 7, 9, 8};
        List arrayList = new ArrayList(Arrays.asList(numbers));
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        arrayList.toArray();

        for (int value = 0; value<arrayList.size(); value++){
            System.out.print(arrayList.get(value) + " ");
        }
    }
}
