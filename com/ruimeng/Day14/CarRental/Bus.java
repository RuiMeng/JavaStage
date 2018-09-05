package com.ruimeng.Day14.CarRental;

public final class Bus extends MotoVehicle {

    private int seatCount;

    public Bus() {
    }

    public Bus(String no, String brand, String color, float mileage, int seatCount) {
        super(no, brand, color, mileage, 0);
        this.seatCount = seatCount;
        setDailyRent(seatCount > 16 ? 1500 : 800);
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public float calcRent(int days) {

        return getDailyRent() * days;
    }
}
