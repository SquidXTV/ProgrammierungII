package me.squidxtv.oop.exercises.exercise05;

import java.util.List;

public class Date {

    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        if (year <= 0) {
            throw new IllegalArgumentException("Year must be greater than 0");
        }

        if (List.of(4, 6, 9, 11).contains(month) && day > 30) {
            throw new IllegalArgumentException("Day must be between 1 and 30 for given month");
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29) {
                    throw new IllegalArgumentException("Day must be between 1 and 29 for given month");
                }
            } else {
                if (day > 28) {
                    throw new IllegalArgumentException("Day must be between 1 and 28 for given month");
                }
            }
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String display() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%02d", day));
        builder.append(".");
        builder.append(String.format("%02d", month));
        builder.append(".");
        builder.append(String.format("%02d", year));
        return builder.toString();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return isLeapYear(year);
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

    public int getDaysInMonth() {
        if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        }

        if (List.of(4, 6, 9, 11).contains(month)) {
            return 30;
        }

        return 31;
    }

}
