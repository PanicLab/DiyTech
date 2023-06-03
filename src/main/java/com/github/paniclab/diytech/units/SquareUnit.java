package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;

import java.math.RoundingMode;


public abstract class SquareUnit<T extends SquareUnit<T>> extends AbstractUnit<T> {
    @Override
    public @NotNull String description() {
        return "Единица площади";
    }

    @Override
    @NotNull
    public EssenceFeature feature() {
        return EssenceFeature.SQUARE;
    }

    @Override
    public Value divide(@NotNull T other) {
        return Value.of(
                value().divide(other.value(), RoundingMode.HALF_UP)
        );
    }
}
