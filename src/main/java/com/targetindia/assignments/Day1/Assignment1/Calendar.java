package com.targetindia.assignments.Day1.Assignment1;

public class Calendar {
    public static void main(String[] args) {
        int month = KeyboardUtil.getInt("Enter month ");
        int year = KeyboardUtil.getInt("Enter year ");

        boolean isValid = isValidDate(month, year);

        if(!isValid) {
            System.out.print("Enter a valid month and year.");
        }

        else {
            PrintCalendar.print(month, year);
        }
    }

    public static boolean isValidDate(int month, int year) {
        if(month < 1 || month > 12) {
            return false;
        }

        if(year < 0) {
            return false;
        }

        return true;
    }
}
