package com.example.lib.Lesson7;

public class Lesson7_1 { // Внешний класс
    String publicVar = "Hello";
    static String staticVar = "HEllo";

    public static void main(String[] args){
        Lesson7_1 lesson7_1 = new Lesson7_1();
        lesson7_1.callInnerClass();
        Lesson7_1.callNestedClass();

    }
    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerClass + "inner class");

    }
    static void callNestedClass(){
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass.NestedAge + "nester class");
    }
    class InnerClass{ // Внутрений класс имеет дрступ к приватной переменной
        int innerClass = 18;
        void callOuterClassVariable(){
            // Создаем приватную переменную
            String privateVar = "Hello";
            System.out.println(privateVar);
            System.out.println(publicVar);

        }
    }
    static class NestedClass{ //Вложенный класс
        int NestedAge = 18;
        void callOuterClassVariable(){
//            System.out.println(privateVar);
            System.out.println(staticVar);
        }
    }
}
