/**
 * 类的继承、抽象类，抽象方法的使用还不熟悉。
 */

package com.ruimeng.Day14.CarRental;

public abstract class MotoVehicle {
    private String no;
    private String brand;
    private String color;
    private float mileage;
    private float dailyRent;

    public MotoVehicle() {
    }

    public MotoVehicle(String no, String brand, String color, float mileage, float dailyRent) {
        this.no = no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.dailyRent = dailyRent;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public void setDailyRent(float dailyRent) {
        this.dailyRent = dailyRent;
    }

    public String getNo() {
        return no;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public float getMileage() {
        return mileage;
    }

    public float getDailyRent() {
        return dailyRent;
    }

    public abstract float calcRent(int days);
}
