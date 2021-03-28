package com.codingnights;

public class cars {
    private String name;
    private String color;
    private int door;
    private engine tits;

    public cars(String name, String color, int door, engine tits) {
        this.name = name;
        this.color = color;
        this.door = door;
        this.tits = tits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public engine getTits() {
        return tits;
    }

    public void setTits(engine tits) {
        this.tits = tits;
    }
}
