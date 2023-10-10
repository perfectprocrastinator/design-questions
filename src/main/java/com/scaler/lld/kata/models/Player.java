package com.scaler.lld.kata.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

@AllArgsConstructor
@Getter
@SuperBuilder
public abstract class Player {
    private GameSymbol symbol;
    public abstract BoardCell makeMove(Board board);
}
