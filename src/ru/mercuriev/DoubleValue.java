package ru.mercuriev;

public class DoubleValue implements Expression {

    private double value;

    public DoubleValue(String s) {
        this.value = Double.parseDouble(s);
    }

    @Override
    public double eval() {
        return value;
    }
}
