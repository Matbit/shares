package shares.controls;

import shares.data.Data;


public class ControlGuiScore {
    
    public static String getStartAmount(){
        
        return ""+Data.getSelectedBankAcc(0);
    }
}
