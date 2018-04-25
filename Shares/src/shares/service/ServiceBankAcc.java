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
    
    public static double getTotalFortune(){
        return calcCurrentPortfolio()+ Data.getCurrentBankAcc();
    }
    
    public static double getDiffFortune(){
        return getTotalFortune() - Data.getSelectedBankAcc(0); 
    }
    
    public static double getProcentTotal(){
        double start = Data.getSelectedBankAcc(0);
        double end = getDiffFortune();
        return (end*100/start)/100;
    }
    
    
}
