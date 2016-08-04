package CustomerInterfaces;

import CardReaders.SimpleCardReader;
import Cards.SimpleCard;

public class CustomerInterface {
    private String errorMessageCardWasEten = "Your card was eaten. Please contact with as by phone (800-900-9999-0000)";
    private String errorMessageWrongPin = "Wrong Pin";
    private String correctPinMessage = "Succeed enter";
    private String unknownError= "UnknownError";
    private static SimpleCardReader simpleCardReader;
    private static CustomerInterface customerInterface;
    public static CustomerInterface get(){
        if (customerInterface== null){
            customerInterface = new CustomerInterface().init();
        }
        return customerInterface;
    }
    public CustomerInterface init(){
        simpleCardReader = SimpleCardReader.get();
        return this;
    }
    public String inputPin(String pin) {
        System.out.println("Pin was inputted. Checking... ");
        boolean request = simpleCardReader.checkPinCode(pin);
        if (request == true) {
            System.out.println(correctPinMessage);
            return correctPinMessage;
        }
        if (request == false)
            System.out.println(errorMessageWrongPin);
            if (simpleCardReader.getNumberOfTrying() >= 3) {
                System.out.println(errorMessageCardWasEten);
                return errorMessageCardWasEten;
            }
            else return errorMessageWrongPin;
    }
}
