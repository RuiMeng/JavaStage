package com.ruimeng.Day14.CarRental;

import java.util.Scanner;

public class CarRentalCompany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎您来到汽车租赁公司！");

        int day1;
        do {
            System.out.print("请输入要租赁的天数：");
            day1 = sc.nextInt();
        } while (day1 < 1);

        MotoVehicle moto;
        int userInput;
        do {
            System.out.print("请输入要租赁的汽车类型(1、轿车; 2、客车)：");
            userInput = sc.nextInt();
        } while (userInput != 1 && userInput != 2);

        if (1 == userInput) {
            moto = new Car();
            do {
                System.out.print("请输入要租赁的汽车品牌（1、宝马; 2、别克）：");
                userInput = sc.nextInt();
            } while (userInput != 1 && userInput != 2);
            if (1 == userInput) {
                moto.setBrand("宝马");
                do {
                    System.out.print("请输入要租赁的轿车型号(1、550i)：");
                    userInput = sc.nextInt();
                } while (userInput != 1);
                if (1 ==  userInput) {
                    ((Car) moto).setType("550i");
                    moto.setDailyRent(500);
                }
            } else {
                moto.setBrand("别克");
                do {
                    System.out.print("请输入要租赁的轿车型号(1、商务舱GL8; 2、林荫大道)：");
                    userInput = sc.nextInt();
                } while (userInput != 1 && userInput != 2);
                if (1 == userInput) {
                    ((Car) moto).setType("商务舱GL8");
                    moto.setDailyRent(600);
                } else {
                    ((Car) moto).setType("林荫大道");
                    moto.setDailyRent(300);
                }
            }
        } else {
            moto = new Bus();
//            Bus bus = (Bus)moto;
            do {
                System.out.print("请输入要租赁客车的载客数：");
                userInput = sc.nextInt();
            } while (userInput < 1);
            if (userInput <= 16) {
                ((Bus) moto).setSeatCount(userInput);
                moto.setDailyRent(800);
            } else {
                ((Bus) moto).setSeatCount(userInput);
                moto.setDailyRent(1500);
            }
        }

        System.out.println("顾客您好！您需要支付的租赁费用是" + moto.calcRent(day1));


        Customer cust = new Customer("RuiMeng");
        MotoVehicle[] motos = new MotoVehicle[4];
        motos[0] = new Car("京NY28588", "宝马", "", 0, 500, "550i");
        motos[1] = new Car("京NNN3285", "宝马", "", 0, 500, "550i");
        motos[2] = new Car("京NY28588", "别克", "", 0, 300, "林荫大道");
        motos[3] = new Bus("陕A666666", "金杯", "", 0, 40);

        cust.setMotos(motos);
        cust.motosShow();
        int day2;
        do {
            System.out.print("请输入要租赁的天数：");
            day2 = sc.nextInt();
        } while (day2 < 1);
        System.out.println("客户名：" + cust.getName() + "\t租赁天数：" + day2 + "\t租赁总费用：" + cust.calcTotalRent(day2));
    }
}
