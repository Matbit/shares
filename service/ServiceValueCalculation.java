package shares.service;

import shares.data.Data;
import shares.model.Share;

public class ServiceValueCalculation {
    private static int counter = 0;
    private static int maximumDays = 55;
        
    private static ShareMode  mode = ShareMode.NORMAL_MODE;
    
    public enum ShareMode{
        NORMAL_MODE, SUICIDE_MODE, POWER_MODE;
    }
    
    public static double shareManagementSystem(){
        ShareMode currentMode = mode;
        if(currentMode == ShareMode.NORMAL_MODE){
            
            
            
        }
        
        //....
        return 0d;
    }
    
    private static double calcNormalMode(){
        int length = 60;
        int periodDay = counter;
        
        //change mode if maximum is reached
        if(periodDay >= length){
            counter = 0;
            //
        }
        
        //if first day in normal mode        
        if(counter == 0){
            calcModePeriod(length);
        }
        //count +1
        counter++;
        
        return calcNewRateB(Data.getCurrentBShare());
    }
    
    private static void calcModePeriod(int maximum){
        maximumDays = (int) Math.random()* maximum;
    }
    
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
        
        if(plusOrMinus < 53)
            factor = 1;
        else
            factor = -1;
        
        return oldRate+(rate * factor);
        
    }
    
    private static double calcRate (){
        
              
        double rate = (int) (Math.random()*100);
                    
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
    
    private static double calcSuicideMode(){
        
        
        int length = 5;
        double rate = (int) (Math.random()*100);
        
        if(rate > 10){
            return rate * 1.98/100;
        }
        if(rate > 20){
            return rate*2.16/100;
        }
        if(rate > 30){
            return rate*2.62/100;
        }
        if(rate > 40){
            return rate *2.98/100;
        }
        if(rate > 50){
            return rate*3.45/100;
        }
        if(rate > 60){
            return rate*3.80/100;
        }
        if(rate > 70){
            return rate *4.37/100;
        }
        if(rate > 80){
            return rate * 5.83/100;
        }
        if(rate > 90){
            return rate * 6.25/100;
        }
        if(rate > 89){
            return rate * 6.8/100;
        }
        return rate;
        
    }
        
}
