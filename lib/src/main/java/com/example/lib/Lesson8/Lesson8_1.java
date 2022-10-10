package com.example.lib.Lesson8;

import java.io.FileNotFoundException;

public class Lesson8_1 {

    public static void main(String[] args){
        try {
            trowUnCheckedException();
        }catch (NullPointerException e){
         System.out.println(e.getLocalizedMessage());
        }
        try {
            throwCheckedException();
        } catch (FileNotFoundException e){
            System.out.println("handle checked exception");
        }
    }
    static void trowUnCheckedException() throws NullPointerException{
        throw new NullPointerException("runTime");
    }
    static void throwCheckedException() throws FileNotFoundException{
        throw new FileNotFoundException("compileTime");
    }
}
