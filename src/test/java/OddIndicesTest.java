import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void tesOddIndicesHappyPath() {

        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult= {590, 985, 68};

        OddIndices OddIndices = new OddIndices();
        int [] actualResult = OddIndices.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
