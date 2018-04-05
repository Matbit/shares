package shares.program.settings;

public class Language {
    private static String choosenLanguage = "Text_en";
    
    private static final String english = "Text_en";
    private static final String german = "Text_de";
    
    private enum aLanguage{
        ENGLISH, GERMAN;
    }
    
    //no instances
    private Language(){
        
    }
    
    //0 = english, 1= german
    public static void setLanguage(int i){
        if(i <0 || i > 1)
            return;
        
        if(i == 0)
            choosenLanguage = english;
        
        if(i == 1)
            choosenLanguage = german;
    }
    
    public static String getLanguage(){
        return choosenLanguage;
        
    }
    
    
    
}
