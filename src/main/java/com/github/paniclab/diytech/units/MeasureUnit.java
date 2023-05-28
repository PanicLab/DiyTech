package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;


public interface MeasureUnit {
    @NotNull
    String name();
    @NotNull
    String alias();
    @NotNull
    String description();
    @NotNull
    EssenceFeature feature();
}
