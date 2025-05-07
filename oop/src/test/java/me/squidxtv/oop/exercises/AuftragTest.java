package me.squidxtv.oop.exercises;

import static org.junit.jupiter.api.Assertions.*;

import me.squidxtv.oop.exercises.exercise06.Artikel;
import me.squidxtv.oop.exercises.exercise06.Auftrag;
import org.junit.jupiter.api.Test;


public class AuftragTest {

    @Test
    public void testGesamtwertKeineAuftraege() {
        // Test mit leerer Auftragsliste
        assertEquals(0.0, Auftrag.getGesamtwert(), "Gesamtwert ohne Aufträge sollte 0 sein");
    }

    @Test
    public void testGesamtwertEinAuftrag() {
        // Artikel erstellen
        Artikel artikel = new Artikel(1001, 19.99);
        
        // Auftrag mit Menge 5 erstellen
        Auftrag auftrag = new Auftrag(artikel, 5);
        
        // Erwarteter Gesamtwert: 5 * 19.99 = 99.95
        assertEquals(99.95, Auftrag.getGesamtwert(auftrag), 0.001, 
                "Gesamtwert für einen Auftrag sollte korrekt berechnet werden");
    }

    @Test
    public void testGesamtwertMehrereAuftraege() {
        // Artikel erstellen
        Artikel artikel1 = new Artikel(1001, 19.99);
        Artikel artikel2 = new Artikel(1002, 9.95);
        Artikel artikel3 = new Artikel(1003, 49.90);
        
        // Aufträge erstellen
        Auftrag auftrag1 = new Auftrag(artikel1, 2);  // 2 * 19.99 = 39.98
        Auftrag auftrag2 = new Auftrag(artikel2, 5);  // 5 * 9.95 = 49.75
        Auftrag auftrag3 = new Auftrag(artikel3, 1);  // 1 * 49.90 = 49.90
        
        // Erwarteter Gesamtwert: 39.98 + 49.75 + 49.90 = 139.63
        assertEquals(139.63, Auftrag.getGesamtwert(auftrag1, auftrag2, auftrag3), 0.001, 
                "Gesamtwert für mehrere Aufträge sollte korrekt berechnet werden");
    }

    @Test
    public void testGesamtwertMitGleichenArtikeln() {
        // Gleicher Artikel für mehrere Aufträge
        Artikel artikel = new Artikel(1001, 10.0);
        
        // Aufträge erstellen
        Auftrag auftrag1 = new Auftrag(artikel, 1);  // 1 * 10.0 = 10.0
        Auftrag auftrag2 = new Auftrag(artikel, 2);  // 2 * 10.0 = 20.0
        Auftrag auftrag3 = new Auftrag(artikel, 3);  // 3 * 10.0 = 30.0
        
        // Erwarteter Gesamtwert: 10.0 + 20.0 + 30.0 = 60.0
        assertEquals(60.0, Auftrag.getGesamtwert(auftrag1, auftrag2, auftrag3), 0.001, 
                "Gesamtwert für Aufträge mit gleichem Artikel sollte korrekt berechnet werden");
    }
}