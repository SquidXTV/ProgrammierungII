package me.squidxtv.oop.exercises.exercise06;

public class Artikel {

    private final int artikelnummer;
    private final double preis;

    public Artikel(int artikelnummer, double preis) {
        this.artikelnummer = artikelnummer;
        this.preis = preis;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artikelnummer=" + artikelnummer +
                ", preis=" + preis +
                '}';
    }
}
