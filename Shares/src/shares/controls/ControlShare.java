package shares.controls;

import java.text.DecimalFormat;
import shares.data.Data;

public class ControlShare {
    
     public static String getAShareRate(){
         return formatInEuro(Data.getCurrentAShare());
     }
     
     private static String formatInEuro(double d){
        DecimalFormat f = new DecimalFormat("#0.00€");
        return f.format(d);
     }
}
