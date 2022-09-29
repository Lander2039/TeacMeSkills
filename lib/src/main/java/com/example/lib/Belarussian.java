package com.example.lib;

public class Belarussian extends Human {
    public static void main(String[] args){
        Belarussian belarussian = new Belarussian();
        German german = new German();
        belarussian.speakLanguage();
        german.speakLanguage();


    }

    @Override
    void speakLanguage() {
        System.out.println("speak belorissian Language");
    }
}

 class German extends Human{

     @Override
     void speakLanguage() {
         System.out.println("speak german Language");
     }
 }

abstract class Human {

    abstract void speakLanguage();
}