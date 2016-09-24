package ru.mercuriev;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExpressionFactoryTest {

    @Test
    public void expressionWithTwoAdditionsEvaluates(){

        // 1. Given
        Expression expression = ExpressionFactory.createExpression("2 + 2 + 2");

        // 2. When
        double result = expression.eval();

        // 3. Then
        assertThat(result, is(6d));
    }

    @Test
    public void expressionWithAdditionAndSubtractionEvaluates(){

        // 1. Given
        Expression expression = ExpressionFactory.createExpression("2 + 7 - 3");

        // 2. When
        double result = expression.eval();

        // 3. Then
        assertThat(result, is(6d));
    }

    @Test
    public void expressionWith3AdditionsEvaluates(){

        // 1. Given
        Expression expression = ExpressionFactory.createExpression("1 + 2 + 4 + 3");

        // 2. When
        double result = expression.eval();

        // 3. Then
        assertThat(result, is(10d));
    }
}
