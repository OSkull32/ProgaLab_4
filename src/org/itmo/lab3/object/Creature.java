package org.itmo.lab3.object;

import org.itmo.lab3.exceptions.NoNameException;
import org.itmo.lab3.story.Colours;
import org.itmo.lab3.story.Size;

import java.util.Objects;

public abstract class Creature {
    private String name;

    protected Creature(String name) throws NoNameException {
        if (name.length() == 0)
            throw new NoNameException();
        this.setName(name);
    }


    public class Face {
        public void setName(){
            name = "лицо";
        }
        public static class Eyes {
            static String eyes = " глаза";
            public static String gotBigger() {
                return eyes + " становились все больше и больше";
            }
        }

        public class Cheeks{
            public static String turnedPink() {
                String cheeks = "щеки";
                return cheeks + " розовели и розовели";
            }
        }

    }


    public String getName() {
        return name;
    }

    public static void getBall(Colours colour, Size size, Ball ball, Creature creature) {
        if (creature == null)
            System.out.println("достался шар");
        if (creature instanceof Visitable)
            System.out.println(creature.getName() + " достался " + size.getSizeObject() + " " + colour.getColour() + " " + ball.getName() + ",");
        else System.out.println("Но этот " + creature.getName() + " " + size.getSizeObject() + " " + colour.getColour() + " " + ball.notTake());
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (!otherObject.getClass().equals(this.getClass()))
            return false;
        Creature other = (Creature) otherObject;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + this.name + "]";
    }

}
