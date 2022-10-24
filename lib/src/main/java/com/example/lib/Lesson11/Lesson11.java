package com.example.lib.Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson11 {

    static Consumer<String> printUpperCase = str ->{
        System.out.print(str.toUpperCase() + " ");
    };

    public static void main(String[] args) {
        Stream<String> streamGenerate = Stream.generate(() -> "hello").limit(10);
        System.out.println(streamGenerate.collect(Collectors.toList()));

        IntStream intStream = IntStream.range(1, 10);
        System.out.println(Arrays.toString(intStream.toArray()));

        Stream<String> streamFilter = Stream.of("apple", "banana", "kiwi").filter(
                element -> element.contains("a")
        );
        System.out.println(streamFilter.findFirst());

        Stream<String> streamFilter2 = Stream.of("apple", "banana", "kiwi")
                .skip(2);
        System.out.println(streamFilter2.collect(Collectors.toList()));

        Stream<String> streamFilter3 = Stream.of("apple", "banana", "kiwi")
                .distinct();
        System.out.println(streamFilter3.collect(Collectors.toList()));

        Stream<String> streamMap = Stream.of("apple", "banana", "kiwi", "apple");
        String mappedString = streamMap.map(Objects::toString).collect(
                Collectors.joining(",")
        );
        System.out.println(mappedString);

        Stream<String> streamMap2 = Stream.of("apple", "banana", "kiwi", "apple");
        String mappedString2 = streamMap2.map(element -> element + " mapped").collect(
                Collectors.joining(",")
        );
        System.out.println(mappedString2);

        Stream<String> streamMap3 = Stream.of("apple", "banana", "kiwi", "apple");
        String mappedString3 = streamMap3.map(String::toUpperCase).collect(
                Collectors.joining(" / ")
        );
        System.out.println(mappedString3);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Yuri"));
        users.add(new User("Sasha"));
        users.add(new User("Tanya"));
        users.add(new User("Dima"));
        users.add(new User("Pasha"));

        for (User user : users){
            System.out.println(user.getName() + " ");
        }

        users.stream().map(User::getName).forEach((n) ->{
            System.out.print(n+ " ");
                });
        System.out.println();
        users.stream().map(User::getName).forEach(printUpperCase);
    }
}

class User {
    private final String name;
    User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {  // Переопределяем метод, что бы можно было бы выводить значения с коллекциии
        return name;
    }
}
