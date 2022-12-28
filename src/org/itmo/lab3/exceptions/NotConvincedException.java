package org.itmo.lab3.exceptions;

public class NotConvincedException extends RuntimeException{
    public NotConvincedException() {
        super("Персонаж не убедился в безопасности действия и не стал рассказывать секрет.");
    }
}
