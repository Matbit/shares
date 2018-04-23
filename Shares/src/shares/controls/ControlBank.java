package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;
import shares.service.ServiceBankAcc;

public class ControlBank {
    
    public static String getBankAcc(){
        
        return formatInEuro(Data.getCurrentBankAcc());
    }
    
    public static void setBankAcc(String amount){
        
        double dValue = parseAString(amount);
        double newBankAcc = ServiceBankAcc.calcBankAcc(dValue);
        Data.addBankAcc(newBankAcc);
    }
    
    public static String getCurrentPortfolio(){
        return formatInEuro(ServiceBankAcc.calcCurrentPortfolio());
    }
    
    
    
    private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
    
    private static double parseAString(String s){
        
        return Double.parseDouble(s);
        
    }
}
