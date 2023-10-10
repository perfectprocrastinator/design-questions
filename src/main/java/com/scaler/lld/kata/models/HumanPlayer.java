package com.scaler.lld.kata.models;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HumanPlayer extends Player{
    private User user;

    public HumanPlayer(GameSymbol symbol,User user){
        super(symbol);
        this.user=user;
    }
    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }
}
