public class bhalalaChapter3proj1 {
  public static void main (String args[]){
    EasyReader e = new EasyReader();
    
    double total=0;
    double average=0;
    int ctr = 0;
   
    System.out.println("give me your numbers or negative number to stop");
    int sentinal =  e.readInt ();
    
    while( sentinal >=0){ 
    ctr++;
    total = total+sentinal;
    System.out.println("give me your numbers or negative number to stop");
    sentinal =  e.readInt ();  
    }
   average = total / ctr;
    System.out.println ("your average is " + average);
    
  }
}


