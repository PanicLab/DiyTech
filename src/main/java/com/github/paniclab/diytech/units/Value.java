package com.github.paniclab.diytech.units;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.Objects;


public final class Value {
    private final BigDecimal value;

    private Value(@NotNull BigDecimal value) {
        this.value = value;
    }

    @NotNull
    public static Value of(@NotNull BigDecimal value) {
        return new Value(value);
    }

    @NotNull
    public static Value of(int value) {
        return new Value(BigDecimal.valueOf(value));
    }

    @NotNull
    public static Value of(long value) {
        return new Value(BigDecimal.valueOf(value));
    }

    @NotNull
    public static Value of(double value) {
        return new Value(BigDecimal.valueOf(value));
    }

    @NotNull
    BigDecimal unwrap() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;

        if (obj instanceof Value other) {
            return this.value.equals(other.value);
        }

        return false;
    }

    @Override
    public String toString() {
        return "Value(" + value + ")";
    }
}
