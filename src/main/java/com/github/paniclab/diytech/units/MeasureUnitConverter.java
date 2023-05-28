package com.github.paniclab.diytech.units;

public interface MeasureUnitConverter<T extends MeasureUnit, U extends MeasureUnit> {
    T there(U unit);
    U back(T unit);
}
