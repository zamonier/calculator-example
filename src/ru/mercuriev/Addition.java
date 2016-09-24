package ru.mercuriev;

public class Addition extends BinaryOperation {

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double eval() {
        return left.eval() + right.eval();
    }
}
