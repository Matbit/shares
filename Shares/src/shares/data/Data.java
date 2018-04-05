package shares.data;

import java.util.ArrayList;
import java.util.Collection;
import shares.model.Player;
import shares.model.Share;

public class Data {
    
    //Share A rate
    private static ArrayList aShareRate = new ArrayList();
    
    public static double getCurrentAShare(){
        int i = aShareRate.size();
        
        return (double)aShareRate.get((i-1));
        
    }
    
    public static void addAShareRate(double rate){
        
        if(getCurrentAShare() < 0.01){
            return;
        }
        
        aShareRate.add(rate);
    }
    
    //BankAcc
    private static ArrayList aBankAcc = new ArrayList();
    
    public static double getCurrentBankAcc(){
        int i = aBankAcc.size();
        return (double) aBankAcc.get(i);
                
    }
    
    public static void addBankAcc(double amount){
        aBankAcc.add(amount);
    }
    
    //Player
    public static Collection <Player> player = new ArrayList();
    
    
}
