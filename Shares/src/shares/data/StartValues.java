/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares.data;

/**
 *
 * @author Big Boss
 */
public class StartValues {
    
    private static double startCapital = 5000.00;
    private static int holding = 0;

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
