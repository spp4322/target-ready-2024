package com.targetindia.assignments.Day1.Assignment3.Models;

public class Rectangle extends Shape implements GeometricShape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return  width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    public String toString() {
        String sup = super.toString();
        String curr = "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of ";
        String res = curr + sup;
        return res;
    }
}
