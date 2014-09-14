public class bhalalaChapter3proj4{
  public static void main (String args[]){
    
       EasyReader e = new EasyReader();
 System.out.println("input side lenght"); 
    int sides = e.readInt();
    for (int r = 0; r<sides; r++){ 
      for( int c =0; c<sides; c++){
        if ((r==0 || c==0) || r==sides-1 || c==sides-1)
         System.out.print("*");
        else
          System.out.print(" " );
      }
      System.out.println();  
    
    }
    
    
  }
}