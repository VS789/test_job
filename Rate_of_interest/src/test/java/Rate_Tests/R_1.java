package Rate_Tests;

import RateChecker.RateChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class R_1 extends AbstractTest {
    RateChecker rateChecker;
    @Test(dataProvider = "amountData")
    public void checkRate (int amount)throws Exception{
        rateChecker = RateChecker.get();
        System.out.println("Check rate for " + amount + " dollars");
        Assert.assertEquals(rateCalculation.calculatePercent(amount),rateChecker.percentChecker(amount));
    }
}
