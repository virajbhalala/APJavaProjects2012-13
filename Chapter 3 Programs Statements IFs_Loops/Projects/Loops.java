public class Loops{
  public static void main(String args[]){ 
    
    //adding up
  int total = 0;
  for(int x = 1; x <= 10; x++){
    total = total + x;
  }
  
  //factorial!
  int total1 = 1;
  for(int x = 1; x <= 10; x++){
    total1 = total1 * x;
  }


  //averaging
  int count=0;
  int total2 = 0;
  for(int x = 1; x <= 10; x++){
    count++;
    total2 = total2 + x;
  }
  System.out.println("Average is " + total/count);
  
  
  
  String s = new String("");
    for(int x = 1; x <= 10; x++){
    s = s + x;
  }
  
  
  
}
}