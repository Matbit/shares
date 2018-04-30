package shares.service;

public class ServiceValueCalculation {
    
    //calculate new share rate (a)
    public static double calcNewRate(double oldRate){
        //factor
        int factor;

        //get rate
        double rate = calcRate();        
        
        //random decision - plus or minus
        double plusOrMinus = (int) (Math.random()*100);
        
        if(plusOrMinus < 63)
            factor = 1;
        else
            factor = -1;
        
        return oldRate+(rate * factor);
        
    }
    
    //calculate new share rate (b)
    public static double calcNewRateB(double oldRate){
        //factor
        int factor;

        //get rate
        double rate = calcRate();        
        
        //random decision - plus or minus
        double plusOrMinus = (int) (Math.random()*100);
        
        if(plusOrMinus < 46)
            factor = 1;
        else
            factor = -1;
        
        return oldRate+(rate * factor);
        
    }
    
    private static double calcRate (){
        
        double rate = (int) (Math.random()*100);
        System.out.println("Procent: "+rate);
            
        if(rate < 5){
            return rate*0.05/100;
			}
	if(rate < 10){
            return rate*0.15/100;
		}
	if(rate < 20){
            return rate*0.39/100;
		}
	if(rate < 30){
            return rate*0.65/100;
		}
	if(rate < 40){
            return rate*0.85/100;
		}
	if(rate < 50){
            return rate*1/100;
		}		
	if(rate < 60){
            return rate*1.25/100;
		}
	if(rate < 70){
            return rate*1.4/100;
		}		
	if(rate < 80){
            return rate*1.65/100;
		}
	if(rate < 90){
            return rate*2.0/100; 
		}
	if(rate < 95){
            return rate*3/100;
		}
	if(rate < 101){
            return rate*3.5/100;
			}	
	if(rate > 101){
            return rate*3.5;
	}
	return 0d;		
    }			
    
        
}
