/**
 *
 * 看似多此一举，但是这样处理是节约了 CPU 的。
 */

package com.ruimeng.Day20;

public class TwoThreadPrint {

    private static boolean t2runned = false;
    private static final String lock = "";

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (t2runned) {
                        t2runned = false;
                        System.out.println(Thread.currentThread().getName() + " : 1");
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "线程 A");

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (!t2runned) {
                        t2runned = true;
                        System.out.println(Thread.currentThread().getName() + " : 2");
                    } else {
                        lock.notify();
                    }
                }
            }
        }, "线程 B");

        thread1.start();
        thread2.start();
    }
}
