public class bhalalaChapter3proj2 {
  public static void main (String args[]){
    EasyReader e = new EasyReader();
 System.out.println("input your iteration"); 
    int iteration = e.readInt();
  
    double total = 0 ;
     
    double num= 1.0;
    int denom=1;
    
    for(int x = 0; x<iteration; x++){ 
   total = total + (num/denom);
     
     
 
     // System.out.println(num + "---" + denom);
      
      
      
      
      num *=-1;
      denom = denom + 2;
      
      
     
    }
    
    System.out.println("Pi is equal to " + total*4);
  
  }
}