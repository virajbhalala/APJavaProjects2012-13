public class bhalalaChapter3proj7 {
  public static void main (String args[]){
    EasyReader e = new EasyReader(); 
      
      System.out.println ("Enter value to find ODD,EVEN and ZEROES in it");
     int num =  e.readInt ();
     
     int even=0;
     int odd=0;
     int zeroes=0;
     
 if(num == 0){
     System.out.println(num + " is zero");
}

else

{

while(num > 0)

{

    int dig = num % 10;
    if(dig == 0){
        System.out.println(dig + " is zero");
        zeroes++;}
    else if(dig % 2 == 0){
        System.out.println(dig + " is even");
        even++;
    }
    
else {System.out.println(dig + " is odd");
  odd++;}
    num /= 10;

}
System.out.println("even: " + (even+zeroes));
System.out.println("odd: " + odd);
System.out.println("zeroes: " + zeroes);
}
  }}
