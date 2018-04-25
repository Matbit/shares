package shares.service;

import shares.data.Data;


public class ServiceOrder {
    
    public static void buyShare(int count){
        //calc costs and calculate bank account
        double rate = Data.getCurrentAShare();
        double cost = (rate * count) *(-1);
        double newBankAcc = Data.getCurrentBankAcc() + cost;
        
        //add count to portfolio
        Data.addCountShareA(count);
               
    }
    
}
