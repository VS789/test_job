package RateChecker;

public class RateChecker {
    private static RateChecker rateChecker;
    public static RateChecker get(){
        if (rateChecker== null){
            rateChecker = new RateChecker();
        }
        return rateChecker;
    }

    private static final float LIMIT_1 = 100;
    private static final float LIMIT_2 = 1000;
    private static final float PERCENT_1 = 3;
    private static final float PERCENT_2 = 5;
    private static final float PERCENT_3 = 7;

    public float percentChecker(float amount){
        if(amount<0){return amount;}
        if(amount<LIMIT_1){return amount+=amount*PERCENT_1/1200;}
        if(amount<LIMIT_2){return amount+=amount*PERCENT_2/1200;}
        else return amount+=amount*PERCENT_3/1200;
    }
}
