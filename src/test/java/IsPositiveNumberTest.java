import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPathPositiveValue(){

        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumberAlgorithm(number);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }

    @Test
    public void testIsPositiveNumberNegativeValue(){

        int number = - 78789;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumberAlgorithm(number);

        Assertions.assertFalse(expectedResult, String.valueOf(actualResult));
    }

    @Test
    public void testIsPositiveNumberValueZero(){

        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.IsPositiveNumberAlgorithm(number);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));
    }


}
