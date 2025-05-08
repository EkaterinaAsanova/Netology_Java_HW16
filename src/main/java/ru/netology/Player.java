package ru.netology;


public class Player {

    protected int id;
    protected String name;
    protected int strength;

    public Player(int id, String Name, int strength) {
        this.id = id;
        this.name = Name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}