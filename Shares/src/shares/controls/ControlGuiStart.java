package shares.controls;

import shares.data.Data;
import shares.model.Player;
import shares.model.Player.Gender;
import shares.model.Share;

public class ControlGuiStart {
    
    public static void createPlayer(String nick, int aGender){
        Gender playersGender = null;
        if(aGender == 0)
            playersGender = Gender.MALE;
        if(aGender == 1)
            playersGender = Gender.FEMALE;
        
        Player player = new Player(nick, playersGender);
        Data.addPlayer(player);
    }
    
    public static void createShares(){
        //create share one
        Share aNew = new Share();
        Data.setCompanyName(aNew.getName());
        Data.addAShareRate(aNew.getMarketValue());       
        
        
        //create share two
        Share bNew = new Share();
        System.out.println(bNew.getName());
        Data.setCompanyNameB(bNew.getName());
        Data.addBShareRate(bNew.getMarketValue());
        System.out.println("shares init ok..");
        
    }
      
}
