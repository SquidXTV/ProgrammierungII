/**
 * Entwickle ein System zur Verwaltung von Artikeln und Aufträgen:
 *
 * 1. Erstelle eine Klasse "Artikel" mit folgenden Eigenschaften:
 *    - Instanzvariablen:
 *      - artikelnummer (int): eindeutige Nummer des Artikels
 *      - preis (double): Preis des Artikels
 *    - Konstruktor, der artikelnummer und preis als Parameter erwartet
 *    - Getter-Methoden für alle Attribute
 *    - Eine toString()-Methode, die die Artikelinformationen als String zurückgibt
 *
 * 2. Erstelle eine Klasse "Auftrag" mit folgenden Eigenschaften:
 *    - Instanzvariablen:
 *      - artikel (Artikel): Eine Referenz auf den bestellten Artikel
 *      - menge (int): Die bestellte Menge dieses Artikels
 *    - Konstruktor, der artikel und menge als Parameter erwartet
 *    - Getter-Methoden für alle Attribute
 *    - Eine Methode getAuftragswert(), die den Gesamtwert des Auftrags (menge * artikelpreis) zurückgibt
 *    - Eine toString()-Methode, die die Auftragsinformationen als String zurückgibt
 *    - Eine Klassenmethode getGesamtwert(Auftrag... auftraege), die die Summe aller
 *      einzelnen Auftragswerte (menge * artikelpreis) für die übergebenen Aufträge liefert
 *
 * Der JUnit-Test soll nur die Klassenmethode Auftrag.getGesamtwert() testen.
 */
package me.squidxtv.oop.exercises.exercise06;