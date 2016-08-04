package RateCalculation;

public class RateCalculation {
    private static RateCalculation rateCalculation;
    public static RateCalculation get(){
        if (rateCalculation== null){
            rateCalculation = new RateCalculation();
        }
        return rateCalculation;
    }
    public float calculatePercent(float amount){
        return amount;
    }
}
