/**
 * Ein Stapel (Stack) ist eine Datenstruktur, in der Daten nach dem Prinzip "Last
 * in, first out" (LIFO) verwaltet werden. Implementiere einen Stapel auf
 * der Basis eines Arrays mit den folgenden Methoden: void push(int e) legt eine Zahl oben auf den Stapel
 * und int pop() entfernt das oberste Element des Stapels. Ist das Array voll, soll automatisch ein
 * neues Array mit doppelter Länge angelegt werden mit dem weitergearbeitet werden kann. Die Elemente
 * des alten Arrays müssen zuvor in das neue Array kopiert werden. Kapazitätsprüfung, Erzeugung des
 * neuen Arrays und Übernahme der bisherigen Werte sollen in der Methode push erfolgen.
 *
 * Die Klasse Stack definiert einen Stack für int-Werte und hat mindestens folgende
 * Funktionalität:
 *
 * - Eine Instanzvariable für das Array mit int-Werten
 * - Eine Instanzvariable für den aktuellen Index des obersten Elements
 * - Einen Konstruktor, der ein Array mit einer Anfangsgröße von 10 initialisiert
 * - Eine Methode push(int), die ein Element oben auf den Stapel legt
 * - Eine Methode pop(), die das oberste Element vom Stapel entfernt und zurückgibt
 * - Eine Methode isEmpty(), die prüft, ob der Stapel leer ist
 * - Eine Methode size(), die die Anzahl der Elemente im Stapel zurückgibt
 */
package me.squidxtv.oop.exercises.exercise04;