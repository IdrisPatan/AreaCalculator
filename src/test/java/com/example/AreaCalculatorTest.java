package com.example;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.pow;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AreaCalculatorTest {

    private AreaCalculator areaCalculator;

    @Before
    public void setUp(){
        areaCalculator = new AreaCalculator();
    }

    @Test
    public void testCircle() {
        Shape[] shapes = {new Circle(5.0), new Circle(10.0)};
        double expected = pow(5.0, 2.0) * Math.PI + pow(10.0, 2.0) * Math.PI;
        assertThat(areaCalculator.Area(shapes), is(expected));

    }

    @Test
    public void testRectangle() {
        Shape[] shapes = {new Rectangle(5.0, 2.0), new Rectangle(6.0, 4.0)};
        double expected = 34.0;
        assertThat(areaCalculator.Area(shapes), is(expected));
    }

    @Test
    public void testEquilateralTriangle() {
        Shape[] shapes = {
                new EquilateralTriangle(5.0),
                new EquilateralTriangle(4.0)
        };
        double expected = Math.sqrt(3.0) / 4 * Math.pow(5.0, 2.0)
                + Math.sqrt(3.0) / 4 * Math.pow(4.0, 2.0);

        assertThat(areaCalculator.Area(shapes), is(expected));
    }

    @Test
    public void testCircle_EquilateralTriangle_Rectangle() {
        Shape[] shapes = {
                new EquilateralTriangle(5.0),
                new Rectangle(5.0, 2.0),
                new Circle(5.0)
        };

        double expected = Math.sqrt(3.0) / 4 * Math.pow(5.0, 2.0)
                + 10 + Math.PI * pow(5.0 , 2);

        assertThat(areaCalculator.Area(shapes), is(expected));
    }
}
