package me.squidxtv.oop.exercises.exercise06;

import java.util.Arrays;

public class Auftrag {

    private final Artikel artikel;
    private final int menge;

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getMenge() {
        return menge;
    }

    public double getAuftragswert() {
        return artikel.getPreis() * menge;
    }

    @Override
    public String toString() {
        return "Auftrag{" +
                "artikel=" + artikel +
                ", menge=" + menge +
                '}';
    }

    public static double getGesamtwert(Auftrag... auftraege) {
        return Arrays.stream(auftraege).mapToDouble(Auftrag::getAuftragswert).sum();
    }
}
