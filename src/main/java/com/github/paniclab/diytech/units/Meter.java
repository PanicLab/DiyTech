package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


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
}
