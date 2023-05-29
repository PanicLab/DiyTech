package com.github.paniclab.diytech;

import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;


public interface Scalable<T> {
    @NotNull
    T multiply(@NotNull Value value);
    @NotNull
    T divide(@NotNull Value value);
}
