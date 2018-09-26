/**
 * 为了便于观察运行，将闪烁时间改小
 */

package com.ruimeng.Day20;

public class LightTwinkle {
    private static final String lock = "";
    private static boolean greenLighted = true;


    public static void main(String[] args) {

        Thread redLight = new Thread(() -> {

            while (true) {
                // 如果绿灯允许红灯闪烁，我就开始闪烁
                synchronized (lock) {

                    if (greenLighted) {

                        greenLighted = false;
                        for (int i = 0; i < 10; i++) {
                            System.out.println(" : 红灯闪烁。");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "红灯线程");

        Thread greenLight = new Thread(() -> {

            while (true) {
                synchronized (lock) {

                    if (!greenLighted) {
                        for (int i = 0; i < 3; i++) {
                            System.out.println(" : 黄灯闪烁。");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        for (int i = 0; i < 10; i++) {
                            System.out.println(" : 绿灯闪烁。");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        greenLighted = true;
                    } else {
                        lock.notify();
                    }
                }
            }
        }, "绿灯线程");

        redLight.start();
        greenLight.start();
    }
}
