package com.example.lib.Lesson9;

import java.util.Arrays;

public class Lesson9_2 { // Сортировка вставками
    public static void main(String[] args) {
        int[] massive = {11, 3, 14, 16, 7};

        for (int i = 1; i < massive.length; i++) {
            int current = massive[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive[newValue]) {
                massive[newValue + 1] = massive[newValue];
                newValue--;
            }
            massive[newValue + 1] = current;
            System.out.println(Arrays.toString(massive));
        }
    }
}
