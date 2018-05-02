package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;

public class ControlSaveAccount {
    
    
    public static String getSaveAccountValue(){
        return formatInEuro(Data.getCurrentSavAcc());
    }
    
    public static String getInterestProcent(){
        return formatInProcent(Data.getCurrentInterestRate());
    }
    
    public static boolean processAddAmountToSaveAcc(String sAmount){
        
        double amount = Double.parseDouble(sAmount);
        
        if(Data.getCurrentBankAcc() < amount){
            return false;
        }
        double oldAmount = Data.getCurrentSavAcc();
        double oldBank = Data.getCurrentBankAcc();
        Data.addBankAcc(oldBank +(amount*(-1)));
        Data.addSavAcc(oldAmount + amount);
        return true;
        
    }
    
    public static boolean processRemovefromSaveAcc(String sAmount){
        
        double amount = Double.parseDouble(sAmount);
        
        if(amount > Data.getCurrentSavAcc()){
            return false;
        }
        
        double oldSave = Data.getCurrentSavAcc();
        double oldBank = Data.getCurrentBankAcc();
        
        Data.addSavAcc(oldSave - amount);
        Data.addBankAcc(oldBank + amount);
        return true;
        
    }
    
    
        
    private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
    private static String formatInProcent(double d){
        DecimalFormat f = new DecimalFormat("#0.00%");
        return f.format(d);
     }
    
}
