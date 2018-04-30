package shares.controls;

import shares.data.Data;

public class ControlGuiSimulation {
    
    public static String getCompanyName(){
        return Data.getCompanyName();
    }
    
    public static String getCompanyNameB(){
        return Data.getCompanyNameB();
    }
    
    public static String getHoldShareA(){
        return Data.getCurrentHoldShareA()+"";
    }
    
    public static String getHoldShareB(){
        return Data.getCurrentHoldShareB()+"";
    }
    
    public static void newRound(){
        //set new rate
        ControlShare.setAShareRate();
        ControlShare.setBShareRate();
        
    }
    
    
           
}
