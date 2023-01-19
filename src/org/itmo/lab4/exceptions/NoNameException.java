package org.itmo.lab4.exceptions;

public class NoNameException extends Exception{
    public NoNameException(){
        super("Нельзя использовать персонажа без имени.");
    }
}
