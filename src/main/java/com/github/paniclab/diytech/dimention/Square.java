package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.units.SquareUnit;
import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;


public class Square<U extends SquareUnit<U>> extends Dimension<Square<U>, U> implements Summable<Square<U>> {
    private final U unit;
    private final Class<U> unitType;

    public Square(U unit) {
        this.unit = unit;
        this.unitType = unit.getUnitType();
    }


    @Override
    public @NotNull U unit() {
        return this.unit;
    }

    @Override
    public @NotNull Square<U> add(@NotNull Square<U> other) {
        return new Square<>(unit().add(other.unit()));
    }

    @Override
    public @NotNull Square<U> subtract(@NotNull Square<U> other) {
        return new Square<>(unit().subtract(other.unit()));
    }

    @Override
    public @NotNull Square<U> multiply(@NotNull Value value) {
        return new Square<>(unit().multiply(value));
    }

    @Override
    public Value divide(@NotNull Dimension<?, U> other) {
        return unit.divide(other.unit());
    }

    @Override
    public @NotNull Square<U> divide(@NotNull Value value) {
        return new Square<>(unit().divide(value));
    }
}
