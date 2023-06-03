package com.github.paniclab.diytech;

import com.github.paniclab.diytech.units.Value;
import org.jetbrains.annotations.NotNull;


public interface Reducible<T> {
    Value divide(@NotNull T other);
}
