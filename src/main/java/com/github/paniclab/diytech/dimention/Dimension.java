package com.github.paniclab.diytech.dimention;

import com.github.paniclab.diytech.Scalable;
import com.github.paniclab.diytech.Reducible;
import com.github.paniclab.diytech.units.MeasureUnit;
import org.jetbrains.annotations.NotNull;


public abstract class Dimension<T extends Dimension<T, U>, U extends MeasureUnit<U>> implements Scalable<Dimension<T, U>>, Reducible<Dimension<?, U>> {
    @NotNull
    public abstract U unit();

    @NotNull
    public Dimension<T, U> getDimension() {
        return this;
    }
}
