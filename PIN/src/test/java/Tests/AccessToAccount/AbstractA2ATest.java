package Tests.AccessToAccount;

import CardReaders.SimpleCardReader;
import CustomerInterfaces.*;
import Tests.Simple.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public abstract class AbstractA2ATest extends AbstractTest{
    private String wrongPin = "00000000";
    private String correctPin = "1234";
    private String errorMessageCardWasEten = "Your card was eaten. Please contact with as by phone (800-900-9999-0000)";
    private String errorMessageWrongPin = "Wrong Pin";
    private String correctPinMessage = "Succeed enter";
    private CustomerInterface customerInterface;
    SimpleCardReader simpleCardReader;
    @BeforeClass(alwaysRun = true)
    public void precondition(){
        simpleCardReader = SimpleCardReader.get();
        customerInterface = CustomerInterface.get();
        if (simpleCardReader.readCard()==null){System.out.println("Card was not inserted");}
        Assert.assertNotNull(simpleCardReader.readCard());
    }
    protected void validPinInput(){
        Assert.assertEquals(correctPinMessage,customerInterface.inputPin(correctPin));
    }
    protected void invalidPinInput(){
        Assert.assertEquals(errorMessageWrongPin,customerInterface.inputPin(wrongPin));
    }
    protected void eatCard(){
        Assert.assertEquals(errorMessageWrongPin,customerInterface.inputPin(wrongPin));
        Assert.assertEquals(errorMessageWrongPin,customerInterface.inputPin(wrongPin));
        Assert.assertEquals(errorMessageCardWasEten,customerInterface.inputPin(wrongPin));
    }
}
