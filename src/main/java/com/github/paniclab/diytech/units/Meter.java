package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;


public final class Meter extends LinearUnit<Meter> {
    private final BigDecimal value;

    public Meter(@NotNull BigDecimal value) {
        this.value = value;
    }


    @NotNull
    public static Meter valueOf(@NotNull BigDecimal value) {
        return new Meter(value);
    }

    @Override
    @NotNull
    public String name() {
        return "метр";
    }

    @Override
    @NotNull
    public String alias() {
        return "м";
    }

    @Override
    public <U extends LinearUnit<U>> @NotNull U convertTo(@NotNull MeasureUnitConverter<Meter, U> converter) {
        return converter.back(this);
    }


    @Override
    public @NotNull Meter add(@NotNull Meter other) {
        return new Meter(
                this.value.add(other.value)
        );
    }

    @Override
    @NotNull
    public Meter multiply(@NotNull Value value) {
        return new Meter(
                this.value.multiply(value.unwrap())
        );
    }

    @Override
    @NotNull
    public Meter divide(@NotNull Value value) {
        return new Meter(
                this.value.divide(value.unwrap(), RoundingMode.HALF_UP)
        );
    }

    @Override
    public String toString() {
        return "метров: " + value;
    }
}
