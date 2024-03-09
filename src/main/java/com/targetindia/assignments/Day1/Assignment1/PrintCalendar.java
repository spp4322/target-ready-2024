package com.targetindia.assignments.Day1.Assignment1;

public class PrintCalendar {
    public static void print(int month, int year) {
        int totDays = getTotDays(month, year);

        String[] day = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

        for(int k=0; k<7; k++) {
            System.out.print(day[k] + " ");
        }

        System.out.print("\n");
        System.out.print("   ");

        for(int k = 1; k <= totDays; k++) {
            if(k % 7 == 0) {
                System.out.print("\n");
            }

            if(k < 10) {
                System.out.print(" " + k + " ");
            }

            else {
                System.out.print(k + " ");
            }
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private static int getTotDays(int month, int year) {
        int totDays = 31;

        switch(month) {
            case 2:
                totDays = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                totDays = 30;
        }

        return totDays;
    }
}
