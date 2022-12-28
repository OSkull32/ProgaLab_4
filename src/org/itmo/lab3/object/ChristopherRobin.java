package org.itmo.lab3.object;

import org.itmo.lab3.exceptions.NoNameException;
import org.itmo.lab3.story.*;

public class ChristopherRobin extends Creature implements Visitable {

    public ChristopherRobin(String name) throws NoNameException {
        super(name);
    }


    public void notSay() {
        System.out.println(this.getName() + " ничего не сказал, но" + Face.Eyes.gotBigger() + ", а " + Face.Cheeks.turnedPink());
    }

    public void wasAtFriend(Event onWhat, Creature creature) {
        System.out.println("Ну, а как раз накануне " + this.getName() + onWhat.getEventDescribe() + creature.getName() + ",");
    }

    public void grabBall(Actions action, Thing ball, Colours colour1, Colours colour2) {
        System.out.println("поэтому "+ this.getName() + " пришлось, так и быть, " + action.getActionDescribe() + " с собой оба " + ball.getName() + "-- и " + colour1.getColour() + ", и " + colour2.getColour() + ".");
    }
}
