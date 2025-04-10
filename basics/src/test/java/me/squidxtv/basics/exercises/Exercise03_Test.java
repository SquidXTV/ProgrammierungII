package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise03_Test {
    
    @Test
    public void testValidISBNs() {
        // Valid ISBN-10 numbers
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("3866801920"));
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("0262033844"));
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("0131103628"));
    }
    
    @Test
    public void testInvalidISBNs() {
        // Invalid ISBN-10 numbers
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("3866801921"));
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("0262033843"));
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("1234567891"));
    }
    
    @Test
    public void testISBNsWithX() {
        // Valid ISBN-10 with 'X' as the last digit
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("014103971X"));
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("123456789X"));
    }
    
    @Test
    public void testEdgeCases() {
        // Incorrect length
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("12345"));
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("12345678901"));
        
        // Invalid characters
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("386680192A"));
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("38668O1920")); // contains 'O' instead of '0'
        
        // 'X' at wrong position
        assertFalse(Exercise03_ISBN_Validator.isValidISBN10("X866801920"));
    }
    
    @Test
    public void testRealWorldExamples() {
        // Real books with valid ISBNs
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("0201310058")); // Effective Java
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("020161622X")); // The Pragmatic Programmer
        assertTrue(Exercise03_ISBN_Validator.isValidISBN10("0596007124")); // Head First Design Patterns
    }
}