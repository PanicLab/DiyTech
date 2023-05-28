package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.units.MeasureUnit;
import org.jetbrains.annotations.NotNull;


public abstract class Dimension<T extends Dimension<T, U>, U extends MeasureUnit> {
    @NotNull
    public abstract U unit();

    @NotNull
    public Dimension<T, U> getDimension() {
        return this;
    }
}
