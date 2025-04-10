package me.squidxtv.basics.exercises;

/**
 * Exercise 6: Palindrome Checker
 * 
 * In this exercise, we need to check if a text is a palindrome.
 * A palindrome is a word that reads the same forward and backward.
 * In this palindrome checker, capitalization and spaces are ignored.
 * 
 * Examples of palindromes:
 * - "Anna"
 * - "Otto"
 * - "Reliefpfeiler"
 */
public class Exercise06_PalindromeChecker {
    
    /**
     * Checks if a text is a palindrome.
     * Capitalization and spaces are ignored.
     * 
     * @param text The text to check
     * @return true if the text is a palindrome, otherwise false
     */
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll(" ", "");

        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isPunctuation(chars[left])) {
                left++;
                continue;
            }

            if (isPunctuation(chars[right])) {
                right--;
                continue;
            }

            if (chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isPunctuation(char ch) {
        return ".,;:?!".contains(String.valueOf(ch));
    }

    public static void main(String[] args) {
        // Examples of palindromes and non-palindromes
        String[] texts = {
            "Anna",
            "Otto",
            "Reliefpfeiler",
            "Hallo Welt",
            "Java ist cool"
        };
        
        for (String text : texts) {
            if (isPalindrome(text)) {
                System.out.println("\"" + text + "\" is a palindrome.");
            } else {
                System.out.println("\"" + text + "\" is not a palindrome.");
            }
        }
    }
}