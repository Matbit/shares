package shares.service;

import shares.data.Data;


public class ServiceBankAcc {
    
    public static double calcBankAcc(double amount){
        
        double old = Data.getCurrentBankAcc();
        return old + amount;        
    }
    
    
}
