package me.squidxtv.basics.exercises;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise08_Test {
    
    @Test
    public void testSimpleText() {
        // Simple text
        String text = "Der Hund läuft im Garten. Der Garten ist groß.";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertEquals(7, result.size()); // 6 different words
        assertEquals(Integer.valueOf(2), result.get("der"));
        assertEquals(Integer.valueOf(2), result.get("garten"));
        assertEquals(Integer.valueOf(1), result.get("hund"));
        assertEquals(Integer.valueOf(1), result.get("läuft"));
        assertEquals(Integer.valueOf(1), result.get("im"));
        assertEquals(Integer.valueOf(1), result.get("ist"));
        assertEquals(Integer.valueOf(1), result.get("groß"));
    }
    
    @Test
    public void testEmptyText() {
        // Empty text
        String text = "";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertTrue(result.isEmpty());
    }
    
    @Test
    public void testSingleWord() {
        // A single word
        String text = "Java";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(1), result.get("java"));
    }
    
    @Test
    public void testCaseInsensitivity() {
        // Case insensitivity
        String text = "Java java JAVA jAvA";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(4), result.get("java"));
    }
    
    @Test
    public void testPunctuation() {
        // Punctuation
        String text = "Hallo, Welt! Hallo. Welt? Hallo; Welt: Hallo-Welt.";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertEquals(3, result.size());
        assertEquals(Integer.valueOf(3), result.get("hallo"));
        assertEquals(Integer.valueOf(3), result.get("welt"));
        assertEquals(Integer.valueOf(1), result.get("hallo-welt"));
    }
    
    @Test
    public void testMixedContent() {
        // Mixed content with numbers and special characters
        String text = "Java 8 ist großartig! C++ 11 und Python 3.6 sind auch gut.";
        Map<String, Integer> result = Exercise08_WordCounter.zaehleWoerter(text);
        
        assertEquals(12, result.size());
        assertEquals(Integer.valueOf(1), result.get("java"));
        assertEquals(Integer.valueOf(1), result.get("8"));
        assertEquals(Integer.valueOf(1), result.get("ist"));
        assertEquals(Integer.valueOf(1), result.get("großartig"));
        assertEquals(Integer.valueOf(1), result.get("c++"));
        assertEquals(Integer.valueOf(1), result.get("11"));
        assertEquals(Integer.valueOf(1), result.get("und"));
        assertEquals(Integer.valueOf(1), result.get("python"));
        assertEquals(Integer.valueOf(1), result.get("3.6"));
        assertEquals(Integer.valueOf(1), result.get("sind"));
        assertEquals(Integer.valueOf(1), result.get("auch"));
        assertEquals(Integer.valueOf(1), result.get("gut"));
    }
}