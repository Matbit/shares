package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;
import shares.service.ServiceValueCalculation;

public class ControlShare {
    
    //get Share A current marketRate
     public static String getAShareRate(){
         return formatInEuro(Data.getCurrentAShare());
     }
     
     private static double getAShareAsDouble(){
         return Data.getCurrentAShare();
     }
     
     public static void setAShareRate(){
         double newRate = ServiceValueCalculation.calcNewRate(getAShareAsDouble());
         Data.addAShareRate(newRate);
     }
     
     //get Share B current marketRate
     public static String getBSharerate(){
         return formatInEuro(Data.getCurrentBShare());
     }
     
     private static double getBShareAsDouble(){
         return Data.getCurrentBShare();
     }
     
     public static void setBShareRate(){
         double newRate = ServiceValueCalculation.shareManagementSystem();
         Data.addBShareRate(newRate);
     }
     
     //check if share is busted
     public static boolean isBBusted(){
         if(Data.getCurrentBShare() < 0.01){
             return true;
         }
         else return false;
     }
     
     public static boolean isABusted(){
         if(Data.getCurrentAShare() < 0.01){
             return true;
         }
         else return false;
     }
     
     //0 = A , 1 = B
     public static void cleanBustedShare(int bustedShare){
        int hold;
                
         if(bustedShare == 0){
             Data.addCountShareA(0);
        } 
        if(bustedShare == 1){
            Data.addCountShareB(0);
        }
        
         
         
     }
     
          
     private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
}
