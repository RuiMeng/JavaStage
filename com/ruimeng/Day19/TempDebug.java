package com.ruimeng.Day19;

abstract class Parent{

    abstract void show1();
}

class Test1 extends Parent {

    public void show1() {
        System.out.println("test1 类的 show1() 方法。");
    }
}

class Test2 extends Parent {

    public void show1() {
        System.out.println("test2 类的 show1() 方法。");
    }
    public static void main(String[] args){
        // 这里就是一个多态的表现
        Parent p1 = new Test1();
        p1.show1();
        p1 = new Test2();
        p1.show1();
    }
}