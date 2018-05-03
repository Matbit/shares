package shares.service;

import shares.data.Data;

public class ServiceSavAcc {
    
   
    public static void calcSavNewRound(double interestRate){
        double savAcc = Data.getCurrentSavAcc();
        double profit = (((savAcc/100)* interestRate)/360*100);
        Data.addSavAcc(savAcc + profit);
    }
    
    public static void calcNewInterestRate(){
        double oldRate = Data.getCurrentInterestRate();
        
        
        int plusOrMinus = (int) (Math.random()*100);
        
        if(plusOrMinus > 49)
            Data.addInterestRate(oldRate + 0.0001);
        else Data.addInterestRate(oldRate - 0.0001);
       
    }
    
}
