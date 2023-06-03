package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.units.LinearUnit;
import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.function.Function;


public final class Width<U extends LinearUnit<U>> extends Dimension<Width<U>, U> implements Summable<Width<U>> {
    private final U unit;
    private final Class<U> unitType;

    public Width(@NotNull U unit) {
        this.unit = unit;
        unitType = unit.getUnitType();
    }

    @NotNull
    public static <X extends LinearUnit<X>> Width<X> valueOf(BigDecimal value, Function<BigDecimal, X> supplier) {
        return new Width<>(supplier.apply(value));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Width<X> valueOf(int value, Function<BigDecimal, X> supplier) {
        return new Width<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Width<X> valueOf(long value, Function<BigDecimal, X> supplier) {
        return new Width<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Width<X> valueOf(double value, Function<BigDecimal, X> supplier) {
        return new Width<>(supplier.apply(BigDecimal.valueOf(value)));
    }


    @Override
    public @NotNull U unit() {
        return this.unit;
    }

    @Override
    @NotNull
    public Width<U> add(@NotNull Width<U> other) {
        return new Width<>(unit().add(other.unit()));
    }

    @Override
    @NotNull
    public Width<U> subtract(@NotNull Width<U> other) {
        return new Width<>(unit().subtract(other.unit()));
    }

    @Override
    public @NotNull Dimension<Width<U>, U> multiply(@NotNull Value value) {
        return new Width<>(unit().multiply(value));
    }

    @Override
    public @NotNull Dimension<Width<U>, U> divide(@NotNull Value value) {
        return new Width<>(unit().divide(value));
    }

    @Override
    public Value divide(@NotNull Dimension<?, U> other) {
        return unit().divide(other.unit());
    }

    @Override
    public String toString() {
        return "Ширина(" + unit + ")";
    }
}
