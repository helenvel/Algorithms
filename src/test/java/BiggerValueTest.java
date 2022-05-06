import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void biggerValueHappyPath(){

        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void biggerValueHappyPathNegative(){

        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = -3333;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void biggerValueEqual(){

        int number1 = 3333;
        int number2 = 3333;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void biggerValueZero(){

        int number1 = 0;
        int number2 = 3333;
        int expectedResult = 3333;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void biggerValueZero2(){

        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
