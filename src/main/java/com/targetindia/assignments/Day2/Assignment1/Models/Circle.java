package com.targetindia.assignments.Day2.Assignment1.Models;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public String toString() {
        String res = "Circle[radius = " + radius + " color = " + color + " ]";
        return res;
    }

    public double getVolume() {
        return 1.0;
    }
}
