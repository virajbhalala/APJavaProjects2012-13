public class coinflip {
    private int heads,tails,pface;
    
    public coinflip (){
       heads = 0;
       tails = 0;
       pface = 0;
    }
   
  public int getHeadsCount(){
    return heads;
}
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
  public String toString(){
    return "Number of heads is " + heads + " the number of tails is " + tails;
    }
}
 
  
  

  
  
  
  
  
