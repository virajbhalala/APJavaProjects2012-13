public class bhalalaChapter2proj3 {
  
  public static void main (String args[]){
   EasyReader e = new EasyReader();
   
   System.out.println("Give me  your side A");
   
   double side_A=e.readDouble();
   
   System.out.println("Give me  your side B");
   
   double side_B=e.readDouble(); 
    
   System.out.println("Give me  your side c");
   
   double side_C=e.readDouble(); 
   
   double halfPerimeter = (side_A+side_B+side_C)/2;

   
   double x = halfPerimeter-side_A;
   double y = halfPerimeter-side_B;
   double z = halfPerimeter-side_C;
   
   double xyz = x*y*z;
   
   double area = Math.sqrt(halfPerimeter*xyz);

   System.out.println("your perimeter of traingle is " + 2*halfPerimeter);
   System.out.println("your area of triangle is " + area);
   
   
   
   
   
   
  }
}