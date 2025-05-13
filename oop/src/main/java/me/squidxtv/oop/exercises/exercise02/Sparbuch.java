package me.squidxtv.oop.exercises.exercise02;

public class Sparbuch {

    private final String kontonummer;
    private double kapital;
    private final double zinssatz;

    public Sparbuch(String kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double add) {
        if (add < 0) {
            return;
        }

        kapital += add;
    }

    public void hebeAb(double withdraw) {
        if (kapital - withdraw < 0) {
            return;
        }

        kapital -= withdraw;
    }

    public double getErtrag(int jahre) {
        return kapital * Math.pow(1.0 + zinssatz / 100.0, jahre);
    }

    public void verzinse() {
        kapital = kapital * (1.0 + zinssatz / 100.0);
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }
}
