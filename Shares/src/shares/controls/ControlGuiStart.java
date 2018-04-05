package shares.controls;

import shares.model.Player;
import shares.model.Player.Gender;

public class ControlGuiStart {
    
    public static void createPlayer(String nick, int aGender){
        Gender playersGender = null;
        if(aGender == 0)
            playersGender = Gender.MALE;
        if(aGender == 1)
            playersGender = Gender.FEMALE;
        
        Player player = new Player(nick, playersGender);
        
        
    }
}
