package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;
import shares.service.ServiceOrder;

public class ControlBuySell {
    
    public static boolean processBuyOrder(String count){
        
        int aCount = Integer.parseInt(count);
        double rate = Data.getCurrentAShare();
        double amountInvest = aCount * rate;
        if(amountInvest > Data.getCurrentBankAcc()){
            return false;
        }
        else ServiceOrder.buyShare(aCount);
        return true;
    }
    
    public static boolean processSellOrder(String count){
        
        int aCount = Integer.parseInt(count);
        int currentHolding = Data.getCurrentHoldShareA();
        
        if(aCount > currentHolding){
            return false;
        }
        else ServiceOrder.sellOrder(aCount);
        return true;
        
    }
    
    private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
}
