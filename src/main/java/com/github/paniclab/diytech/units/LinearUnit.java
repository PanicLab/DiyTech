package com.github.paniclab.diytech.units;

import net.jodah.typetools.TypeResolver;
import org.jetbrains.annotations.NotNull;


public abstract class LinearUnit<T extends LinearUnit<T>> implements MeasureUnit {
    @Override
    public @NotNull String description() {
        return "Единица длины";
    }

    @NotNull
    @SuppressWarnings("unchecked")
    public Class<T> getUnitType() {
        return (Class<T>) TypeResolver.resolveRawArgument(LinearUnit.class, getClass());
    }

    @Override
    @NotNull
    public EssenceFeature feature() {
        return EssenceFeature.LINEAR_DIMENSION;
    }

    @NotNull
    public abstract <U extends LinearUnit<U>> U convertTo(@NotNull MeasureUnitConverter<T, U> converter);
}
