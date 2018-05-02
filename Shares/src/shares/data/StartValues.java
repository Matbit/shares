package shares.data;

public class StartValues {
    
    private static double startCapital = 5000.00;
    private static int holding = 0;
    private static double startSaveAccount = 0.0;
    private static double startInterestRate = 3.5;

    /**
     * @return the startCapital
     */
    public static double getStartCapital() {
        return startCapital;
    }

    /**
     * @param aStartCapital the startCapital to set
     */
    public static void setStartCapital(double aStartCapital) {
        if(aStartCapital >= 1499){
            startCapital = aStartCapital;
        }
        else startCapital = 2000.00;
    }
    
    public static void setStartSaveAccount(){
        Data.addSavAcc(startSaveAccount);
    }
    
    public static void setStartInterestRate(){
        Data.addInterestRate(startInterestRate);
    }

    /**
     * @return the holding
     */
    public static int getHolding() {
        return holding;
    }

    /**
     * @param aHolding the holding to set
     */
    public static void setHolding(int aHolding) {
        if(aHolding < 0)
            holding = 0;
            else holding = aHolding;
            
    }
    
}
