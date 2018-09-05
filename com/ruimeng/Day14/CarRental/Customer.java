package com.ruimeng.Day14.CarRental;

public class Customer {

    private int id;
    private String name;
    private MotoVehicle motos[];

    public Customer(String name) {
        this.name = name;
        this.id = (int)((Math.random()*9+1)*1000);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MotoVehicle[] getMotos() {
        return motos;
    }

    public void setMotos(MotoVehicle[] motos) {
        this.motos = motos;
    }

    public void motosShow() {
        System.out.println("汽车牌号\t汽车品牌");
        for (MotoVehicle moto : this.motos) {
            System.out.println(moto.getNo() + "\t" + moto.getBrand());
        }
    }

    public float calcTotalRent(int days) {

        float rentSummary = 0;
        for (MotoVehicle moto : this.motos) {
            rentSummary += moto.calcRent(days);
        }

        return rentSummary;
    }
}
