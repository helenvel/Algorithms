import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqual(){

        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual1(){

        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual2(){

        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual3(){

        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.AreNumbersEqualAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
