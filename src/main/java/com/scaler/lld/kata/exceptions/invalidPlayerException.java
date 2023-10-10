package com.scaler.lld.kata.exceptions;

public class invalidPlayerException extends RuntimeException{
    public invalidPlayerException(){
        super("Invalid number of players");
    }
}
