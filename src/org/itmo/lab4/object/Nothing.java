package org.itmo.lab4.object;

import org.itmo.lab4.exceptions.NoNameException;

public class Nothing extends Creature implements NotEavesdropable {
    public Nothing(String name) throws NoNameException {
        super(name);
    }
}
