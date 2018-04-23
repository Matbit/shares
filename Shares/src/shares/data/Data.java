package shares.data;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import shares.model.Player;
//import shares.model.Share;

public class Data {
    
    //Share A rate
    private static ArrayList aShareRate = new ArrayList();
    
    public static double getCurrentAShare(){
        int i = aShareRate.size();
        
        return (double)aShareRate.get((i-1));
        
    }
    
    public static void addAShareRate(double rate){
        
        if(!aShareRate.isEmpty()){
        
            if(getCurrentAShare() < 0.01){
            return;
            }
        }
        
        aShareRate.add(rate);
    }
    
    private static String companyName;
    
     
    public static String getCompanyName() {
        return companyName;
    }

   
    public static void setCompanyName(String aCompanyName) {
        companyName = aCompanyName;
    }
    
    
    
    //BankAcc
    private static ArrayList aBankAcc = new ArrayList();
    
    public static double getCurrentBankAcc(){
        int i = aBankAcc.size();
        return (double) aBankAcc.get((i-1));
                
    }
    
    public static void addBankAcc(double amount){
        aBankAcc.add(amount);
    }
    
    //Player
    private static List <Player> listPlayer = new ArrayList();
    
    public static void addPlayer(Player aPlayer){
        listPlayer.add(aPlayer);
    }
    
    public static Player getAPlayer(){
       return listPlayer.get(0);
    }
    
    //count how many Share A shares were bought
    private static ArrayList holdShareA = new ArrayList();
    
    public static int getCurrentHoldShareA(){
        int i = holdShareA.size();
        return (int) holdShareA.get((i-1));
    }
    
    public static void addCountShareA(int count){
        holdShareA.add(count);
    }
    
}
