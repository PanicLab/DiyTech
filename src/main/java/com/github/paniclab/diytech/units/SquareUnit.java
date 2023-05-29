package com.github.paniclab.diytech.units;

import net.jodah.typetools.TypeResolver;
import org.jetbrains.annotations.NotNull;


public abstract class SquareUnit<T extends SquareUnit<T>> implements MeasureUnit<T> {
    @Override
    public @NotNull String description() {
        return "Единица площади";
    }

    @NotNull
    @SuppressWarnings("unchecked")
    public Class<T> getUnitType() {
        return (Class<T>) TypeResolver.resolveRawArgument(LinearUnit.class, getClass());
    }

    @Override
    @NotNull
    public EssenceFeature feature() {
        return EssenceFeature.SQUARE;
    }
}
