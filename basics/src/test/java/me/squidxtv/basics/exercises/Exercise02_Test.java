package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise02_Test {
    
    @Test
    public void testNormalLeapYears() {
        // Years that are divisible by 4 (and not by 100)
        assertTrue(Exercise02_LeapYear.isLeapYear(2004));
        assertTrue(Exercise02_LeapYear.isLeapYear(2008));
        assertTrue(Exercise02_LeapYear.isLeapYear(2012));
        assertTrue(Exercise02_LeapYear.isLeapYear(2016));
        assertTrue(Exercise02_LeapYear.isLeapYear(2020));
        assertTrue(Exercise02_LeapYear.isLeapYear(2024));
    }
    
    @Test
    public void testNonLeapYears() {
        // Years that are not divisible by 4
        assertFalse(Exercise02_LeapYear.isLeapYear(2001));
        assertFalse(Exercise02_LeapYear.isLeapYear(2002));
        assertFalse(Exercise02_LeapYear.isLeapYear(2003));
        assertFalse(Exercise02_LeapYear.isLeapYear(2005));
        assertFalse(Exercise02_LeapYear.isLeapYear(2022));
        assertFalse(Exercise02_LeapYear.isLeapYear(2023));
    }
    
    @Test
    public void testCenturyYears() {
        // Years that are divisible by 100, but not by 400
        assertFalse(Exercise02_LeapYear.isLeapYear(1700));
        assertFalse(Exercise02_LeapYear.isLeapYear(1800));
        assertFalse(Exercise02_LeapYear.isLeapYear(1900));
        assertFalse(Exercise02_LeapYear.isLeapYear(2100));
        assertFalse(Exercise02_LeapYear.isLeapYear(2200));
        assertFalse(Exercise02_LeapYear.isLeapYear(2300));
    }
    
    @Test
    public void testQuadricentennialYears() {
        // Years that are divisible by 400
        assertTrue(Exercise02_LeapYear.isLeapYear(1600));
        assertTrue(Exercise02_LeapYear.isLeapYear(2000));
        assertTrue(Exercise02_LeapYear.isLeapYear(2400));
        assertTrue(Exercise02_LeapYear.isLeapYear(2800));
    }
    
    @Test
    public void testHistoricalLeapYears() {
        // Historical leap years
        assertTrue(Exercise02_LeapYear.isLeapYear(1984)); // Orwell's "1984"
        assertTrue(Exercise02_LeapYear.isLeapYear(1972)); // Munich Olympic Games
        assertTrue(Exercise02_LeapYear.isLeapYear(1968)); // Moon landing preparation year
    }
}