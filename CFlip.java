//Leon Chen Chapter 4 Project 1

public class CFlip {

    private int heads;
    private int tails;
    private int pface;
    
    //default constr
    public CFlip (){
       heads = 0;
       tails = 0;
       pface = 0;
    }
    
  
  //ask for content
  public int getHeadsCount(){
    return heads;
}
  
  //content
  public int getTailsCount(){
    return tails;
  }
  
  public String getPreviousFlip(){
    if(pface==0)
      return "HEADS";
    else
      return "TAILS";
  }
  
  public void flip(){
    pface = (int)(Math.random() * 2);
    if(pface ==0)
      heads++;
    else
      tails++;
    
  }
  
  //string
  public String toString(){
    return 
      "";
 
    }
}