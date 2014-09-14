public class bhalalaChapter3proj8 {
  public static void main (String args[]){
    EasyReader e = new EasyReader();
    
    System.out.println("input a year to find if it is leap or not");
    int year =  e.readInt ();
    boolean xx = true;
    
    if (year < 1582 )
      System.out.println("Error. This year is not in Georgian Calender");
    else{
    if (year%400==0 )
      xx=true;
    
 
    else{
     if (year%4==0){
     if (year%100!=0)
         xx=true;
   }
     if (year%100==0)
         xx=false;

    else
     xx=false;
    }
    if (xx==true)
      System.out.println("The year is leap year");
     if (xx==false)
      System.out.println("The year is not leap year");
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}