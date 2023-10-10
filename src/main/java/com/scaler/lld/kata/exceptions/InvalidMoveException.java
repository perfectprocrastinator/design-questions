package com.scaler.lld.kata.exceptions;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(){
        super("The move was invalid");
    }
}
