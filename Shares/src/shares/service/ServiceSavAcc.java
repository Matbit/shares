package shares.service;

import shares.data.Data;

public class ServiceSavAcc {
    
    public static void calcSavNewRound(double interestRate){
        double savAcc = Data.getCurrentSavAcc();
        double profit = (((savAcc/100)* interestRate)/360);
        Data.addSavAcc(savAcc + profit);
    }
    
    public static double calcNewInterestRate(){
        double oldRate = Data.getCurrentInterestRate();
        
        
        double plusOrMinus = (int) (Math.random()*100);
        
        if(plusOrMinus > 49)
            return (oldRate + 0.1);
        else return (oldRate - 0.1);
    }
    
}
