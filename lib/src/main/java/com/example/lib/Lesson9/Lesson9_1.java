package com.example.lib.Lesson9;

import java.util.Arrays;

public class Lesson9_1 { // Сортировка пузырьком

    public static void main(String[] args) {
        int[] massive = {1, 5, -3, 17, 3, 2, 13};
        System.out.println(Arrays.toString(massive));
        boolean isSorter = false;
        int buffer;

        while (!isSorter) {
            isSorter = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) { // если поменять знак то будет на уменьшение
                    isSorter = false;

                    buffer = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = buffer;
                }
            }
            System.out.println(Arrays.toString(massive));
        }
    }
}
