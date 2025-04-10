package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise01_Test {
    
    private static final double DELTA = 0.001; // Tolerance for floating-point comparisons
    
    @Test
    public void testNormalTemperatures() {
        // Room temperature
        assertEquals(68.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(20.0), DELTA);
        
        // Body temperature
        assertEquals(98.6, Exercise01_TemperatureConversion.celsiusToFahrenheit(37.0), DELTA);
    }
    
    @Test
    public void testExtremeCases() {
        // Freezing point of water
        assertEquals(32.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(0.0), DELTA);
        
        // Boiling point of water
        assertEquals(212.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(100.0), DELTA);
    }
    
    @Test
    public void testNegativeTemperatures() {
        // Very cold temperatures
        assertEquals(-4.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(-20.0), DELTA);
        assertEquals(-40.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(-40.0), DELTA); // Special case: -40°C = -40°F
    }
    
    @Test
    public void testDecimalNumbers() {
        // Decimal numbers
        assertEquals(50.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(10.0), DELTA);
        assertEquals(59.0, Exercise01_TemperatureConversion.celsiusToFahrenheit(15.0), DELTA);
        assertEquals(80.6, Exercise01_TemperatureConversion.celsiusToFahrenheit(27.0), DELTA);
    }
}