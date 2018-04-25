package shares.controls;

import shares.data.Data;
import shares.service.ServiceBankAcc;


public class ControlGuiScore {
    
    public static String getStartAmount(){
        
        return Data.getSelectedBankAcc(0)+"€";
    }
    
    public static String getEndCapital(){
        return ServiceBankAcc.getTotalFortune() +"€";
    }
    
    public static String getDiffFortune(){
        return ServiceBankAcc.getDiffFortune()+"€";
    }
    
    
}
