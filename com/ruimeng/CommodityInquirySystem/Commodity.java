package com.ruimeng.CommodityInquirySystem;

public class Commodity implements Comparable<Commodity> {

    private int cNo;
    private String cName;
    private String cType;
    private float cPrice;

    public Commodity() {
    }

    public Commodity(int cNo, String cName, String cType, float cPrice) {
        this.cNo = cNo;
        this.cName = cName;
        this.cType = cType;
        this.cPrice = cPrice;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public void setcPrice(float cPrice) {
        this.cPrice = cPrice;
    }

    public int getcNo() {
        return cNo;
    }

    public String getcName() {
        return cName;
    }

    public String getcType() {
        return cType;
    }

    public float getcPrice() {
        return cPrice;
    }

    /**
     * 打印商品信息
     */
    public void show() {

        System.out.println(String.format("%03d\t\t%s\t\t%s\t\t%.2f", cNo, cName, cType, cPrice));
    }

    @Override
    public int compareTo(Commodity o) {
        if (o.getcPrice() > this.getcPrice()) {
            return -1;
        } else if (o.getcPrice() == this.getcPrice()) {
            return 0;
        } else {
            return 1;
        }
    }

}
