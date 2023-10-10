package com.scaler.lld.kata.models;

import com.scaler.lld.kata.strategies.playing.PlayingStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class BotPlayer extends Player{
    private GameLevel difficultyLevel;
    private MoveStrategy moveStrategy;
    private PlayingStrategy playingStrategy;
    public BotPlayer(GameSymbol symbol,GameLevel level,PlayingStrategy playingStrategy){
        super(symbol);
        this.difficultyLevel=level;
        this.playingStrategy=playingStrategy;
    }
    @Override
    public BoardCell makeMove (Board board) {
        return playingStrategy.makeMove(board);

    }
}
