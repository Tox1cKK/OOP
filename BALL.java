package ru.mirea.lab2;

public class BALL {
    private double X = 0.0;
    private double Y = 0.0;
    public BALL(){}
    public BALL(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
    public void setXY(double x, double y){
        X = x;
        Y = y;
    }
    public void move( double XDisp, double YDisp) {
        X += XDisp;
        Y += YDisp;
    }

    @Override
    public String toString() {
        return "BALL{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}