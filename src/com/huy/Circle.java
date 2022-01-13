package com.huy;

public class Circle {
    private String color="yellow";
    private Double radius=3.0;

    public Circle() {
    }
    public Circle(String color, Double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' + ", radius=" + radius ;
    }
}
