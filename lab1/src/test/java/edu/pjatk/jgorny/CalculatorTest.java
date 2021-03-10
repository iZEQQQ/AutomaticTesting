package edu.pjatk.jgorny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void add_correctInput_correctResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.add(4, 6);

//        Assert
        assertEquals(10, result);
    }

    @Test
    public void add_doubleInput_correctResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.add(4.5, 6.5);

//        Assert
        assertEquals(11, result);
    }


    @Test
    public void div_divisionBy0_exception() {
//        Prepare
        Calculator cal = new Calculator();
        try {
//        Execute
            double result = cal.div(4.5, 0);
            fail("Should thrown exception");
        } catch (IllegalArgumentException ex) {
//        Assert
            assertEquals("Division by 0", ex.getMessage());
        }
    }


    @Test
    public void div_dividing2by3_nearCorrectResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.div(2, 3);

//        Assert
        assertEquals(0.67, result, 0.01);
    }

    @Test
    public void sub_correctInput_CorrectResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.sub(2, 3);

//        Assert
        assertEquals(-1, result);
    }

    @Test
    public void isPositive_positiveInput_CorrectResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        boolean result = cal.isPositive(3);

//        Assert
        assertTrue(result);
    }

    @Test
    public void isPositive_negativeInput_CorrectResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        boolean result = cal.isPositive(-3);

//        Assert
        assertFalse(result);
    }

    @Test
    public void mult_correctInput_CorrectResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.mult(4, 4);

//        Assert
        assertEquals(16, result);
    }


    @Test
    public void mult_multiplyingBy0_correctResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.mult(4, 0);

//        Assert
        assertEquals(0, result);
    }

    @Test
    public void mult_multiplyingByNegative_correctResult() {
//        Prepare
        Calculator cal = new Calculator();

//        Execute
        double result = cal.mult(4, -4);

//        Assert
        assertEquals(-16, result);
    }


}