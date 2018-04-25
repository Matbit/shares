package shares.program.settings;

public class Language {
    private static String choosenLanguage = "Text_en";
    
    private static final String ENGLISH = "Text_en";
    private static final String GERMAN = "Text_de";
    
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
            choosenLanguage = ENGLISH;
        
        if(choose == aLanguage.GERMAN)
            choosenLanguage = GERMAN;
        
        System.out.println(choosenLanguage);
    }
    
    public static String getLanguage(){
        return choosenLanguage;
        
    }
    
    
    
}
