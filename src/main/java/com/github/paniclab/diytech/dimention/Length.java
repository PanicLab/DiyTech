package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Scalable;
import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.units.LinearUnit;
import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.function.Function;


public class Length<U extends LinearUnit<U>> extends Dimension<Length<U>, U> implements Summable<Length<U>> {
    private final U unit;
    private final Class<U> unitType;

    public Length(@NotNull U unit) {
        this.unit = unit;
        unitType = unit.getUnitType();
    }


    @NotNull
    public static <X extends LinearUnit<X>> Length<X> valueOf(BigDecimal value, Function<BigDecimal, X> supplier) {
        return new Length<>(supplier.apply(value));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Length<X> valueOf(int value, Function<BigDecimal, X> supplier) {
        return new Length<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Length<X> valueOf(long value, Function<BigDecimal, X> supplier) {
        return new Length<>(supplier.apply(BigDecimal.valueOf(value)));
    }

    @NotNull
    public static <X extends LinearUnit<X>> Length<X> valueOf(double value, Function<BigDecimal, X> supplier) {
        return new Length<>(supplier.apply(BigDecimal.valueOf(value)));
    }


    @Override
    public @NotNull U unit() {
        return unit;
    }

    @Override
    @NotNull
    public Length<U> add(@NotNull Length<U> other) {
        return new Length<>(unit().add(other.unit()));
    }

    @Override
    @NotNull
    public Length<U> subtract(@NotNull Length<U> other) {
        return new Length<>(unit().subtract(other.unit()));
    }

    @Override
    @NotNull
    public Length<U> multiply(@NotNull Value value) {
        return new Length<>(unit().multiply(value));
    }

    @Override
    @NotNull
    public Length<U> divide(@NotNull Value value) {
        return new Length<>(unit().divide(value));
    }

    @Override
    @NotNull
    public Value divide(@NotNull Dimension<?, U> other) {
        return unit().divide(other.unit());
    }

    @Override
    public String toString() {
        return "Длина(" + unit + ")";
    }
}
