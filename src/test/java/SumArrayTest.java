import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPath() {

        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult= 15;

        SumArray SumArray = new SumArray();
        int actualResult = SumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathNegativeNumbers() {

        int [] array = {-7, -3};
        int expectedResult= -10;

        SumArray SumArray = new SumArray();
        int actualResult = SumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
