package com.example.lib.lesson13;

public class ThreadDaemon {
    public static void main(String[] args) {
        ThreadClass2 threadClass2 = new ThreadClass2();
        threadClass2.setDaemon(true);
        threadClass2.start();
    }
}

class ThreadClass2 extends Thread{

    @Override
    public void run() {
        System.out.print("I'm a daemon thread "  + Thread.currentThread().isDaemon());
    }
}