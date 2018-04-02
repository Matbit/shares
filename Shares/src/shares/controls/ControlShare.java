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
         ServiceValueCalculation.calcNewRate(getAShareAsDouble());
     }
     
     
     private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
}
