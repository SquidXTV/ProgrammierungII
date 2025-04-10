package me.squidxtv.basics.exercises;

/**
 * Exercise 3: ISBN Validator
 * 
 * In this exercise, an ISBN-10 number needs to be validated.
 * This will use loops, arithmetic operators, and modulo.
 * 
 * An ISBN-10 consists of 10 digits. The validity is checked as follows:
 * The last digit is a check digit. It can be 0-9 or 'X' (representing 10).
 * The checksum is calculated as follows:
 * (Digit1 * 10 + Digit2 * 9 + Digit3 * 8 + ... + Digit9 * 2 + CheckDigit * 1) % 11 = 0
 * 
 * Example: For the ISBN 3-86680-192-0, the checksum is:
 * 3*10 + 8*9 + 6*8 + 6*7 + 8*6 + 0*5 + 1*4 + 9*3 + 2*2 + 0*1 = 253
 * 253 % 11 = 0, so the ISBN is valid.
 */
public class Exercise03_ISBN_Validator {
    
    /**
     * Checks if an ISBN-10 is valid.
     * It is assumed that the input is already formatted (only digits and possibly X).
     * 
     * @param isbn The ISBN-10 to check (as a string without hyphens, 10 characters)
     * @return true if the ISBN is valid, otherwise false
     */
    public static boolean isValidISBN10(String isbn) {
        if (isbn.length() != 10) {
            return false;
        }

        int checksum = 0;
        char[] digits = isbn.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            char digit = digits[i];
            if (Character.isDigit(digit)) {
                checksum += Integer.parseInt(String.valueOf(digit)) * (10 - i);
            } else if (digit == 'X') {
                checksum += 10 * (10 - i);
            } else {
                return false;
            }
        }

        return checksum % 11 == 0;
    }
    
    public static void main(String[] args) {
        // Example of a valid ISBN-10
        String validISBN = "3866801920";
        System.out.println("ISBN " + validISBN + " is " + 
                          (isValidISBN10(validISBN) ? "valid." : "invalid."));
        
        // Example of an invalid ISBN-10
        String invalidISBN = "3866801921";
        System.out.println("ISBN " + invalidISBN + " is " + 
                          (isValidISBN10(invalidISBN) ? "valid." : "invalid."));
        
        // Example of an ISBN-10 with 'X' as the check digit
        String isbnWithX = "3866801199X";
        System.out.println("ISBN " + isbnWithX + " is " + 
                          (isValidISBN10(isbnWithX) ? "valid." : "invalid."));
    }
}