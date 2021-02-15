package org.andreasarf;

import org.andreasarf.shared.ExternalCalculation;

public class MultiPurposeTool {
    private ExternalCalculation extCalculation;

    public MultiPurposeTool(ExternalCalculation extCalculation) {
        this.extCalculation = extCalculation;
    }

    public double calculateWeight(double x, double y) {
        return extCalculation.getConstX() * x + extCalculation.getConstY() * y;
    }
}
