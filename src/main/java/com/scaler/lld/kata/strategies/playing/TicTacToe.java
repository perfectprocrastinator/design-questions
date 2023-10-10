package com.scaler.lld.kata.strategies.playing;

import com.scaler.lld.kata.models.*;

public class TicTacToe {
    public static void main(String[] args) {
        //Ask for user input - name,email and symbol


        //Create a game
        //Initialize the bot player
        //H vs B

        Game game=createGame(HumanPlayer);
        game.start();
        //Start Game
        //Assign the first player
        //Mark the game in progress

        //Start playing/

        while(game.getStatus()==GameStatus.IN_PROGRESS){
            Player player=game.getNextPlayer();
            System.out.println("Next Player:"+player);
        }

    }
    private static GameSymbol decideSymbol(GameSymbol symbol)

    private static Game createGame(HumanPlayer player){
        Game game= Game.builder()
                .withPlayer()
                .withSize()
                .withPlayer(BotPlayer.builder())

    }
}
