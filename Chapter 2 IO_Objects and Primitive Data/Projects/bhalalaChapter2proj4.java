public class bhalalaChapter2proj4 {
  
  public static void main (String args[]){
     EasyReader e = new EasyReader();
     
     //input boxes
     
     
     System.out.println("What is your hourly pay");
     double earning$ = e.readDouble();
     
    System.out.println("how many hours you work");
      int overHours = 0;
      int hours = e.readInt();
      if(hours>40){
        overHours = hours-40;
        hours = 40;
      }
         
      
      
      //gross pay
      
     
      double grossPay = ((earning$*hours)+(1.5*earning$*overHours));
        System.out.println("your gross pay is " + grossPay);
        
        
        //state tax
        
        
        
        double stateTax = (.04*grossPay);
          System.out.println("your pay $" + stateTax + " for state tax" );
        
          
      //federal tax
        
        
          double federalTax = (.11*grossPay);
           System.out.println("your pay $" + federalTax + " for federal tax" );
          
      //ssTax
          
         double ssTax = (0.06125*grossPay) ;
         System.out.println("your pay $" + ssTax + "  for Social Security tax" );
         
         
       //netpay
          
           double netPay = (grossPay-stateTax-federalTax-ssTax);
            System.out.println("your net pay is " + netPay);   
      
  
    
    
    
    
    
  }
}