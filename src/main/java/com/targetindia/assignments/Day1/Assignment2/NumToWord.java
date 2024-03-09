package com.targetindia.assignments.Day1.Assignment2;

import java.util.Scanner;

public class NumToWord {
    private static String numToWord(int n, String s) {
        String[] one = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
        String[] tens = {"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
        String str = "";
        if (n > 19) {
            str += tens[n / 10] + one[n % 10];
        } else {
            str += one[n];
        }
        if (n != 0) {
            str += s;
        }
        return str;
    }

    public static void main(String[] args) {
        long n;
        System.out.print("give number:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextLong();
        String ans="";
        ans+=numToWord((int)(n/10000000),"crore ");
        ans+=numToWord((int)((n/100000)%100),"lakh ");
        ans+=numToWord((int)((n/1000)%100),"thousand ");
        ans+=numToWord((int)((n/100)%10),"hundred ");
        if(n>100 && n%100>0){
            ans+="and ";
        }
        ans+=numToWord((int)(n%100),"");

        System.out.println(ans);
    }
}
