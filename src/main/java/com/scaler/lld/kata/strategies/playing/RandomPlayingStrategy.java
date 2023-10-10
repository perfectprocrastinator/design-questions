package com.scaler.lld.kata.strategies.playing;

import com.scaler.lld.kata.models.Board;
import com.scaler.lld.kata.models.BoardCell;

import java.util.List;

public class RandomPlayingStrategy implements  PlayingStrategy{

    @Override
    public BoardCell makeMove(Board board) {
         // Output->A cell from the list of available cells
        //Get a list of empty cells


        //Generate a random index for the cells

        //Return the random cell

    }
    public List<BoardCell> getEmptyCells(){
        //Iterate over cells

       //Flattening the array 2D=> 1D
        return cells.stream()
                .flatMap(List::stream)
                .filter(cell->cell.)

    }
}
