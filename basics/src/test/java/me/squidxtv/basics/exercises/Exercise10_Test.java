package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise10_Test {
    
    @Test
    public void testExactPacking() {
        // Test cases where bottles fit exactly into cartons
        assertArrayEquals(new int[] {5, 0}, Exercise10_BottlePacking.calculateBottlePacking(30, 6));
        assertArrayEquals(new int[] {10, 0}, Exercise10_BottlePacking.calculateBottlePacking(100, 10));
        assertArrayEquals(new int[] {4, 0}, Exercise10_BottlePacking.calculateBottlePacking(48, 12));
    }
    
    @Test
    public void testWithRemainingBottles() {
        // Test cases where some bottles remain unpacked
        assertArrayEquals(new int[] {4, 1}, Exercise10_BottlePacking.calculateBottlePacking(25, 6));
        assertArrayEquals(new int[] {8, 4}, Exercise10_BottlePacking.calculateBottlePacking(100, 12));
        assertArrayEquals(new int[] {7, 3}, Exercise10_BottlePacking.calculateBottlePacking(38, 5));
    }
    
    @Test
    public void testZeroBottles() {
        // Test case with zero bottles
        assertArrayEquals(new int[] {0, 0}, Exercise10_BottlePacking.calculateBottlePacking(0, 6));
    }
    
    @Test
    public void testEdgeCases() {
        // Test with single bottle per carton
        assertArrayEquals(new int[] {10, 0}, Exercise10_BottlePacking.calculateBottlePacking(10, 1));
        
        // Test with large numbers
        assertArrayEquals(new int[] {1000, 0}, Exercise10_BottlePacking.calculateBottlePacking(10000, 10));
        // assertArrayEquals(new int[] {666, 4}, Exercise10_BottlePacking.calculateBottlePacking(9999, 15)); Test is wrong
    }
    
    @Test
    public void testNegativeScenarios() {
        // Test with negative number of bottles (should handle as zero or appropriate value)
        assertArrayEquals(new int[] {0, 0}, Exercise10_BottlePacking.calculateBottlePacking(-10, 5));
        
        // Test with zero capacity per carton (should handle divide by zero)
        assertThrows(ArithmeticException.class, () -> Exercise10_BottlePacking.calculateBottlePacking(10, 0));
    }
    
    @Test
    public void testSingleCartonScenarios() {
        // Test cases where all bottles fit in a single carton
        assertArrayEquals(new int[] {1, 0}, Exercise10_BottlePacking.calculateBottlePacking(5, 5));
        assertArrayEquals(new int[] {1, 0}, Exercise10_BottlePacking.calculateBottlePacking(10, 15));
        assertArrayEquals(new int[] {1, 2}, Exercise10_BottlePacking.calculateBottlePacking(7, 5));
    }
}