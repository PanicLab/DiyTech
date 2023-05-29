package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Scalable;
import com.github.paniclab.diytech.Summable;
import com.github.paniclab.diytech.units.MeasureUnit;
import org.jetbrains.annotations.NotNull;


public abstract class Dimension<T extends Dimension<T, U>, U extends MeasureUnit<U>> implements Scalable<Dimension<T, U>>, Summable<T> {
    @NotNull
    public abstract U value();

    @NotNull
    public Dimension<T, U> getDimension() {
        return this;
    }
}
