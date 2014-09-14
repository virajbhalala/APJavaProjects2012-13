public class Piggybank {
  private int pennies,nickels, dimes, quarters ;
  
  final String owner;
  
  public Piggybank(){
    pennies = 0;
   nickels = 0;
   dimes = 0;
   quarters = 0;
    
  }
  public Piggybank (int Pennies, int Nickels, int Dimes, int Quarters){
    Pennies = pennies;
    Nickels= nickels;
    Dimes = dimes;
    Quarters = quarters;
  }
  public int getPennies(){
   return pennies; 
  }
  public int getNickels(){
   return nickels; 
  }
  public int getDimes(){
   return dimes; 
  }
  public int getQuarters(){
   return quarters; 
  }
  
  public String getOwner(){
   return owner; 
  }
  public void add()
  {
  }
  public void add (String coinType, int numberOfCoins){
    if ( coinType = quarters)
      quarters = quarters + Quarters;
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
}