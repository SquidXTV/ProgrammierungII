package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise04_Test {
    
    @Test
    public void testSmallPrimes() {
        // Small prime numbers
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(2));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(3));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(5));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(7));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(11));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(13));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(17));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(19));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(23));
    }
    
    @Test
    public void testNonPrimes() {
        // Non-prime numbers
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(4));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(6));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(8));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(9));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(10));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(12));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(15));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(21));
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(25));
    }
    
    @Test
    public void testLargerPrimes() {
        // Larger prime numbers
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(29));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(31));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(37));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(41));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(43));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(47));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(53));
        assertTrue(Exercise04_PrimeNumberTest.isPrimeNumber(97));
    }
    
    @Test
    public void testEdgeCases() {
        // Special cases
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(-7)); // Negative numbers are not prime numbers
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(0)); // 0 is not a prime number
        assertFalse(Exercise04_PrimeNumberTest.isPrimeNumber(1)); // 1 is by definition not a prime number
    }
}