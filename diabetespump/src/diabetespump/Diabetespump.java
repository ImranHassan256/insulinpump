
package diabetespump;

import java.util.Timer;
import java.util.TimerTask;


public class Diabetespump {
  
    // *****.....IMRAM....HASSAN.....PROJECT....*****////   
   
    public static void main(String[] args) {
        
                              // this is our timer and timertask to recycle the program certain time
          Timer timer=new Timer();
          TimerTask task = new TimerTask(){
          boolean activepump=false;
          
          public void run (){
            
              //this is the object of previous class called here
              
              controller obj= new controller();
              String value=obj.control();
       
       //here all conddiction will be checked and  print the result
          
                //equalignorecase ignore captain or small letter accpect any letter
              
        if(value.equalsIgnoreCase("suger level low")){
            
            System.out.println("suger level low take 25 gram glucose'\n");
                                                     }
        if (value.equalsIgnoreCase("suger low")){
            
            System.out.println("suger level low take 15 gram glucose'\n");
            
        }
        if(value.equalsIgnoreCase("normal")){
             
            System.out.println("conduction is normal '\n");
        }
        if (value.equalsIgnoreCase("normal range")){
           
            System.out.println("conduction is still normal'\n");
        } 
        if (value.equalsIgnoreCase("insulin needed")){
             
            System.out.println("50 dose insulin requried suger being high '\n'");
         
            System.out.println("insulin pump is activated with 50 dose drug'\n");
            System.out.println("..........................'\n"); 
        }
        if(value.equalsIgnoreCase("insulin needed must")){
            
            System.out.println("suger is too high take 100 dose insulin injuction'\n'");
  
            System.out.println("insulin pump activated with 100 dose now '\n");
            System.out.println("..........................'\n");
            activepump =true;
                                                    }
              
               
            
         } 
     }; 
     long delay=2000;
     long period=2000;
     timer.schedule(task, delay, period);
        
     
      
                     }                   
        
        
        
    }
    

