package ru.netology.Tournament;

public class Player {
    protected int id;
    protected String playerName;
    protected int strength;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Player(int id, String playerName, int strength) {
        this.id = id;
        this.playerName = playerName;
        this.strength = strength;
    }
}