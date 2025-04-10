package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise07_Test {
    
    @Test
    public void testRandomArray() {
        // Random array
        int[] input = {5, 3, 8, 1, 9, 2, 7, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testReverseOrderArray() {
        // Array in reverse order
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testAlreadySortedArray() {
        // Already sorted array
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testEmptyArray() {
        // Empty array
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testSingleElementArray() {
        // Array with a single element
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testDuplicateElements() {
        // Array with duplicates
        int[] input = {3, 5, 1, 3, 8, 5, 2, 5};
        int[] expected = {1, 2, 3, 3, 5, 5, 5, 8};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testNegativeNumbers() {
        // Array with negative numbers
        int[] input = {-5, -3, -8, -1, 0, 2, -7, 4, -6};
        int[] expected = {-8, -7, -6, -5, -3, -1, 0, 2, 4};
        assertArrayEquals(expected, Exercise07_ArraySorting.bubbleSort(input));
    }
    
    @Test
    public void testOriginalArrayNotModified() {
        // Check that the original array is not modified
        int[] input = {5, 3, 8, 1, 9};
        int[] original = Arrays.copyOf(input, input.length);
        Exercise07_ArraySorting.bubbleSort(input);
        assertArrayEquals(original, input);
    }
}