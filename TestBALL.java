package ru.mirea.lab2;

import java.lang.*;
public class TestBALL {
    public static void main(String[] args) {
        BALL b1 = new BALL(100,100);
        BALL b2 = new BALL(0,0);
        BALL b3 = new BALL(1500,500);
        BALL b4 = new BALL(200,400);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(30,15);
        b2.move(25,15);
        b3.move(10,5);
        b4.move(1,4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}