package me.squidxtv.basics.exercises;

/**
 * Exercise 2: Leap Year Verification
 * 
 * In this exercise, we need to verify if a year is a leap year.
 * This will use logical and relational operators as well as if-statements.
 * 
 * The rules for a leap year are:
 * 1. The year is divisible by 4
 * 2. Exception: If the year is divisible by 100, it is not a leap year
 * 3. Exception to the exception: If the year is divisible by 400, it is a leap year
 */
public class Exercise02_LeapYear {
    
    /**
     * Checks if a year is a leap year.
     * 
     * @param year The year to check
     * @return true if it is a leap year, otherwise false
     */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
    
    public static void main(String[] args) {
        // Examples for different years
        int[] years = {2000, 2020, 2021, 2022, 2024, 1900, 2100};
        
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}