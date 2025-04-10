package me.squidxtv.basics.exercises;

/**
 * Exercise 4: Prime Number Test
 * 
 * In this exercise, we need to check if a number is a prime number.
 * This will use loops and control structures.
 * 
 * A prime number is a natural number greater than 1 that is only divisible by 1 and itself.
 */
public class Exercise04_PrimeNumberTest {
    
    /**
     * Checks if a number is a prime number.
     * 
     * @param number The number to check
     * @return true if the number is a prime number, otherwise false
     */
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        // Examples of prime and non-prime numbers
        int[] numbers = {2, 3, 4, 5, 6, 7, 11, 13, 15, 17, 20, 23, 29, 97, 100};
        
        for (int number : numbers) {
            if (isPrimeNumber(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}