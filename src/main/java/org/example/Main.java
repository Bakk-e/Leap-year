package org.example;

import java.util.Scanner;

public class Main {

    public static boolean isDivisible(int year, int divider) {
        return year % divider == 0;
    }

    public static boolean isLeapYear(int year) {
        if (isDivisible(year, 4)) {
            if (isDivisible(year, 100)) {
                return isDivisible(year, 400);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Please enter a year: ");
        number = sc.nextInt();
        System.out.printf("Is the year %s a leap year: %s", number, isLeapYear(number));
    }
}