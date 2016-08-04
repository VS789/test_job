package Rate_Tests;

import RateCalculation.RateCalculation;
import org.testng.annotations.*;

public abstract class AbstractTest {
    RateCalculation rateCalculation;
    @DataProvider
    public Object[][] amountData(){
        return new Object[][]{
                new Object[] {-1},{0},{99.99},{100},{999.99},{1000}
        };
    }
    @BeforeClass(alwaysRun = true)
    public void precondition(){
        rateCalculation = RateCalculation.get();
        System.out.println("Test is started");
    }
    @AfterClass(alwaysRun = true)
    public void End(){
        System.out.println("Test is finished");
    }
}
