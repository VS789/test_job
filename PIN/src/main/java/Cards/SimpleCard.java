package Cards;

public class SimpleCard {
    private String defaultCardName = "8238 2367 0378 7834";
    private String defaultCardPin = "1234";
    private static SimpleCard simpleCard;
    public static SimpleCard get(){
        if (simpleCard== null){
            simpleCard = new SimpleCard();
        }
        return simpleCard;
    }
    public String cardNumber(){
        return defaultCardName;
    }
    public String cardPin(){
        return defaultCardPin;
    }
}
