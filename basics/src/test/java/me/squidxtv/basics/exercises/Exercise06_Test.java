package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise06_Test {
    
    @Test
    public void testSimplePalindromes() {
        // Simple palindromes
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Anna"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Otto"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Reliefpfeiler"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Rentner"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Rotor"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Reittier"));
    }
    
    @Test
    public void testPalindromesWithSpaces() {
        // Palindromes with spaces
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Trug Tim eine so helle Hose nie mit Gurt"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Sei fein, nie fies"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Eine treue Familie bei Lima feuerte nie"));
    }
    
    @Test
    public void testNonPalindromes() {
        // Non-palindromes
        assertFalse(Exercise06_PalindromeChecker.isPalindrome("Hallo Welt"));
        assertFalse(Exercise06_PalindromeChecker.isPalindrome("Java ist cool"));
        assertFalse(Exercise06_PalindromeChecker.isPalindrome("Programmierung"));
        assertFalse(Exercise06_PalindromeChecker.isPalindrome("Dies ist kein Palindrom"));
    }
    
    @Test
    public void testSpecialCases() {
        // Special cases
        assertTrue(Exercise06_PalindromeChecker.isPalindrome(""));  // Empty string
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("a"));  // Single letter
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("11"));  // Numbers
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("!!"));  // Special characters
    }
    
    @Test
    public void testCaseInsensitivity() {
        // Case insensitivity
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("AnNa"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("OtTo"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("ReLiEfPfEiLeR"));
    }
    
    @Test
    public void testWithPunctuation() {
        // With punctuation (which should also be ignored)
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("Able was I, ere I saw Elba"));
        assertTrue(Exercise06_PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
    }
}