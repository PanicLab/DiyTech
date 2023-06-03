package com.github.paniclab.diytech.units;

import net.jodah.typetools.TypeResolver;
import org.jetbrains.annotations.NotNull;

import java.math.RoundingMode;


public abstract class LinearUnit<T extends LinearUnit<T>> extends AbstractUnit<T> {
    @Override
    public @NotNull String description() {
        return "Единица линейной размерности";
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
