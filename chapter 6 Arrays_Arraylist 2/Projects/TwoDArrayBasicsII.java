public class TwoDArrayBasicsII{
  public static final int NUM_ROWS = 10;
  public static final int NUM_COLS = 10;
  private int sum= 0;
  private int[][] ary = new int[NUM_ROWS][NUM_COLS];
  
  //Constructor
  public TwoDArrayBasicsII(){
      for (int r = 0; r<ary.length;r++){
        for (int c= 0; c<ary[0].length;c++){
         ary[r][c]=(int) (Math.random()*10);
        
           
         }
      }
   
  
    
  }
  

  
  //return the sum of the array
  public int sum(){
      for (int r = 0; r<ary.length;r++){
        for (int c= 0; c<ary[0].length;c++){
         sum = sum + ary[r][c];
        }
        
      }
    
    return sum;
   
  }
  
  //set the given cell to the given value
  public void set(int r, int c, int value){
    
       
    ary[r][c]=value;
    
    
  }
  
  //flood the array from the given cell down and right
  public void flood(int r, int c, int value){
    for (int i = r; i <ary.length; i++){
      for (int p= c; p<ary[r].length; p++){
        ary[i][p]=value;
      }
    }
        
    
    
  }
  
  //returns the sum of the cells around the given cell
  public int countAround(int r, int c){
    int a=0,b=0,x=0,d=0,e=0,f=0,g=0,h =0;
    
    if(r-1>0 && c-1>0)
     a = ary [r-1][c-1];
    if(r-1>0)
    b = ary[r-1][c];
    if(r-1>0 && c+1>0)
     x = ary [r-1] [c+1];
    if( c-1>0)
     d= ary [r] [c-1];
    if(c+1>0)
     e = ary [r] [c+1];
    if(r+1>0 && c-1>0)
     f = ary [r+1][c-1];
    if(r+1>0 )
     g = ary[r+1][c];
    if(r+1>0 && c+1>0)
     h = ary [r+1] [c+1];
    return a+b+x+d+e+f+g+h;
  }
  
  //returns the array as a String of ints in two dimensions
  public String toString(){
    String s="";
     for (int r = 0; r<ary.length;r++){
        for (int c= 0; c<ary[0].length;c++){
         s = s + ary[r][c] + " " ;
         }
     s = s + " \n";
}
  return s;
  }
  
  
}
  
  
