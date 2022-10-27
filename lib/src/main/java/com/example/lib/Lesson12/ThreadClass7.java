package com.example.lib.Lesson12;

public class ThreadClass7 {
    public static void main(String[] args) throws InterruptedException {
     ThreadClass8 threadClass8 = new ThreadClass8();
     threadClass8.start();
        long start = System.currentTimeMillis();
        System.out.println("Called in thread: " + Thread.currentThread().getName() + " " + start);
    }
}
class ThreadClass8 extends Thread{
    private int count;
    @Override
    public void run() {
        try {
            sleep(2000);

            long start = System.currentTimeMillis();
            Thread thread = Thread.currentThread();
            System.out.println("I'm run this code in: " + thread.getName() + " " + start);
        } catch (Exception e){
            System.out.println("exc thrown");
        }
    }
}