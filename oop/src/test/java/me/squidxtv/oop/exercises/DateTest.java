package me.squidxtv.oop.exercises;

import static org.junit.jupiter.api.Assertions.*;

import me.squidxtv.oop.exercises.exercise05.Date;
import org.junit.jupiter.api.Test;


public class DateTest {

    @Test
    public void testValidDate() {
        Date date = new Date(15, 6, 2023);
        assertEquals(15, date.getDay(), "Tag sollte 15 sein");
        assertEquals(6, date.getMonth(), "Monat sollte 6 sein");
        assertEquals(2023, date.getYear(), "Jahr sollte 2023 sein");
    }

    @Test
    public void testDisplayFormat() {
        Date date = new Date(5, 3, 2023);
        assertEquals("05.03.2023", date.display(), "Datum sollte im Format TT.MM.YYYY angezeigt werden");
        
        Date singleDigitDate = new Date(1, 1, 2023);
        assertEquals("01.01.2023", singleDigitDate.display(), "Einstellige Tage/Monate sollten mit führender 0 angezeigt werden");
    }

    @Test
    public void testInvalidDates() {
        // Ungültiger Tag (zu hoch)
        assertThrows(IllegalArgumentException.class, () -> new Date(32, 1, 2023),
                "Tag 32 sollte ungültig sein");
        
        // Ungültiger Tag für Februar
        assertThrows(IllegalArgumentException.class, () -> new Date(30, 2, 2023),
                "Tag 30 sollte für Februar ungültig sein");
        
        // Ungültiger Monat
        assertThrows(IllegalArgumentException.class, () -> new Date(15, 13, 2023),
                "Monat 13 sollte ungültig sein");
        
        // Ungültiges Jahr
        assertThrows(IllegalArgumentException.class, () -> new Date(15, 6, 0),
                "Jahr 0 sollte ungültig sein");
        
        // Ungültiger Tag (zu niedrig)
        assertThrows(IllegalArgumentException.class, () -> new Date(0, 6, 2023),
                "Tag 0 sollte ungültig sein");
    }

    @Test
    public void testLeapYear() {
        // Schaltjahr (durch 4 teilbar)
        Date leapYear = new Date(1, 1, 2024);
        assertTrue(leapYear.isLeapYear(), "2024 sollte ein Schaltjahr sein");
        
        // Kein Schaltjahr (nicht durch 4 teilbar)
        Date notLeapYear = new Date(1, 1, 2023);
        assertFalse(notLeapYear.isLeapYear(), "2023 sollte kein Schaltjahr sein");
        
        // Kein Schaltjahr (durch 100 teilbar aber nicht durch 400)
        Date century = new Date(1, 1, 1900);
        assertFalse(century.isLeapYear(), "1900 sollte kein Schaltjahr sein");
        
        // Schaltjahr (durch 400 teilbar)
        Date leapCentury = new Date(1, 1, 2000);
        assertTrue(leapCentury.isLeapYear(), "2000 sollte ein Schaltjahr sein");
    }

    @Test
    public void testDaysInMonth() {
        // Februar in Nicht-Schaltjahr
        Date febNonLeap = new Date(1, 2, 2023);
        assertEquals(28, febNonLeap.getDaysInMonth(), "Februar 2023 sollte 28 Tage haben");
        
        // Februar in Schaltjahr
        Date febLeap = new Date(1, 2, 2024);
        assertEquals(29, febLeap.getDaysInMonth(), "Februar 2024 sollte 29 Tage haben");
        
        // Monate mit 30 Tagen
        Date april = new Date(1, 4, 2023);
        assertEquals(30, april.getDaysInMonth(), "April sollte 30 Tage haben");
        
        Date june = new Date(1, 6, 2023);
        assertEquals(30, june.getDaysInMonth(), "Juni sollte 30 Tage haben");
        
        // Monate mit 31 Tagen
        Date january = new Date(1, 1, 2023);
        assertEquals(31, january.getDaysInMonth(), "Januar sollte 31 Tage haben");
        
        Date december = new Date(1, 12, 2023);
        assertEquals(31, december.getDaysInMonth(), "Dezember sollte 31 Tage haben");
    }

    @Test
    public void testFebruaryInLeapYear() {
        // Tag 29 in Februar in einem Schaltjahr sollte gültig sein
        Date date = new Date(29, 2, 2024);
        assertEquals(29, date.getDay(), "Tag sollte 29 sein");
        assertEquals(2, date.getMonth(), "Monat sollte 2 sein");
        
        // Tag 29 in Februar in einem Nicht-Schaltjahr sollte ungültig sein
        assertThrows(IllegalArgumentException.class, () -> new Date(29, 2, 2023),
                "29. Februar 2023 sollte ungültig sein (kein Schaltjahr)");
    }
}