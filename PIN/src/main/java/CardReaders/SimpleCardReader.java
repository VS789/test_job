package CardReaders;

import Cards.SimpleCard;

public class SimpleCardReader {
    private static SimpleCardReader simpleCardReader;
    private static SimpleCard simpleCard;
    private static int numberOfTrying = 0;
    public static SimpleCardReader get(){
        if (simpleCardReader== null){
            simpleCardReader = new SimpleCardReader().inputCard();
        }
        return simpleCardReader;
    }
    public SimpleCardReader inputCard(){
        simpleCard = SimpleCard.get();
        return this;
    }
    public String readCard(){
        String number = simpleCard.cardNumber();
        return number;
    }
    public boolean checkPinCode(String pin){
        if (pin.equals(simpleCard.cardPin())){numberOfTrying = 0;return true;}
        if (!pin.equals(simpleCard.cardPin())){
            numberOfTrying++;
            if (numberOfTrying >=3){eatCard();return false;}
            else return false;
        }
        else return false;
    }

    public int getNumberOfTrying(){
        return numberOfTrying;
    }

    protected void eatCard(){
        System.out.println("Card was eaten by card reader");blockCard();
    }
    protected void blockCard(){}
}
