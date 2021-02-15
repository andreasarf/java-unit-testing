package org.andreasarf.shared;

public class ExternalCalculation {
    private static final int INITIAL_CONST_X = 2;
    private static final int INITIAL_CONST_Y = 3;
    private int constX;
    private int constY;

    public ExternalCalculation() {
        constX = INITIAL_CONST_X;
        constY = INITIAL_CONST_Y;
    }

    public ExternalCalculation(int seed) {
        constX = seed + 1 + INITIAL_CONST_X;
        constY = seed - 1 + INITIAL_CONST_Y;
    }

    public int getConstX() {
        return constX;
    }

    public int getConstY() {
        return constY;
    }

}
