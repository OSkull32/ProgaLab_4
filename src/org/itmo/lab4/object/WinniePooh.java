package org.itmo.lab4.object;

import org.itmo.lab4.exceptions.NoNameException;
import org.itmo.lab4.exceptions.NotConvincedException;
import org.itmo.lab4.story.Actions;
import org.itmo.lab4.story.Colours;

public class WinniePooh extends Creature {
    public WinniePooh(String name) throws NoNameException {
        super(name);
    }

    public String pulledOut(Thing thing) {
        return " вытащил из носа " + thing.getName();
    }

    public void thinkAbout(Creature creature) {
        System.out.println("И самым первым делом " + this.getName() + " подумал о " + creature.getName());
    }

    public void climbOut(Thing thing1, Thing thing2, Actions actions) {
        System.out.println(this.getName() + " выкарабкался из " + thing1.getName() + "," + pulledOut(thing2) + " и снова " + actions.getActionDescribe());
    }
    public String pressPaw(Thing thing) {
        return "прижал " + thing.getName();
    }

    public void tellSecret(Thing thing, Thing thing2, Actions actions2, Thing thing3) {
        System.out.println(pressPaw(thing) + " к " + thing2.getName() + " и " + actions2.getActionDescribe() + " страшным " + thing3.getName() + ":");
    }

    public String eavesdrop(Creature creature) {
        if (creature == null) return " подслушивает разговор";
        if (creature instanceof NotEavesdropable) return creature.getName() + " не подслушивает";
        return creature.getName() + " подслушивает разговор";
    }

    public void checkConvinced(Actions actions){
        if (!actions.getActionDescribe().equals("убедившись, что ")){
           throw new NotConvincedException();
        }

    }
    public void makeSure(Actions actions1, Actions actions2, Creature creature) {
        try {
            checkConvinced(actions2);
            System.out.println(this.getName() + " " + actions1.getActionDescribe() + ", и " + actions2.getActionDescribe() + eavesdrop(creature) + ",");
        } catch (NotConvincedException e) {
            throw new NotConvincedException();
        }
    }

    public void go(Creature creature, Colours colours, Thing thing){
        class Friend{
            public String live(Colours colours, Thing thing){
                return ", который жил в том же лесу, в доме с " + colours.getColour() + " " + thing.getName();
            }
        }
        Friend friend = new Friend();
        System.out.println("Итак, " + this.getName() + " отправился к своему другу " + creature.getName() + friend.live(colours, thing));
    }

    public void embraceHead(Thing thing){
        System.out.print(this.getName() + " обхватил голову " + thing.getName());
    }

    public void thoughtDeeply(){
        System.out.println(" и задумался глубоко-глубоко.");
    }
}
