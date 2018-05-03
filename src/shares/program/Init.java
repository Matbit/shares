package shares.program;

import shares.gui.StartMenu;
import java.util.*;
import shares.data.Data;
import shares.data.StartValues;
import shares.program.settings.Language;

class Init {
    
    protected static void initShares() {
        
        String baseName = Language.getLanguage();
        ResourceBundle bundle = ResourceBundle.getBundle(baseName);
        
        Data.addBankAcc(StartValues.getStartCapital());
        Data.addCountShareA(StartValues.getHolding());
        Data.addCountShareB(StartValues.getHolding());
        StartValues.setStartSaveAccount();
        StartValues.setStartInterestRate();
        StartValues.setTime();
        
        StartMenu start = StartMenu.getInstance();
        start.setTitle(bundle.getString("title"));
        start.setLocationRelativeTo(null);
        start.setVisible(true);
        
        
    }
}
