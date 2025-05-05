package me.squidxtv.oop.exercises.exercise01;

public class Zaehler {

    private int counter = 0;


    public void hochzaehlen() {
        counter++;
    }

    public void zuruecksetzen() {
        counter = 0;
    }

    public int getWert() {
        return counter;
    }

}
