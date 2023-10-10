package com.scaler.lld.kata;

import com.scaler.lld.kata.models.*;
import com.scaler.lld.kata.strategies.playing.RandomPlayingStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    private static final int BOARD_SIZE=3;
    @Test
    public void testCreateGame(){
        Game game=Game.builder()
                .withSize(3)
                .withPlayer(HumanPlayer.builder().user(new User()).symbol(GameSymbol.X).build())
                .withPlayer(BotPlayer.builder().symbol(GameSymbol.O).difficultyLevel(GameLevel.BEG).playingStrategy(new RandomPlayingStrategy()).build())
                .build();
        Board board=new Board(BOARD_SIZE);
        assertEquals(2,game.getPlayers().size());


    }

}
