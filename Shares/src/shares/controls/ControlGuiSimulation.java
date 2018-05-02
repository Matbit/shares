package shares.controls;

import java.time.LocalDate;
import java.time.Month;
import shares.data.Data;
import shares.service.ServiceSavAcc;

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
        ServiceSavAcc.calcSavNewRound(Data.getCurrentInterestRate());
        ServiceSavAcc.calcNewInterestRate();
        calcNewDate();
        
    }
    
    //set datetime plus one day
    public static void calcNewDate(){
        LocalDate old = Data.getDateTime();
        
         Data.setDateTime(old.plusDays(1));                       
    }
    
    public static String getCurrentDate(){
        return Data.getDateTime().toString();
    }
    
    
           
}
