package com.example.lib.Lesson7;

public class Lesson7_2 { // Объект как параметр ввода
    public static void main(String[] args){
        Parent parent = new Parent();
        Mum mum = new Mum();
        checkType(mum);
        Lesson7_2 lesson7_2 = new Lesson7_2();
        System.out.println(lesson7_2.getName());
    }

    String getName(){
        return "Name can't be empty";
    }

    static void checkType(Object object){
        if (object instanceof Mum){
            ((Mum) object).slip();
        }else {
            System.out.println("not parent");
        }
    }
}
class Parent{
    void walk(){
        System.out.println("parent walk");
    }
}
class Dad extends Parent{
    @Override
    void walk() {
        System.out.println("dad walk");
    }
}
class Mum extends Parent{
    @Override
    void walk() {
        System.out.println("mum walk");
    }
    void slip(){
        System.out.println("mum is slip");
    }
}
