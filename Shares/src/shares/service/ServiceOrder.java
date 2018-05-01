package shares.service;

import shares.data.Data;

public class ServiceOrder {
    
    /**
     * buy operation. Need int value to know which share will be buy. 0 = A
     * 1= B
     * @param count int Shares
     * @param share int 0/1 -> A/B
     */
    public static void buyShare(int count, int share){
        
        if(share == 0){    

        //calc costs and calculate bank account
        double rate = Data.getCurrentAShare();
        double cost = (rate * count) *(-1);
        double newBankAcc = Data.getCurrentBankAcc() + cost;
        Data.addBankAcc(newBankAcc);
        
        //add count to portfolio
        int oldCount = Data.getCurrentHoldShareA();
        Data.addCountShareA(count + oldCount);
               
    }
        else if(share == 1){
            double rate = Data.getCurrentBShare();
            double cost = (rate * count) *(-1);
            double newBankAcc = Data.getCurrentBankAcc() + cost;
            Data.addBankAcc(newBankAcc);
        
        //add count to portfolio
        int oldCount = Data.getCurrentHoldShareB();
        Data.addCountShareB(count + oldCount);
        }
    }
    
    public static void sellOrder(int count, int share){
       
        if(share == 0){
       //get earnings
       double rate = Data.getCurrentAShare();
       double earning = rate * count;
       double newBankAcc = Data.getCurrentBankAcc() + earning;
       Data.addBankAcc(newBankAcc);
       
       //refresh portfolio
       int oldHolding = Data.getCurrentHoldShareA();
       Data.addCountShareA(oldHolding - count);
       }
        else if(share == 1){
            
       //get earnings
       double rate = Data.getCurrentBShare();
       double earning = rate * count;
       double newBankAcc = Data.getCurrentBankAcc() + earning;
       Data.addBankAcc(newBankAcc);
       
       //refresh portfolio
       int oldHolding = Data.getCurrentHoldShareB();
       Data.addCountShareB(oldHolding - count);
        }
               
    }
    
}
