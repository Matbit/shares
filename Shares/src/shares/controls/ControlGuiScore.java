package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;
import shares.service.ServiceBankAcc;


public class ControlGuiScore {
    
    public static String getStartAmount(){
        
        return formatInEuro(Data.getSelectedBankAcc(0));
    }
    
    public static String getEndCapital(){
        return formatInEuro(ServiceBankAcc.getTotalFortune());
    }
    
    public static String getDiffFortune(){
        return formatInEuro(ServiceBankAcc.getDiffFortune());
    }
    
    public static String getProcentProfit(){
        return formatInProcent(ServiceBankAcc.getProcentTotal());
    }
    
    private static String formatInProcent(double d){
        DecimalFormat f = new DecimalFormat("#0.00%");
        return f.format(d);
     }
    private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
    
    
}
