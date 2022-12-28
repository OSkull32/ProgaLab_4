package org.itmo.lab3.object;

import org.itmo.lab3.exceptions.NoNameException;

public class Guest extends Creature {
    public Guest(String name) throws NoNameException {
        super(name);
    }

    public static void givePresent(Guest guest) {
        System.out.println("и там " + guest.getName() + " дарили воздушные шарики.");
    }
}
