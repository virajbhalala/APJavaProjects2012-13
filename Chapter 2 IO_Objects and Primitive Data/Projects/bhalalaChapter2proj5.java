public class bhalalaChapter2proj5 {
  
  public static void main (String args[]){
     EasyReader e = new EasyReader();
     System.out.println("enter your amunt of change in cents only");
       int cents = e.readInt();
    int quarters = (cents / 25);
      System.out.println( "quaters-> " + quarters);
      
    int dimes = ((cents % 25)/10);

    System.out.println ( "dimes-> " + dimes);
     
    int nickels = (((cents % 25)%10)/5);
    System.out.println ("nickels-> " + nickels);
    
    int penny = (cents-((25*quarters)+(10*dimes)+(5*nickels)));
    System.out.println ("pennies ->" + penny);
      
     
                          
                          
                     
    
    
  }
}