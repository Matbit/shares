package shares.model;

import java.util.ArrayList;

public class Share {
    
    private double marketValue;
    private final String name;
    private static ArrayList companyList = new ArrayList();
    
    public Share(){
        marketValue = initStartValue();
        name = setName();
        
    }
    
    private double initStartValue(){
        double d = Math.random()*100;
        
        if(d < 40){
            d = ((40-d) * 1.5) + 30;
        }
        return d;
    }
    
    private String setName(){
        
        int firstTry = (int) (Math.random() * 8);
                
        //check whether company still exists
        if(!companyList.isEmpty()){
            for(int saveFirst = firstTry; saveFirst==firstTry;){
                if(companyList.contains(firstTry)){
                firstTry = (int) (Math.random()*8);
                }
                else{
                    saveFirst = -1;
                }
            }
        }
        companyList.add(firstTry);
        
        String[] company = new String[8];
        company[0] = "Airplane Inc.";
        company[1] = "Motorsport Company";
        company[2] = "FastFood Inc.";
        company[3] = "BMI Inc.";
        company[4] = "PartnerSearch Inc.";
        company[5] = "OS Development Inc.";
        company[6] = "American Energy Inc.";
        company[7] = "British Oil Inc.";
        
        return company[firstTry];
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the marketValue
     */
    public double getMarketValue() {
        return marketValue;
    }
    
    
}
