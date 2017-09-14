package com.example;

public class AreaCalculator {
    public double Area(Shape[] shapes) {
        double area = 0;

        for(Shape shape : shapes){
            area += shape.getArea();
        }

        return area;
    }
}