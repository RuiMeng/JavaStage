package com.ruimeng.Day20;

public class ByTickets {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Thread thread1=new Thread(buyer, "buyer1");
        Thread thread2=new Thread(buyer, "buyer2");
        Thread thread3=new Thread(buyer, "buyer3");
        Thread thread4=new Thread(buyer, "buyer4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}


class Buyer implements Runnable {
    private static Integer tickets = 20;
    private static final String lock = "";

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "买到一张票。剩余 " + --tickets + " 张票");
                }
            }
            if (tickets <=0 ) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
