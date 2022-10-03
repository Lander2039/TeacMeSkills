package com.example.lib;

public class GetteraAndSetter {

    public static void main(String[] args){ // создаем объект магазин
        Shop shop = new Shop();
        shop.setAge(10); // водим возраст
    }
}

class Shop {
    private int age = 0; //1

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
            sellAlcohol();
        } else {
            System.out.println("you are a child " + getAge());
        }
    }

    public int getAge(){
        return age;
    }

    void sellAlcohol(){
        if(age!=0){
            System.out.println("vodka sold " + getAge());
        }
}
}

