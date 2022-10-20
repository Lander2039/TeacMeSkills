package com.example.lib.Lesson10;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson10_4 {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.offer("hello"); // ставляет вконец очереди
        queue.offer("bye");
        queue.offer("world");
        queue.offer("hi");
        queue.add("start"); // в начало очериди
        queue.add("bye,bye");

        System.out.println(queue);

        System.out.println(queue.peek());
        queue.remove("world"); // удаление по значению
        System.out.println(queue.element()); // выводит первый элемент

        queue.poll(); // удаляет первый элемент

        System.out.println(queue);
    }
}
