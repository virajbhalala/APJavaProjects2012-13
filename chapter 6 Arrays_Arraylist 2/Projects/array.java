public class array {
  public static void main (String args[]){
  
  int [][]ary = new int[10][10];
  for (int r = 0; r<ary.length;r++){
    for (int c= 0; c<ary[0].length;c++){
      ary[r][c]=(int) (Math.random()*10);
      System.out.print(ary[r][c]);}
       System.out.println();}
  
  int sum=0;
  for(int r=0;r<ary.length;r++){
    
   sum= sum +ary[r][r];
      
      
    }
    
    System.out.println("The major sum is= " + sum);
    int sumtwo =0;
    
    for (int r=0;r<ary.length;r++){
      sumtwo = sumtwo + ary[r][(ary.length-1)-r];
      
      
      
    }
    System.out.println("The minor sum is= " + sumtwo);
  }
  
    
  }
  
  
  
