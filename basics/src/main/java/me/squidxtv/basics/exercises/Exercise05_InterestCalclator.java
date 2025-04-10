package me.squidxtv.basics.exercises;

/**
 * Exercise 5: Interest Calculator
 * 
 * In this exercise, an interest calculator should be implemented that calculates the final value
 * of an investment after a certain period with compound interest.
 * This exercise uses loops and arithmetic operations with double values.
 * 
 * Formula: Final Value = Initial Value * (1 + Interest Rate)^Years
 */
public class Exercise05_InterestCalclator {
    
    /**
     * Calculates the final value of an investment with compound interest.
     * 
     * @param initialValue The initial value of the investment in Euro
     * @param interestRate The annual interest rate (as a decimal, e.g., 0.05 for 5%)
     * @param years The investment period in years
     * @return The final value after the given period
     */
    public static double calculateCompoundInterest(double initialValue, double interestRate, int years) {
        double interest = 1;
        for (int i = 0; i < years; i++) {
            interest *= 1 + interestRate;
        }

        return initialValue * interest;
    }
    
    public static void main(String[] args) {
        // Example: 1000€ for 5 years at 5% interest
        double initialValue = 1000.0;
        double interestRate = 0.05; // 5%
        int years = 5;
        
        double finalValue = calculateCompoundInterest(initialValue, interestRate, years);
        
        System.out.printf("An investment of %.2f€ at %.1f%% interest over %d years results in %.2f€.%n", 
                          initialValue, interestRate * 100, years, finalValue);
        
        // Another example: 5000€ for 10 years at 3% interest
        initialValue = 5000.0;
        interestRate = 0.03; // 3%
        years = 10;
        
        finalValue = calculateCompoundInterest(initialValue, interestRate, years);
        
        System.out.printf("An investment of %.2f€ at %.1f%% interest over %d years results in %.2f€.%n", 
                          initialValue, interestRate * 100, years, finalValue);
    }
}