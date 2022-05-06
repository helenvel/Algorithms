import org.junit.jupiter.api.*;

public class OddEvenTest {

    @Test
    public void tesOddEvenHappyPathOne() {

        long number = 1;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathTwo() {

       long number = 2;

        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathThree() {

        long number = -1;

        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathFour() {

       long number = -2;

        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathFive() {

        long number = 0;

        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenNegativeUndefined() {

        long number = - 2147483649L;

        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenPositiveUndefined() {

        long number = 2147483648L;

        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
