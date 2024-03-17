import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    public static final int FIRST_NUMBER= 3;
    public static final int SECOND_NUMBER= 4;

    Calculator calculator= new Calculator();

    private int correctResult= 7;
    private int incorrectResult= 8;

    @Test
    public void testCase1(){
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        Assert.assertTrue(actualResult==correctResult);
    }
    @Test
    public void testCase2(){
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        Assert.assertFalse(actualResult==incorrectResult);
    }
    @Test
    public void testCase3(){
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        Assert.assertEquals(actualResult, correctResult);
    }

}
