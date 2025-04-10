package me.squidxtv.basics.exercises;

/**
 * Exercise 9: Number System Converter
 * 
 * In this exercise, a number needs to be converted between different number systems.
 * This will use string operations, loops, and bit operations.
 * 
 * Implement methods to convert between decimal, binary, octal, and hexadecimal.
 */
public class Exercise09_NumberSystemConverter {
    
    /**
     * Converts a decimal number to a binary number (as a string).
     * 
     * @param decimal The decimal number
     * @return The binary number as a string
     */
    public static String decimal2Binary(int decimal) {
        if (decimal < 0) {
            return "-" + decimal2Binary(-decimal);
        }

        return Integer.toBinaryString(decimal);
    }
    
    /**
     * Converts a decimal number to an octal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The octal number as a string
     */
    public static String decimal2octal(int decimal) {
        if (decimal < 0) {
            return "-" + decimal2octal(-decimal);
        }

        return Integer.toOctalString(decimal);
    }
    
    /**
     * Converts a decimal number to a hexadecimal number (as a string).
     * 
     * @param decimal The decimal number
     * @return The hexadecimal number as a string
     */
    public static String decimal2hex(int decimal) {
        if (decimal < 0) {
            return "-" + decimal2hex(-decimal);
        }

        return Integer.toHexString(decimal).toUpperCase();
    }
    
    /**
     * Converts a binary number (as a string) to a decimal number.
     * 
     * @param binary The binary number as a string
     * @return The decimal number
     */
    public static int binary2decimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    
    public static void main(String[] args) {
        // Examples of conversions
        int decimal = 42;
        
        System.out.println(decimal + " (decimal) = " + decimal2Binary(decimal) + " (binary)");
        System.out.println(decimal + " (decimal) = " + decimal2octal(decimal) + " (octal)");
        System.out.println(decimal + " (decimal) = " + decimal2hex(decimal) + " (hexadecimal)");
        
        String binary = "101010";
        System.out.println(binary + " (binary) = " + binary2decimal(binary) + " (decimal)");
        
        // More examples
        decimal = 255;
        System.out.println("\n" + decimal + " (decimal) = " + decimal2Binary(decimal) + " (binary)");
        System.out.println(decimal + " (decimal) = " + decimal2octal(decimal) + " (octal)");
        System.out.println(decimal + " (decimal) = " + decimal2hex(decimal) + " (hexadecimal)");
        
        binary = "11111111";
        System.out.println(binary + " (binary) = " + binary2decimal(binary) + " (decimal)");
    }
}