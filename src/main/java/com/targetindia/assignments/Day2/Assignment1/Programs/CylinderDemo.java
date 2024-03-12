package com.targetindia.assignments.Day2.Assignment1.Programs;

import com.targetindia.assignments.Day2.Assignment1.Models.Circle;
import com.targetindia.assignments.Day2.Assignment1.Models.Cylinder;

public class CylinderDemo {
    public static void main(String[] args) {
        Circle[] circles = {new Cylinder(12.34), new Cylinder(12.34, 10), new Cylinder(12.34, 10, "blue")};

        for(var c : circles) {
            double area = c.getArea();
            double volume = c.getVolume();

            System.out.printf("The area of the circular region is %f\n", area);
            System.out.printf("The volume of the cylinder is %f\n", volume);
            System.out.println();
        }
    }
}
