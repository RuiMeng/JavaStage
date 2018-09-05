package com.ruimeng.Day14.CarRental;

public final class Car extends MotoVehicle {

    private String Type;

    public Car() {
    }

    public Car(String no, String brand, String color, float mileage, float dailyRent, String type) {

        super(no, brand, color, mileage, dailyRent);
        Type = type;
    }

    public void setType(String type) {
        Type = type;
    }

    /**
     *
     * @param days 租赁的天数
     * @return 这辆车的总租赁价格。
     */
    @Override
    public float calcRent(int days) {

        return getDailyRent() * days;
    }
}
