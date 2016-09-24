package ru.mercuriev;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DoubleValueTest {

    @Test
    public void positiveDoubleValueCreatedSuccessfully() {

        // 2. When
        Expression expression = new DoubleValue("1.3");

        // 3. Then
        assertThat(expression.eval(), is(1.3d));
    }

    @Test
    public void negativeDoubleValueCreatedSuccessfully() {

        // 2. When
        Expression expression = new DoubleValue("-1.4");

        // 3. Then
        assertThat(expression.eval(), is(-1.4d));

    }

    @Test(expected = IllegalArgumentException.class)
    public void nonDoubleValueDontCreates() {

        // 2. When
        Expression value = new DoubleValue("aaa");
    }
}
