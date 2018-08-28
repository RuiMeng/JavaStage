package com.ruimeng.Day10;

public class PhoneInfo {
    private String productName;
    private double weight;
    private int memSize;
    private double price;

    public PhoneInfo(String productName, double weight, int memSize, double price) {
        this.productName = productName;
        this.weight = weight;
        this.memSize = memSize;
        this.price = price;
    }

    public void show() {
        System.out.println("商品名称（productName）：" + this.productName);
        System.out.println("商品毛重（weight）：" + this.weight);
        System.out.println("机身内存（memSize）：" + this.memSize);
        System.out.println("价格（price）：" + this.price);
    }

    public static void main(String[] args) {
        System.out.println("PhoneInfo");

        PhoneInfo phoneInfo = new PhoneInfo("iPhone7", 390, 32, 4799);
        phoneInfo.show();
    }

}
