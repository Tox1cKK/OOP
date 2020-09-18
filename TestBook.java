package ru.mirea.lab3;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Тихий Дон","Михаил Александрович Шолохов",1600,350);
        Book b2 = new Book("Гроза","Александр Николаевич Островский",350,100);
        Book b3 = new Book("Евгений Онегин","А.С.ПУШКИН",250,100);
        Book b4 = new Book("Война и Мир","Лев Николаевич Толстой",1300,200);
        System.out.println(b1);
        b1.GetPrice();
        b2.GetPrice();
        b3.GetPrice();
        b4.GetPrice();
    }
}
