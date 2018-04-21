package shares.program.settings;

public class Language {
    private static String choosenLanguage = "Text_en";
    
    private static final String english = "Text_en";
    private static final String german = "Text_de";
    
    public enum aLanguage{
        ENGLISH, GERMAN;
    }
    
    //no instances
    private Language(){
        
    }
    
    public static void setLanguage(aLanguage choose){
       if(choose == null)
           return;
        
        if(choose == aLanguage.ENGLISH)
            choosenLanguage = english;
        
        if(choose == aLanguage.GERMAN)
            choosenLanguage = german;
        
        System.out.println(choosenLanguage);
    }
    
    public static String getLanguage(){
        return choosenLanguage;
        
    }
    
    
    
}
