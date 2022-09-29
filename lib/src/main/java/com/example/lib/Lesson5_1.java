package com.example.lib;

public class Lesson5_1 {
    public static void main(String[] args){
        Friend friend = new Friend("Sasha", 30, "25/03/1992");
        Friend friend1 = new Friend("Sasha", 32);
//        friend.age = 30;
//        friend.name = "Sasha";
        friend.born();
        friend1.born();

    }
}
class Friend {

    private String name;
    private int age;
    private String birthdate;

    public Friend(String name2, int age2, String birthdate2) {
        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }
    public Friend(String name2, int age2){
            this.name = name2;
            this.age = age2;
    }

    void born() {
        String congr = "";

        if (birthdate == null || birthdate.isEmpty()) {
            congr = name + " has birthday on: " + birthdate + " " + "he is " + age + " years old";
        } else {
            congr = name + " has birthday on: " + birthdate + " " + "he is " + age + " years old";
        }
        System.out.println(name + " " + "he is " + age + " years old");
    }
    }

