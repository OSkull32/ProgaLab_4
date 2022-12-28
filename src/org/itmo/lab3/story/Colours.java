package org.itmo.lab3.story;

public enum Colours {
    GREEN("Зеленый"),
    BLUE("синий");

    private final String colour;
    Colours(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}