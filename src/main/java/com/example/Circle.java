package com.example;

public class Circle implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return Math.pow(radius, 2.0) * Math.PI;
    }
}