package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.units.LinearUnit;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.function.Function;


public class Length<U extends LinearUnit<U>> extends Dimension<Length<U>, U> {
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

    @Override
    public @NotNull U unit() {
        return unit;
    }
}
