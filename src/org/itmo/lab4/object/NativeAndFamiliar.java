package org.itmo.lab4.object;

import org.itmo.lab4.exceptions.NoNameException;
import org.itmo.lab4.story.Colours;
import org.itmo.lab4.story.Size;

public class NativeAndFamiliar extends Creature implements Takeable {
    public NativeAndFamiliar(String name) throws NoNameException {
        super(name);
    }

    public void prepareGift(Colours colour, Size size, Ball ball) {
        System.out.println("а одному из " + this.getName() + " приготовили " + size.getSizeObject() + " " + colour.getColour() + " " + ball.getName() + ",");
    }

    @Override
    public String notTake() {
        return this.getName() + " не взяли в гости";
    }

    public void notVisit(Size size) {
        System.out.println("Потому что сам он был еще " + size.getSizeObject() + ", что " + notTake());
    }
}
