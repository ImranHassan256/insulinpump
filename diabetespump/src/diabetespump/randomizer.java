
package diabetespump;

import java.util.Random;


public class randomizer {
        
        int box;
     
        int Random (){              //random method return an integer value to next classs 
             
        Random bot = new Random();   //this is raandomizer generate random number
      
        box=bot.nextInt(6);
        
        return box;
          
         
       }
}
