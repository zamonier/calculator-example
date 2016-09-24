package ru.mercuriev;

public abstract class BinaryOperation implements Expression {

    protected final Expression left;
    protected final Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public static Expression createBinaryOperation(String operation, Expression left, Expression right) {
        if ("+".equals(operation)) {
            return new Addition(left, right);
        } else if ("-".equals(operation)) {
            return new Subtraction(left, right);
        }
        throw new IllegalArgumentException("Wrong operation " + operation);
    }


}
