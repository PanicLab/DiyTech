package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;


public interface MeasureUnit<T extends MeasureUnit<T>> {
    @NotNull
    String name();
    @NotNull
    String alias();
    @NotNull
    String description();
    @NotNull
    EssenceFeature feature();

    @NotNull T add(@NotNull T other);
    @NotNull
    T multiply(@NotNull Value value);
    @NotNull
    T divide(@NotNull Value value);
}
