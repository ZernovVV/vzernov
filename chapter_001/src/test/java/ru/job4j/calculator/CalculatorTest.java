package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author vzernov
 * @since 20.02.2018
 * @version 1
 */
public class CalculatorTest {
    /**
     * Тест сложения
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Тест вычитания
     */
    @Test
    public void whenSubtractTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.subtract(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Тест деления
     */
    @Test
    public void whenDivThreeByTwoThenOneDotFife() {
        Calculator calc = new Calculator();
        calc.div(3D, 2D);
        double result = calc.getResult();
        double expected = 1.5D;
        assertThat(result, is(expected));
    }

    /**
     * Тест умножения
     */
    @Test
    public void whenMultipleThreeByTwoThenSix() {
        Calculator calc = new Calculator();
        calc.multiple(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}