package com.scaler.lld.kata.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    int size;
    private List<List<BoardCell>> cells=new ArrayList<>();
    public Board(int size){
        this.size=size;
        this.cells=initializeCells(size);

    }
    private List<List<BoardCell>> initializeCells(int size){
        List<BoardCell> row= Collections.nCopies(size,new BoardCell());
        List<List<BoardCell>> rows=Collections.nCopies(size,row);
        return rows;
    }

    public boolean isEmpty(int row, int col) {
        return this.cells.get(row).get(col).getSymbol()==null;
    }
}
