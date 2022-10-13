package com.example.lib.Lesson9;

import java.util.Arrays;

public class Lesson9 {

    public static void main(String[] args) {
        String[] massive = {"Hello", "bye", "world"};
        int[] massive2 = new int[5];
        massive2[0] = 1;
        massive2[1] = 2;
        massive2[2] = 3;
        massive2[3] = 4;
        massive2[4] = 5;
        String[] massive3 = new String[]{"Hello", "bye", "world", "country"};
        System.out.println(massive3[3]);

        for (String s : massive) {
            System.out.println(s + "\n");
        }
        for (int j : massive2) {
            System.out.println(j + "\n");
        }
        int[] massive4 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i <= massive4.length - 1; i++) {
            System.out.println(massive4[i] + " ");
        }
        Arrays.sort(massive4); // сортировка массива
        System.out.println("\n");
        for (int i = 0; i <= massive4.length - 1; i++) {
            System.out.println(massive4[i] + " ");
        }
        System.out.println(); // поиск значения массива,только после сортировки
        int index = Arrays.binarySearch(massive4, 33);
        System.out.println(index);

        String mass = Arrays.toString(massive4); // Вывод массива через стринг
        System.out.println(mass);

        for (int element : massive4) { // Способы перебора массива. Вывод массива  - -17, 0, 1,
            System.out.println(element + " ");
        }
        int[] temp = new int[]{16, -17, 22, 0, 21, 33, 5, 4, -7}; // Найти среднюю температуру
        double averageTemp;
        int sumOfTemp = 0;
        for (int j : temp) {
            sumOfTemp += j;
        }
        averageTemp = (double) sumOfTemp / temp.length;
        System.out.println("Average temperature " + averageTemp);

        int[] mass2 = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13}; // Найти максимальное и минимальное значение массива
        Arrays.sort(mass2);
        System.out.println("Min " + mass2[0]);
        System.out.println("Max " + mass2[mass2.length - 1]);

    }
}

