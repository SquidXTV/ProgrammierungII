/**
 * Implementiere eine Klasse Date, die ein Datum repräsentiert. Die Klasse soll
 * folgende Funktionalität aufweisen:
 *
 * - Drei Instanzvariablen für Tag (day), Monat (month) und Jahr (year)
 * - Einen Konstruktor Date(int day, int month, int year), der ein Datum erstellt
 * - Im Konstruktor soll überprüft werden, ob das Datum gültig ist (z.B. keine negativen Werte,
 *   keine Tage außerhalb des gültigen Bereichs für den jeweiligen Monat, Berücksichtigung von Schaltjahren)
 * - Wenn das Datum ungültig ist, soll eine IllegalArgumentException geworfen werden
 * - Eine Methode display(), die das Datum im Format "TT.MM.YYYY" zurückgibt (z.B. "01.04.2023")
 * - Getter-Methoden für alle Attribute (getDay(), getMonth(), getYear())
        * - Eine Methode isLeapYear(), die zurückgibt, ob das Jahr ein Schaltjahr ist
 * - Eine Methode getDaysInMonth(), die die Anzahl der Tage des gespeicherten Monats zurückgibt
 *
         * Beachte folgende Regeln für gültige Daten:
        * - Tage: 1-31 (abhängig vom Monat)
        * - Monate: 1-12
        * - Jahre: positiv
 * - Februar hat 28 Tage, in Schaltjahren 29
        * - April, Juni, September und November haben 30 Tage -> 4,6,9,11
 * - Alle anderen Monate haben 31 Tage
 * - Ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist, außer es ist durch 100 teilbar,
        *   es sei denn, es ist auch durch 400 teilbar
 */
package me.squidxtv.oop.exercises.exercise05;