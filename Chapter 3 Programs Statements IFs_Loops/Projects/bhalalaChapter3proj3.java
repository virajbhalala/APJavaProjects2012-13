public class bhalalaChapter3proj3 {
  public static void main (String args[]){
    EasyReader e = new EasyReader();
     System.out.println("input a binary number");
    int num =  e.readInt ();
    int position = 0;
    double sum = 0;
    while (num!=0){
      int dig = num%10;
      
      sum = sum + (dig*(Math.pow(2,position)));
      position = position + 1;
      
      
      num=num/10;
      
      
    }
    
    System.out.println(sum);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}