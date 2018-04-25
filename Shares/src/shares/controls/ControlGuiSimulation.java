package shares.controls;

import shares.data.Data;

public class ControlGuiSimulation {
    
    public static String getCompanyName(){
        return Data.getCompanyName();
    }
    
    public static String getHoldShareA(){
        return Data.getCurrentHoldShareA()+"";
    }
    
    public static void newRound(){
        //set new rate
        ControlShare.setAShareRate();
        
    }
    
       
}
