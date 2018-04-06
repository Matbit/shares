package shares.program;

import shares.program.settings.Language;
import shares.gui.StartMenu;
import java.util.*;
import shares.program.settings.Language;

class Init {
    
    protected static void initShares(){
        
        String baseName = Language.getLanguage();
        ResourceBundle bundle = ResourceBundle.getBundle(baseName);
               
        StartMenu start = new StartMenu();
        start.setTitle(bundle.getString("title"));
        start.setVisible(true);
        
    }
}
