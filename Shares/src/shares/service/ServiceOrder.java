package shares.service;

import shares.data.Data;

public class ServiceOrder {
    
    public static void buyShare(int count){
        //calc costs and calculate bank account
        double rate = Data.getCurrentAShare();
        double cost = (rate * count) *(-1);
        double newBankAcc = Data.getCurrentBankAcc() + cost;
        Data.addBankAcc(newBankAcc);
        
        //add count to portfolio
        int oldCount = Data.getCurrentHoldShareA();
        Data.addCountShareA(count + oldCount);
               
    }
    
    public static void sellOrder(int count){
        
       //get earnings
       double rate = Data.getCurrentAShare();
       double earning = rate * count;
       double newBankAcc = Data.getCurrentBankAcc() + earning;
       Data.addBankAcc(newBankAcc);
       
       //refresh portfolio
       int oldHolding = Data.getCurrentHoldShareA();
       Data.addCountShareA(oldHolding - count);
               
    }
    
}
