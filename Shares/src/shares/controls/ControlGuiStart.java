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
        
        //delete when development is finish
        System.out.println(Data.getAPlayer().getNickname() + Data.getAPlayer().getGender());
    }
    
    public static void createShares(){
        Share aNew = new Share();
        Data.setCompanyName(aNew.getName());
        Data.addAShareRate(aNew.getMarketValue());
        System.out.println("share ok..");
        
    }
}
