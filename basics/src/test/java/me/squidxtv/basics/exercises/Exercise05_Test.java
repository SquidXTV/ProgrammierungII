package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise05_Test {
    
    private static final double DELTA = 0.01; // Tolerance for floating-point comparisons
    
    @Test
    public void testBasicExamples() {
        // Basic examples
        assertEquals(1276.28, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, 0.05, 5), DELTA);
        assertEquals(6719.58, Exercise05_InterestCalclator.calculateCompoundInterest(5000.0, 0.03, 10), DELTA);
    }
    
    @Test
    public void testZeroInterest() {
        // Zero interest
        assertEquals(1000.0, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, 0.0, 5), DELTA);
        assertEquals(5000.0, Exercise05_InterestCalclator.calculateCompoundInterest(5000.0, 0.0, 10), DELTA);
    }
    
    @Test
    public void testZeroYears() {
        // Zero years
        assertEquals(1000.0, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, 0.05, 0), DELTA);
        assertEquals(5000.0, Exercise05_InterestCalclator.calculateCompoundInterest(5000.0, 0.03, 0), DELTA);
    }
    
    @Test
    public void testHighInterestRates() {
        // High interest rates
        assertEquals(2488.32, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, 0.20, 5), DELTA);
        assertEquals(26751.25, Exercise05_InterestCalclator.calculateCompoundInterest(5000.0, 0.15, 12), DELTA);
    }
    
    @Test
    public void testLongTermInvestment() {
        // Long-term investments
        assertEquals(4321.94, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, 0.05, 30), DELTA);
        assertEquals(9602.04, Exercise05_InterestCalclator.calculateCompoundInterest(2000.0, 0.04, 40), DELTA);
    }
    
    @Test
    public void testNegativeInterest() {
        // Negative interest (can occur in reality)
        assertEquals(773.78, Exercise05_InterestCalclator.calculateCompoundInterest(1000.0, -0.05, 5), DELTA);
        assertEquals(3687.12, Exercise05_InterestCalclator.calculateCompoundInterest(5000.0, -0.03, 10), DELTA);
    }
}