package com.github.paniclab.diytech.units;

import com.github.paniclab.diytech.Scalable;
import com.github.paniclab.diytech.Summable;
import org.jetbrains.annotations.NotNull;


public interface MeasureUnit<T extends MeasureUnit<T>> extends Scalable<T>, Summable<T> {
    @NotNull
    String name();
    @NotNull
    String alias();
    @NotNull
    String description();
    @NotNull
    EssenceFeature feature();
}
