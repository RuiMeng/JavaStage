package com.ruimeng.Day20;

public class EvenNumPrint {

    private static Integer number = 100;
    private static final String lock = "";

    public static void main(String[] args) {

        Runnable runnable = () -> {
            while (true) {
                synchronized (lock) {
                    if (number > 0) {
                        System.out.println(Thread.currentThread().getName() + " : " + number);
                        number -= 2;
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (number < 1) {
                    break;
                }
            }
        };

        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (number > 0) {
                        System.out.println(Thread.currentThread().getName() + " : " + number);
                        number -= 2;
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (number < 1) {
                    break;
                }
            }
        }, "thread_1");

        Thread thread2 = new Thread(runnable, "thread_2");

        thread1.start();
        thread2.start();
    }
}
