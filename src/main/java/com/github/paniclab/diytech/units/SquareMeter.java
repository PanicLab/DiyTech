package com.github.paniclab.diytech.units;

import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.dimention.Dimension;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;


public final class SquareMeter extends SquareUnit<SquareMeter> {
    private final BigDecimal value;

    public SquareMeter(@NotNull BigDecimal value) {
        this.value = value;
    }


    @NotNull
    public static SquareMeter valueOf(@NotNull BigDecimal value) {
        return new SquareMeter(value);
    }


    @NotNull
    public static <U extends Dimension<U, Meter> & Summable<U>, V extends Dimension<V, Meter> & Summable<V>> SquareMeter from(@NotNull U length, V width) {
        return new SquareMeter(length.unit().value().multiply(width.unit().value()));
    }


    @Override
    protected @NotNull BigDecimal value() {
        return this.value;
    }

    @Override
    public @NotNull Class<SquareMeter> getUnitType() {
        return SquareMeter.class;
    }

    @Override
    public @NotNull String name() {
        return "метр квадратый";
    }

    @Override
    public @NotNull String alias() {
        return "м.кв.";
    }

    @Override
    public @NotNull SquareMeter add(@NotNull SquareMeter other) {
        return new SquareMeter(
                this.value.add(other.value)
        );
    }

    @Override
    public @NotNull SquareMeter subtract(@NotNull SquareMeter other) {
        return new SquareMeter(
                this.value.subtract(other.value)
        );
    }

    @Override
    public @NotNull SquareMeter multiply(@NotNull Value value) {
        return new SquareMeter(
                this.value.multiply(value.unwrap())
        );
    }

    @Override
    public @NotNull SquareMeter divide(@NotNull Value value) {
        return new SquareMeter(
                this.value.divide(value.unwrap(), RoundingMode.HALF_UP)
        );
    }
}
