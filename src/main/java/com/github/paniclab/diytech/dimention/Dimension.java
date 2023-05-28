package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.units.MeasureUnit;
import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;


public abstract class Dimension<T extends Dimension<T, U>, U extends MeasureUnit<U>> {
    @NotNull
    public abstract U value();

    @NotNull
    public Dimension<T, U> getDimension() {
        return this;
    }

    @NotNull
    public abstract T add(@NotNull T other);

    @NotNull
    public abstract Dimension<T, U> multiply(@NotNull Value value);
    @NotNull
    public abstract Dimension<T, U> divide(@NotNull Value value);
}
