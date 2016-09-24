package ru.mercuriev;

public class ExpressionFactory {

    public static Expression createExpression(String s) {
        if (s.matches(".*[\\+\\-].*")) {
            String[] r = Parser.parse(s);
            String left = r[0];
            String op = r[1];
            String right = r[2];
            return BinaryOperation.createBinaryOperation(op, createExpression(left), createExpression(right));
        } else if (s.matches(".*\\d+.*")) {
            return new DoubleValue(s);
        }
        throw new IllegalArgumentException();
    }


    private static class Parser {

        private static int getIndex(String s) {
            int index = -1;
            if (s.contains("+")) {
                index = s.indexOf("+");
                if (s.contains("-")) {
                    index = Math.min(s.indexOf("-"), index);
                }
            } else if (s.contains("-")) {
                index = s.indexOf("-");
            }
            if (index == -1) {
                throw new IllegalArgumentException("No operations on" + s);
            }
            return index;
        }

        public static String[] parse(String s) {
            int index = getIndex(s);
            String op = s.substring(index, index + 1);
            String left = s.substring(0, index).trim();
            String right = s.substring(index + 1).trim();
            return new String[]{left, op, right};
        }
    }
}
