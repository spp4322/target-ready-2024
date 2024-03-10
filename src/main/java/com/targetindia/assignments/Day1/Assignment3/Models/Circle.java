package com.targetindia.assignments.Day1.Assignment3.Models;

public class Circle extends Shape implements GeometricShape{
    private double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public String toString() {
        String sup = super.toString();
        String curr = "A Circle with radius = " + radius + ", which is a subclass of ";
        String res = curr + sup;
        return res;
    }
}
