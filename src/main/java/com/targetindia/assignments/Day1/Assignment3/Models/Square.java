package com.targetindia.assignments.Day1.Assignment3.Models;

public class Square extends Rectangle implements GeometricShape{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        double side = super.getWidth();
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        String sup = super.toString();
        String curr = "A Square with side = " + getSide() + ", which is a subclass of ";
        String res = curr + sup;
        return res;
    }
}
