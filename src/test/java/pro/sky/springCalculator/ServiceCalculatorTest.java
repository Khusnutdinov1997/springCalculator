package pro.sky.springCalculator;

import org.junit.jupiter.api.Test;
import pro.sky.springCalculator.exeption.DivisionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.springCalculator.Constans.*;


class ServiceCalculatorTest {

    private final ServiceCalculator serviceCalculator = new ServiceCalculator();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = serviceCalculator.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = serviceCalculator.plus(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnOneWhenMinusTwoAndOne() {
        int result = serviceCalculator.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnZeroWhenMinusOneAndOne() {
        int result = serviceCalculator.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }
   @Test
    public void shouldReturnOneWhenMultiplyOneAndOne() {
        int result = serviceCalculator.multiply(ONE, ONE);
        assertEquals(ONE * ONE, result);
    }
   @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne() {
        int result = serviceCalculator.multiply(TWO, ONE);
        assertEquals(TWO * ONE, result);
    }
  @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        int result = serviceCalculator.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }
  @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        int result = serviceCalculator.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
    public void shouldReturnDivisionExceptionWhenDivideZero(){
        assertThrows(DivisionException.class, () -> serviceCalculator.divide(ONE, ZERO) );
    }

}