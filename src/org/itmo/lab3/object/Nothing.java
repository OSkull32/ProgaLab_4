package org.itmo.lab3.object;

import org.itmo.lab3.exceptions.NoNameException;

public class Nothing extends Creature implements NotEavesdropable {
    public Nothing(String name) throws NoNameException {
        super(name);
    }
}
