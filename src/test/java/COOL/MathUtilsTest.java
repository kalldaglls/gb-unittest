package COOL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "{1,1},{4,1,1}"
    })
    public void shouldFindAfterFour2(int [] expected, int [] a) {
        Assertions.assertArrayEquals(expected,MathUtils.findElmentsInArrayAfterFour(a, 4));
    }

    @Test
    public void shouldFindAfterFour1() {
        Assertions.assertArrayEquals(new int[]{6, 5},MathUtils.findElmentsInArrayAfterFour(new int[]{1, 2, 3, 4, 5, 6},4));
        MathUtils.findElmentsInArrayAfterFour(new int[]{6, 5, 4, 3, 2, 4},4);
        MathUtils.findElmentsInArrayAfterFour(new int[]{4, 4, 4, 4},4);
        MathUtils.findElmentsInArrayAfterFour(new int[]{4},4);
        MathUtils.findElmentsInArrayAfterFour(new int[]{},4);
    }

    @Test
    public void shouldCheckForSpecificNumbers () {
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 4, 1, 4, 1, 4}));
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{4, 4, 4, 4, 4, 4}));
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 1, 1, 1, 1, 1}));
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 1, 4, 1, 1, 1}));
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 4, 1, 5, 1, 4}));
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{}));
    }


    @ParameterizedTest
    @MethodSource("wrongParametrs")
    public void shouldCheckForSpecificNumbers1 (int [] value) {
        Assertions.assertTrue(MathUtils.checkArrayForNumbers(value));
        //Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{4, 4, 4, 4, 4, 4}));
       // Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 4, 1, 5, 1, 4}));
        //Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{}));
      //  Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 1, 1, 1, 1, 1}));
       // Assertions.assertTrue(MathUtils.checkArrayForNumbers(new int[]{1, 1, 4, 1, 1, 1}));
    }

    private static Stream<Arguments> wrongParametrs() {
        return Stream.of(
                Arguments.arguments((Object) new int[]{1, 4, 1, 4, 1, 4}),
                Arguments.arguments((Object) new int[]{1, 4, 1, 5, 1, 4}),
                Arguments.arguments((Object) new int[]{}),
                Arguments.arguments((Object) new int[]{1, 1, 1, 1, 1, 1})//Почему заставил кастить Object?
                );
    }
    /*
    @ParameterizedTest
    @CsvSource({
        "-2, 2, -4", "0, 2, -4"
    })
    public void shouldDoSuccessfulCalculation(int expected, int a, int b) {
        int result = MathUtils.calc(a, b);
        //Assertions.assertEquals(expected,result);
        //System.out.println("First is done green!");
        Assertions.assertEquals(expected,result);
        System.out.println("Second is done green!");

        /*
        if (result == 6) {
            System.out.println("PASSED");
        } else System.out.println("FAILED");
        // throw new RuntimeException("SWW");//Красный тест!
        // MathUtils.calc(99,1);
       // int [] array = {1,2,3,4,5,6};
        //MathUtils.arrayToChange(array);
         */
    /*


    }
    /*
    @ParameterizedTest
    @MethodSource("divPar")
    public void shouldDoSuccessfulDivide1 (double expected, double a, double b) {
        Assertions.assertEquals(expected,MathUtils.divide(a,b));
    }

    private static Stream<Arguments> divPar () {
        return Stream.of(
                Arguments.arguments(2,4,2),
                Arguments.arguments(2,6,3),
                Arguments.arguments(2,7,3)
        );

    }

    @Test
    public void shouldBeAlwaysGreen () {
        Assertions.assertTrue(false);
    }

    @Test
    public void shouldDoSuccessfulDivide2 () {
        Assertions.assertEquals(2,MathUtils.divide(4,2));
    }

    @Test
    public void shouldThrow () {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtils.divide(4, 0);
            }
        });

        Assertions.assertEquals("Can't be divided by zero!",ex.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
    "3,9", "2,4", "1,2","3,4"
    }
    )
    public void shouldCalcSqrt (double expected, double a) {//Как сделать этот тест через Assertions?
        Assertions.assertEquals(expected,MathUtils.sqrt(a));

    }

     */

}
