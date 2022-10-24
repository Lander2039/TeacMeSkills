package com.example.lib.Lesson11;

import java.util.Optional;

public class Lesson11_2 {

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.empty();
        if (optional.isPresent()){
            System.out.println(optional.get());
        } else {
            System.out.println("no value");
        }
    }
}
