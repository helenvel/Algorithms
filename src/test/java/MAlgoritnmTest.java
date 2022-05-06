import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MAlgoritnmTest {


    @Test
    public void testMAlgoritnmHappyPath(){

        int number = 15;
        String expectedResult = "Good Number";

        MAlgoritnm mAlgoritnm = new MAlgoritnm();
        String actualResult = mAlgoritnm.MAlgoritnm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testMAlgoritnmHappyPath2(){

        int number = 9;
        String expectedResult = "Bad Number";

        MAlgoritnm mAlgoritnm = new MAlgoritnm();
        String actualResult = mAlgoritnm.MAlgoritnm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMAlgoritnmHappyPath3(){

        int number = 10;
        String expectedResult = "Poor Number";

        MAlgoritnm mAlgoritnm = new MAlgoritnm();
        String actualResult = mAlgoritnm.MAlgoritnm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMAlgoritnmNegativePath4(){

        int number = 7;
        String expectedResult = "-1";

        MAlgoritnm mAlgoritnm = new MAlgoritnm();
        String actualResult = mAlgoritnm.MAlgoritnm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
