package com.company;

public class Number {
    private int numeric;
    private NumberType type;

    public Number() {
    }

    public Number(int numeric, NumberType type) {
        this.numeric = numeric;
        this.type = type;
    }

    public int getNumeric() {
        return numeric;
    }

    public NumberType getType() {
        return type;
    }
}
