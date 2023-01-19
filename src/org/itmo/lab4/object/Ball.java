package org.itmo.lab4.object;


public class Ball extends Thing implements Takeable{
    public Ball(String name){
        super(name);
    }

    @Override
    public String notTake() {
        return this.getName() + " не взял,";
    }
}
