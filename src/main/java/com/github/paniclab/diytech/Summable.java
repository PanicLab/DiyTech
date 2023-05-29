package com.github.paniclab.diytech;

import org.jetbrains.annotations.NotNull;


public interface Summable<T> {
    @NotNull
    T add(@NotNull T other);
    @NotNull
    T subtract(@NotNull T other);
}
