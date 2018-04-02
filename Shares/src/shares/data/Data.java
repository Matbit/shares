package shares.data;

import java.util.ArrayList;
import shares.model.Share;

public class Data {
    
    private static ArrayList aShareRate = new ArrayList();
    
    public static double getCurrentAShare(){
        int i = aShareRate.size();
        
        return (double)aShareRate.get((i-1));
        
    }
    
    public static void addAShareRate(double rate){
        aShareRate.add(rate);
    }
    
    
}
