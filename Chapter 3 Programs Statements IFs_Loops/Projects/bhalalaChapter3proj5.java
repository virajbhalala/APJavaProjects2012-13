public class bhalalaChapter3proj5 {
  public static void main (String args[]){
    EasyReader e = new EasyReader();
     System.out.println("input your iteration"); 
    int iteration = e.readInt();
      double total = 0 ;
       double num= 1.0;
        int denom=1;
        for (int x = 0; x<iteration; x++){
    num =1;
    denom=(denom)*(x+1);
    
    System.out.println(num+"---"+denom);
    
    
    total=total+(num/denom);
    
        }
        
        
        System.out.println(1+total);
  }
}