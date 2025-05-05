package me.squidxtv.oop.exercises.exercise03;

public class Beleg {

    private static int counter = 10000;

    private final int id = counter++;

    public int getBelegnummer() {
        return id;
    }

    public static int getNaechsteBelegnummer() {
        return counter;
    }

    public static int getAnzahlBelege() {
        return counter - 10000;
    }

}
