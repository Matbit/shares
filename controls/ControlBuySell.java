package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;
import shares.service.ServiceOrder;

public class ControlBuySell {
    
    public static boolean processBuyOrder(String count, int share){
        
        int aCount = Integer.parseInt(count);
        double rate = 0.0;
        
        if(share == 0){
            rate = Data.getCurrentAShare();
        }
        else if(share == 1){
            rate = Data.getCurrentBShare();
        }
        double amountInvest = aCount * rate;
            if(amountInvest > Data.getCurrentBankAcc()){
                return false;
        }
        else ServiceOrder.buyShare(aCount, share);
            return true;
    }
    
    public static boolean processSellOrder(String count, int share){
        
        int aCount = Integer.parseInt(count);
        int currentHolding = 0;
        
        if(share == 0){
            currentHolding = Data.getCurrentHoldShareA();
        }
        else if(share == 1){
            currentHolding = Data.getCurrentHoldShareB();
        }
             
        if(aCount > currentHolding){
            return false;
        }
        else ServiceOrder.sellOrder(aCount, share);
        return true;
        
    }
    
    private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
}
