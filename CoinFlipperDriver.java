public class CoinFlipperDriver{
  public static void main(String args[]){ 
    
    CFlip c = new CFlip();
    
    for(int x = 0; x < 100; x++){
       
     c.flip() ;
       System.out.println("The Previous Flip was " + c.getPreviousFlip());
    }
    
    System.out.println("The amount of heads is " + c.getHeadsCount());
    System.out.println("The amount of tails is " + c.getTailsCount());
    System.out.println("Get all info on this object " );
    System.out.println(c);
    
    
  }
}