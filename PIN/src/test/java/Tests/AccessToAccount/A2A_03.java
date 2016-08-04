package Tests.AccessToAccount;

import org.testng.annotations.Test;

public class A2A_03 extends AbstractA2ATest {
    @Test(groups = {"A2A","P0"})
    public void validPinEntryForThirdTry(){
        invalidPinInput();
        invalidPinInput();
        validPinInput();
    }
}
