package com.example.lib.Lesson12;

public class ThreadClass5 {
    public static void main(String[] args) {
        ThreadClass6 threadClass6 = new ThreadClass6();

        Thread thread = new Thread(threadClass6);
        thread.start();

        try {
            thread.join();
        } catch (Exception e) {
        }

        Thread thread1 = new Thread(threadClass6);
        thread1.start();

    }
}

class ThreadClass6 extends Thread {

    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(count + " ");
        }
    }
}
