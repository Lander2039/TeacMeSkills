package com.example.lib.lesson13;

public class Synchronized {

    public static void main(String[] args) {
        CountThread2 countThread2 = new CountThread2();

        Thread thread = new Thread(countThread2);
        thread.start();

        Thread thread1 = new Thread(countThread2);
        thread1.start();
    }
}

class CountThread2 implements Runnable {

    private int count = 0;

    synchronized void changeValue(int addValue) {  // Синхронизинованый метод
        count = addValue;
        System.out.print(count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            changeValue(i);
        }
    }
}
