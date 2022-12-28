package org.itmo.lab3.story;

public enum Size {
    HUGE("большущий"),
    SO_SMALL("такой маленький"),
    VERY_BIG("большой-пребольшой");

    private final String sizeObject;
    Size(String colourBall) {
        this.sizeObject = colourBall;
    }

    public String getSizeObject() {
        return sizeObject;
    }
}