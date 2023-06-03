package com.github.paniclab.diytech.units;

import com.github.paniclab.diytech.Reducible;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


public abstract class AbstractUnit<T extends AbstractUnit<T>> implements MeasureUnit<T>, Reducible<T> {
    @NotNull
    protected abstract BigDecimal value();
    @NotNull
    public abstract Class<T> getUnitType();
}
