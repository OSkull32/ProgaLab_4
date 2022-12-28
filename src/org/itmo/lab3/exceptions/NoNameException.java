package org.itmo.lab3.exceptions;

public class NoNameException extends Exception{
    public NoNameException(){
        super("Нельзя использовать персонажа без имени.");
    }
}
