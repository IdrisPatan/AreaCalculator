package com.example;

public class EquilateralTriangle implements Shape {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3.0)/4 * Math.pow(side, 2.0);
    }
}
