package ru.mercuriev;

public class Subtraction extends BinaryOperation {

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double eval() {
        return left.eval() - right.eval();
    }
}
