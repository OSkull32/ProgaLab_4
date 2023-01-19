package org.itmo.lab4.object;

import java.util.Objects;

public class Thing {
    private String name;

    public Thing(String name) {
        this.setName(name);
    }

    public void solve(){
        System.out.println("решить что-то");
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!this.getClass().equals(otherObject.getClass())) return false;

        Thing other = (Thing) otherObject;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return this.getClass().getName() + "["
                + "name=" + name + "]";
    }
}