package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise05b_Test {
    
    private static final double DELTA = 0.01; // Tolerance for floating-point comparisons (larger due to accumulated rounding)
    
    @Test
    public void testBasicScenarios() {
        // Basic scenarios with initial capital and monthly contributions
        assertEquals(8112.30, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.05, 5), DELTA);
        assertEquals(34764.92, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.03, 10), DELTA);
    }
    
    @Test
    public void testOnlyInitialCapital() {
        // Only initial capital, no monthly contributions
        assertEquals(1283.36, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 0.0, 0.05, 5), DELTA);
        assertEquals(6746.77, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 0.0, 0.03, 10), DELTA);
    }
    
    @Test
    public void testOnlyMonthlyContributions() {
        // Only monthly contributions, no initial capital
        assertEquals(6828.94, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(0.0, 100.0, 0.05, 5), DELTA);
        assertEquals(28018.15, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(0.0, 200.0, 0.03, 10), DELTA);
        assertEquals(14561.5, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(0.0, 150.0, 0.04, 7), DELTA);
    }
    
    @Test
    public void testZeroInterest() {
        // Zero interest rate (just sum up the contributions)
        assertEquals(7000.0, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.0, 5), DELTA);
        assertEquals(29000.0, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.0, 10), DELTA);
    }
    
    @Test
    public void testShortPeriod() {
        // Short investment period (1 year)
        assertEquals(2284.16, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.05, 1), DELTA);
        assertEquals(7591.44, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.03, 1), DELTA);
    }
    
    @Test
    public void testLongPeriod() {
        // Long investment period (30 years)
        assertEquals(88040.38, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.05, 30), DELTA);
        assertEquals(129122.96, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.03, 30), DELTA);
    }
    
    @Test
    public void testHighInterestRate() {
        // High interest rate
        assertEquals(9453.55, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.10, 5), DELTA);
        assertEquals(47931.34, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.08, 10), DELTA);
    }
    
    @Test
    public void testNegativeInterestRate() {
        // Negative interest rate (can occur in some economies)
        assertEquals(6801.18, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, -0.01, 5), DELTA);
        assertEquals(27353.03, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, -0.01, 10), DELTA);
    }
    
    @Test
    public void testZeroPeriod() {
        // Zero years (should return just the initial capital)
        assertEquals(1000.0, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(1000.0, 100.0, 0.05, 0), DELTA);
        assertEquals(5000.0, Exercise05b_SavingsPlanCalculator.calculateSavingsPlan(5000.0, 200.0, 0.03, 0), DELTA);
    }
}