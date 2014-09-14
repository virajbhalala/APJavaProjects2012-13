import kareltherobot.*;
import java.awt.Color;

public class Template implements Directions
{
  static 
  {
     World.setDelay(100);
     
     // Modify this to read in whatever world file you want.
     //  World.readWorld("worlds","stairworld.kwld");
     World.setVisible(true);
     World.showSpeedControl(true);
      World.placeBeepers(((int) (Math.random() * 10)),((int) (Math.random() * 10)),1);
      World.placeBeepers(((int) (Math.random() * 10)),((int) (Math.random() * 10)),1);
      World.placeBeepers(((int) (Math.random() * 10)),((int) (Math.random() * 10)),1);
      World.placeBeepers(((int) (Math.random() * 10)),((int) (Math.random() * 10)),1);
      World.placeBeepers(((int) (Math.random() * 10)),((int) (Math.random() * 10)),1);
  }
    
  public static void task()
  {
    // The "task()" routine is where you do the actions.
    //Make your Robot object here and issue commands

    Robot r = new Robot(1,1,East, 4);

 

  

    
  
  
    
     
    while(!r.nextToABeeper()){
     
      r.turnLeft();
      r.move();
      r.turnLeft();
      r.turnLeft();
      r.turnLeft();
        
      r.move();
    }
    
 
       
 
    
      
      
    
    
    

     
  }
  
  
  // The DrJava project is set to automatically run "Main::main".
  public static void main(String [] args)
  {
    task();
  }
}

  
