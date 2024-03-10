package com.targetindia.assignments.Day1.Assignment3.Models;

public class Shape implements GeometricShape{
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String res = "A Shape with color of ";
        res += color;

        if(filled) {
            res += " and filled";
        }
        else {
            res += " and not filled";
        }

        return res;
    }

    public double getArea() {
        return 1.0;
    }

    public double getPerimeter() {
        return 1.0;
    }
}
