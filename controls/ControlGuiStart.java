package shares.controls;

import shares.data.Data;
import shares.gui.ShareSimulation;
import shares.gui.StartMenu;
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
    
    //is called when a new game starts
    public static void createShares(){
        //create share one
        Share aNew = new Share();
        Data.setCompanyName(aNew.getName());
        Data.addAShareRate(aNew.getMarketValue());       
        
        
        //create share two
        Share bNew = new Share();
        Data.setCompanyNameB(bNew.getName());
        Data.addBShareRate(bNew.getMarketValue());
                
    }
    
    public static void startWithNewPlayer(){
        StartMenu start = StartMenu.getInstance();
        start.setLocationRelativeTo(null);
        start.setVisible(true);
        ShareSimulation sim = ShareSimulation.getInstance();
        sim.setVisible(false);
        Data.clearPlayer();        
    }
      
}
