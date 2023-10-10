package com.scaler.lld.kata.models;


import com.scaler.lld.kata.exceptions.InvalidMoveException;
import com.scaler.lld.kata.exceptions.invalidPlayerException;
import com.scaler.lld.kata.models.BoardCell;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Game {
    private static final int PLAYER_COUNT=2;
    private static final GameStatus DEFAULT_STATUS=GameStatus.IN_PROGRESS;
    private Board board;
    private List<Player> players=new ArrayList<>();
    private GameStatus status;
    private int nextPlayerIndex=0;
    private Game(){

    }

    public void start(){
        //assign a random value to next player index
        nextPlayerIndex=(int) (Math.random()*players.size());
        status=GameStatus.IN_PROGRESS;
    }
    public void makeMove(){
        //GET the next move
        BoardCell move= getNextMove();
        //validate the move-check if the cell was already filled
        validateMove(move);
    }

    private void validateMove(BoardCell move) {
        if(!board.isEmpty(move.getRow(),move.getCol())){
            throw new InvalidMoveException();
        }

    }

    private  BoardCell getNextMove() {
         Player player=players.get(nextPlayerIndex);
         return player.makeMove(board);
    }

    private Player checkWinner(){
        return null;
    }
    private Boolean checkDraw(){
        return null;
    }
    public static  GameBuilder builder(){
        return new GameBuilder();
    }


    //Implementing Builder Pattern for Game class
    public static class GameBuilder{
        private Game game;
        private GameBuilder(){
            game=new Game();
        }
        public GameBuilder withSize(int size){
            this.game.board=new Board(size);
            return this;
        }
        public GameBuilder withPlayer(Player player){
            this.game.getPlayers().add(player);
            return this;
        }
        public Game build(){
            boolean isValid=validate();
            if(!isValid){
                throw new invalidPlayerException();

            }
            Game newGame=new Game();
            newGame.players=game.players;
            newGame.status=DEFAULT_STATUS;
            newGame.board=game.board;
            return newGame;
        }

        private boolean validate() {
            if(game.players.size()!=2){
                return false;
            }

            Set<GameSymbol> symbols=game.players.stream().map(
                    player -> player.getSymbol()
            ).collect(Collectors.toSet());
            if(symbols.size()!=PLAYER_COUNT){
                return false;
            }
            return true;

        }
    }

}
