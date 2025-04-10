package me.squidxtv.basics.exercises;

/**
 * Exercise 5b: Savings Plan Calculator
 * 
 * In this exercise, a savings plan calculator should be implemented that calculates
 * the final value of an investment with an initial capital, monthly contributions,
 * and compound interest over a certain period.
 * 
 * This exercise uses loops, arithmetic operations with double values, and more complex
 * financial calculations.
 * 
 * The formula for the final value is:
 * Initial Capital * (1 + Annual Interest Rate)^Years
 * + Monthly Contribution * ((1 + Monthly Interest Rate)^(Years*12) - 1) / Monthly Interest Rate
 * 
 * Where Monthly Interest Rate = Annual Interest Rate / 12
 */
public class Exercise05b_SavingsPlanCalculator {
    
    /**
     * Calculates the final value of a savings plan with compound interest and monthly contributions.
     * 
     * @param initialCapital The initial investment amount in Euro
     * @param monthlyContribution The amount contributed each month in Euro
     * @param annualInterestRate The annual interest rate (as a decimal, e.g., 0.05 for 5%)
     * @param years The investment period in years
     * @return The final value after the given period
     */
    public static double calculateSavingsPlan(double initialCapital, double monthlyContribution, 
                                             double annualInterestRate, int years) {
        // Return initial capital if investment period is 0
        if (years == 0) {
            return initialCapital;
        }
        
        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12.0;
        
        // Total number of months
        int totalMonths = years * 12;
        
        // Calculate final value using a loop approach
        double balance = initialCapital;
        
        for (int month = 1; month <= totalMonths; month++) {
            // Add the monthly contribution
            balance += monthlyContribution;
            
            // Apply the monthly interest
            balance *= (1 + monthlyInterestRate);
        }
        
        // Round to 2 decimal places
        return Math.round(balance * 100) / 100.0;
    }
    
    public static void main(String[] args) {
        // Example 1: Initial Capital: 1000€, 100€ monthly, 5% interest, 5 years
        double initialCapital = 1000.0;
        double monthlyContribution = 100.0;
        double annualInterestRate = 0.05; // 5%
        int years = 5;
        
        double finalValue = calculateSavingsPlan(initialCapital, monthlyContribution, 
                                                annualInterestRate, years);
        
        System.out.printf("Investment scenario 1:%n");
        System.out.printf("- Initial capital: %.2f€%n", initialCapital);
        System.out.printf("- Monthly contribution: %.2f€%n", monthlyContribution);
        System.out.printf("- Annual interest rate: %.1f%%%n", annualInterestRate * 100);
        System.out.printf("- Investment period: %d years%n", years);
        System.out.printf("- Final value: %.2f€%n", finalValue);
        
        // Example 2: Initial Capital: 5000€, 200€ monthly, 3% interest, 10 years
        initialCapital = 5000.0;
        monthlyContribution = 200.0;
        annualInterestRate = 0.03; // 3%
        years = 10;
        
        finalValue = calculateSavingsPlan(initialCapital, monthlyContribution, 
                                         annualInterestRate, years);
        
        System.out.printf("%nInvestment scenario 2:%n");
        System.out.printf("- Initial capital: %.2f€%n", initialCapital);
        System.out.printf("- Monthly contribution: %.2f€%n", monthlyContribution);
        System.out.printf("- Annual interest rate: %.1f%%%n", annualInterestRate * 100);
        System.out.printf("- Investment period: %d years%n", years);
        System.out.printf("- Final value: %.2f€%n", finalValue);
        
        // Example 3: No initial capital, only monthly savings
        initialCapital = 0.0;
        monthlyContribution = 150.0;
        annualInterestRate = 0.04; // 4%
        years = 7;
        
        finalValue = calculateSavingsPlan(initialCapital, monthlyContribution, 
                                         annualInterestRate, years);
        
        System.out.printf("%nInvestment scenario 3:%n");
        System.out.printf("- Initial capital: %.2f€%n", initialCapital);
        System.out.printf("- Monthly contribution: %.2f€%n", monthlyContribution);
        System.out.printf("- Annual interest rate: %.1f%%%n", annualInterestRate * 100);
        System.out.printf("- Investment period: %d years%n", years);
        System.out.printf("- Final value: %.2f€%n", finalValue);
    }
}