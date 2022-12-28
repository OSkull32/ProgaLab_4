package org.itmo.lab3.object;

import java.util.Objects;

public class Place {
    private String name;

    public Place(String name){
        this.setName(name);
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (!this.getClass().equals(otherObject.getClass()))
            return false;
        Place other = (Place) otherObject;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "name=" + this.name + "]";
    }
}
