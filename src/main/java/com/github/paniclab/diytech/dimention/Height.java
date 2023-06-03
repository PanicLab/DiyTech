package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.units.LinearUnit;
import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.function.Function;


public class Height<U extends LinearUnit<U>> extends Dimension<Height<U>, U> implements Summable<Height<U>> {
    private final U unit;
    private final Class<U> unitType;

    public Height(@NotNull U unit) {
        this.unit = unit;
        unitType = unit.getUnitType();
    }


    @NotNull
    public static <X extends LinearUnit<X>> Height<X> valueOf(BigDecimal value, Function<BigDecimal, X> supplier) {
        return new Height<>(supplier.apply(value));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Height<X> valueOf(int value, Function<BigDecimal, X> supplier) {
        return new Height<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Height<X> valueOf(long value, Function<BigDecimal, X> supplier) {
        return new Height<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Height<X> valueOf(double value, Function<BigDecimal, X> supplier) {
        return new Height<>(supplier.apply(BigDecimal.valueOf(value)));
    }


    @Override
    public @NotNull U unit() {
        return unit;
    }

    @Override
    @NotNull
    public Height<U> add(@NotNull Height<U> other) {
        return new Height<>(unit().add(other.unit()));
    }

    @Override
    @NotNull
    public Height<U> subtract(@NotNull Height<U> other) {
        return new Height<>(unit().subtract(other.unit()));
    }

    @Override
    @NotNull
    public Height<U> multiply(@NotNull Value value) {
        return new Height<>(unit().multiply(value));
    }

    @Override
    @NotNull
    public Height<U> divide(@NotNull Value value) {
        return new Height<>(unit().divide(value));
    }

    @Override
    public Value divide(@NotNull Dimension<?, U> other) {
        return unit().divide(other.unit());
    }

    @Override
    public String toString() {
        return "Высота(" + unit + ")";
    }
}
