package com.ruimeng.Day14;

import java.util.Scanner;

public class GoodsPrice {

    private String goodsName;
    private float price;

    public void initial() {
        int num = (int)(Math.random()*10);

        if (num < 4) {
            goodsName = "公主电动车";
            price = 2000;
        } else if (num < 7) {
            goodsName = "34 寸纯品彩电";
            price = 3000;
        } else {
            goodsName = "新飞电冰箱";
            price = 3400;
        }
        System.out.println(String.format("随机可购买的商品为：%s\t价格为：%.3f",goodsName, price));
    }

    public void guess() {

        Scanner sc =new Scanner(System.in);

        System.out.print("请猜测" + goodsName + "的价格:");
        for (int i = 0; i < 4; i++) {

            float priceInput = sc.nextFloat();

            if (priceInput == price) {
                System.out.println("猜对了！");
                break;
            } else {
                System.out.println(priceInput > price ? "再小点！！！" : "再大点！！！");
                System.out.print(i == 3 ? "不能再猜了~~\n" : "再猜一次吧：");
            }
        }
    }

    public static void main(String[] args) {
        GoodsPrice gPrice = new GoodsPrice();
        gPrice.initial();
        gPrice.guess();
    }
}