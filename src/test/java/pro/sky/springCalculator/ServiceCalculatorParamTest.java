package pro.sky.springCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.springCalculator.Constans.*;
import java.util.stream.Stream;

public class ServiceCalculatorParamTest {

    private ServiceCalculator serviceCalculator = new ServiceCalculator();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int a, int b){
        int result = serviceCalculator.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrectly(int a, int b){
        int result = serviceCalculator.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(int a, int b){
        int result = serviceCalculator.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int a, int b){
        int result = serviceCalculator.divide(a, b);
        assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams(){
        return Stream.of(
                Arguments.of(ONE,TWO),
                Arguments.of(TWO,TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE)
        );
    }

}
