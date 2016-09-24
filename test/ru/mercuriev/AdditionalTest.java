package ru.mercuriev;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionalTest {

    @Test
    public void additionOfTwoPositiveNumbersWorksWell(){

        // 1. Given
        Expression leftExpression = new DoubleValue("2");
        Expression rightExpression = new DoubleValue("2");
        Expression addition = new Addition(leftExpression, rightExpression);

        // 2. When
        double result = addition.eval();

        // 3. Then
        assertThat(result, is(4d));
    }

}
