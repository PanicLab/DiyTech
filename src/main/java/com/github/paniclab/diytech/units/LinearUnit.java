package com.github.paniclab.diytech.units;

import net.jodah.typetools.TypeResolver;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


public abstract class LinearUnit<T extends LinearUnit<T>> implements MeasureUnit<T> {
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
}
