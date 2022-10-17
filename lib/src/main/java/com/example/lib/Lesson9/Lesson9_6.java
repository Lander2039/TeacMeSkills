package com.example.lib.Lesson9;

import java.util.Arrays;

public class Lesson9_6 {

    public static void main(String[] args) {

        int[][][] numbers = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9}
                }
        };
        for (int[][] number2D : numbers){
            for (int [] numbers1D : number2D){
                for (int number: numbers1D){
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int number2D = 0; number2D<numbers.length;number2D++){
            for (int number1D = 0; number1D< numbers[number2D].length; number1D++){
                for (int numbers1 = 0; numbers1 <numbers[number2D][number1D].length; numbers1++){
                    System.out.print(numbers[number2D][number1D][numbers1] + "\t");
                }
                System.out.println();
            }
        }

    }
}
