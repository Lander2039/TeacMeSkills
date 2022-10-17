package com.example.lib.Lesson10;

import java.util.HashSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lesson10_2 {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
//        sortedSet.add("banana");

        System.out.println(sortedSet);


        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Olga"));
        hashSet.add(new Student("Olga"));
        hashSet.add(new Student("Masha"));
        hashSet.add(new Student("Sasha"));

        System.out.println(hashSet.size());
    }
}

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
