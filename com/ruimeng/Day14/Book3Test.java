package com.ruimeng.Day14;

public class Book3Test {

    public static void main(String[] args) {

        Book3 book1 = new Book3("JAVA 从入门到放弃", 200);
        Book3 book2 = new Book3("Python 从入门到放弃", "计算机", 150);

        book1.detail();
        book2.detail();
    }
}
