package ru.mirea.lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Лёлик",2);
        Dog d2 = new Dog("Болик", 5);
        Dog d3 = new Dog("Белка");
        Dog d4 = new Dog("Стрелка");
        d4.setAge(10);
        d3.setAge(3);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d4.intoHumanAge();
    }
}