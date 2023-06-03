package com.github.paniclab.diytech.units;

import com.github.paniclab.diytech.Reducible;
import net.jodah.typetools.TypeResolver;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class LinearUnit<T extends LinearUnit<T>> implements MeasureUnit<T>, Reducible<T> {
    @NotNull
    protected abstract BigDecimal value();

    @Override
    public @NotNull String description() {
        return "Единица линейной размерности";
    }

    @NotNull
    @SuppressWarnings("unchecked")
    public Class<T> getUnitType() {
        return (Class<T>) TypeResolver.resolveRawArgument(LinearUnit.class, getClass());
    }

    @Override
    @NotNull
    public EssenceFeature feature() {
        return EssenceFeature.LINEAR;
    }

    @NotNull
    public abstract SquareUnit<? extends SquareUnit<?>> multiply(@NotNull T other);

    @Override
    public Value divide(@NotNull T other) {
        return Value.of(
                value().divide(other.value(), RoundingMode.HALF_UP)
        );
    }
}
