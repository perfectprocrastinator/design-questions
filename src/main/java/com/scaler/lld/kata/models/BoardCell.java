package com.scaler.lld.kata.models;

import lombok.Getter;

@Getter
public class BoardCell {
    private int row;
    private int col;
    private GameSymbol symbol;
}
