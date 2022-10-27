package com.example.lib.Lesson12;

public class ThreadClass {
    public static void main(String[] args) {
//Первый способ создания потоков
        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();

        ThreadClass2 threadClass2 = new ThreadClass2();

        Thread thread1 = new Thread(threadClass2); // ПРЕДАЕМ В НОВЫЙ ПОТОК КЛАСС С ИНТЕРФЕЙСОМ
        thread1.start();
//        Второй способ создания потоков, через создание анонимного класса и переопледиления логиги которая будет выполняться на втором потоке
        ThreadClass3 threadClass3 = new ThreadClass3() {
            @Override
            public void run() {
                super.run();
                System.out.println("Run in Thread in anonym class");
            }
        };
        threadClass3.start();
//        Третий способ, если нужен без класса
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("I'm running in thread");
            }
        };
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in runnable");
            }
        };

        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}

class ThreadClass1 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}

class ThreadClass3 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass4 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}