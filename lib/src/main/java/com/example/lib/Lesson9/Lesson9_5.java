package com.example.lib.Lesson9;

public class Lesson9_5 {
    public static void main(String[] args) {
        int[][] massive2D = new int[][]{{1, 2, 3}, {4, 5, 6}};

        for (int massive1D = 0; massive1D < massive2D.length; massive1D++) {
            for (int element = 0; element < massive2D[massive1D].length; element++) {
                System.out.print(massive2D[massive1D][element] + "\t");// "\t" это вывод таблицы
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int[] massive1D : massive2D) {
            for (int element : massive1D) {
                System.out.print(element + " ");
            }

        }
        System.out.println("\n");
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for (int massive1D = 0; massive1D < numbers.length; massive1D++) {
            for (int elements = 0; elements < numbers[massive1D].length; elements++) {
                System.out.print(numbers[massive1D][elements] + "\t");
            }
            System.out.println();
        }
        String[][] devs = new String[][]{
                {"IOS", "Android", "Flutter"},
                {"Developer"},
                {},
                {}
        };
        System.out.println("I am " + devs[0][1] + " " + devs[1][0]);

    }
}
