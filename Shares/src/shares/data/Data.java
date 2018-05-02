package shares.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import shares.model.Player;

public class Data {
    
    //Share A rate
    private static ArrayList aShareRate = new ArrayList();
    
    /**
     * returns a value about current share rate
     * @return aShareRate double
     */
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
    
    //Share B rate
    private static ArrayList bShareRate = new ArrayList();
    
    /**
     * returns a value about current share rate
     * @return aShareRate double
     */
    public static double getCurrentBShare(){
        int i = bShareRate.size();
        
        return (double)bShareRate.get((i-1));
        
    }
    
    /**
     * needs rate of share "b" and saves it in arraylist. 
     * @param rate (double)
     */
    public static void addBShareRate(double rate){
        
        if(!bShareRate.isEmpty()){
        
            if(getCurrentBShare() < 0.01){
            return;
            }
        }
        
        bShareRate.add(rate);
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
    
    public static double getSelectedBankAcc(int index){
        return (double)aBankAcc.get(index);
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
    
    //count how many Share B shares were bought
    private static ArrayList holdShareB = new ArrayList();
    
    public static int getCurrentHoldShareB(){
        int i = holdShareB.size();
        return (int) holdShareB.get((i-1));
    }
    
    public static void addCountShareB(int count){
        holdShareB.add(count);
    }
    
    private static String companyNameB;
    
    /**
     * @return the companyNameB
     */
    public static String getCompanyNameB() {
        return companyNameB;
    }

    /**
     * @param aCompanyNameB the companyNameB to set
     */
    public static void setCompanyNameB(String aCompanyNameB) {
        companyNameB = aCompanyNameB;
    }
    
    
    //Saving Account Data
    private static ArrayList savAcc = new ArrayList();
    
    public static double getCurrentSavAcc(){
        int i = savAcc.size();
        return (double) savAcc.get(i-1);
    }
    
    public static void addSavAcc(double amount){
        savAcc.add(amount);
        
    }
    
    //Save interest rate list
    private static ArrayList interestRate = new ArrayList();
    
    public static double getCurrentInterestRate(){
        int i = interestRate.size();
        return (double) interestRate.get(i-1);
    }
    
    public static void addInterestRate(double rate){
        interestRate.add(rate);
    }
    
    //Save date
    private static LocalDate gameTime;
    
    public static LocalDate getDateTime(){
        return gameTime;
    }
    public static void setDateTime(LocalDate time){
        gameTime = time;
        setDays(1);
    }
    
    //save days
    private static int days;
    public static int getDays(){
        return days;
    }
    //days are counted atomatically
    private static void setDays(int i){
        days += i;
    }
    public static void reCountDays(){
        days = 1;
    }
    
    
    
    
}
