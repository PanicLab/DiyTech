package com.github.paniclab.diytech.components;

import com.github.paniclab.diytech.units.MeasureUnit;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


public interface MeasureUnitFactory {

    <U extends MeasureUnit> U get(@NotNull BigDecimal value);
}
