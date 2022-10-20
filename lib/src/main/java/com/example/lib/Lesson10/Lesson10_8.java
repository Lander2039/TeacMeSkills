package com.example.lib.Lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson10_8 {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Sasha",18));
        arrayList.add(new Person("Dima", 10));
        arrayList.add(new Person("Olya",15));
        arrayList.add(new Person("Sasha",55));
        arrayList.add(new Person("Masha",21));

        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(
                        Integer.valueOf(t1.getAge())
                );
            }
        });
        System.out.println();
        for (Person person : arrayList){
            System.out.println(person.getAge());
        }
    }
}
class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}