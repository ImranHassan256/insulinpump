

package diabetespump;


public class controller {
     
    String control(){      //control method return string value to nest class
      
       randomizer star =new randomizer();
       int point=star.Random();   // here we create object to call random method of previous class
        
     
       // here value of randomizer checked in controller class 
       // after cheching the value return to main class
        
                      //condiction checking  area
       if (point==0){
          return "suger level low";
       } 
       if (point==1){
           return "suger low";
       }
      if(point==2){
      return "normal";     
       }
      if (point==3){
          
          return "normal range";
          }
      if(point==4){
      
          return "insulin needed";
      }if(point==5){
         
      } return "insulin needed must";
    } 
}
