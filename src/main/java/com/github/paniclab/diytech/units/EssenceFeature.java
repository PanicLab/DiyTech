package com.github.paniclab.diytech.units;

public enum EssenceFeature {
    LINEAR("Линейный размер (длина, ширина, высота и т.д.)"),
    SQUARE("Площадь"),
    VOLUME("Объем"),
    DENSITY("Плотность"),
    MASS("Масса"),
    TEMPERATURE("Температура"),
    HEAT_CAPACITY("Теплоемкость"),
    THERMAL_CONDUCTIVITY("Теплопроводность"),
    POWER("Мощность"),
    TIME("Время")
    ;

    private final String description;

    EssenceFeature(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }
}
