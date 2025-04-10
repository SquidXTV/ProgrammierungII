package me.squidxtv.basics.exercises;

import java.util.Arrays;

/**
 * Exercise 7: Array Sorting
 * 
 * In this exercise, an array of numbers needs to be sorted.
 * This will use arrays, loops, and comparison operators.
 * 
 * Implement the Bubble Sort algorithm to sort the array.
 */
public class Exercise07_ArraySorting {
    
    /**
     * Sorts an array of numbers using the Bubble Sort algorithm.
     * 
     * @param numbers The array to be sorted
     * @return The sorted array (in ascending order)
     */
    public static int[] bubbleSort(int[] numbers) {
        int[] sorted = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }
    
    public static void main(String[] args) {
        // Example arrays to sort
        int[] numbers1 = {5, 3, 8, 1, 9, 2, 7, 4, 6};
        int[] numbers2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Sort and display
        System.out.println("Original: " + Arrays.toString(numbers1));
        System.out.println("Sorted: " + Arrays.toString(bubbleSort(numbers1)));
        
        System.out.println("\nOriginal: " + Arrays.toString(numbers2));
        System.out.println("Sorted: " + Arrays.toString(bubbleSort(numbers2)));
        
        System.out.println("\nOriginal: " + Arrays.toString(numbers3));
        System.out.println("Sorted: " + Arrays.toString(bubbleSort(numbers3)));
    }
}