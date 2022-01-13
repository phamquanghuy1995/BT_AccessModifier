package com.huy;

public class TestCircle extends Circle {
    private double Height = 10.0;

    public TestCircle() {
    }

    public TestCircle(String color, Double radius, double height) {
        super(color, radius);
        Height = height;
    }

    public TestCircle(double height) {
        Height = height;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ",Height=" + Height +
                '}';
    }
}
