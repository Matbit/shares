package shares.service;

import shares.data.Data;


public class ServiceBankAcc {
    
    public static double calcBankAcc(double amount){
        
        double old = Data.getCurrentBankAcc();
        return old + amount;        
    }
    
    public static double calcCurrentPortfolio(){
        double rate = Data.getCurrentAShare();
        double holding = Data.getCurrentHoldShareA();
        
        return rate * holding;
    }
    
    
}
