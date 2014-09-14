public class square {
  private int lenght;
 
  public square(int l){ 
    lenght=l;
}
  
  public square(){
   lenght=1;
  }
  
  public void setlenght(int l)
  {
   lenght=l;
  }
  public int getlenght(){
    return lenght;
  }
  public double getArea()
  {
    return lenght*lenght;
  }
  
   public double getPerimeter()
  {
    return 4*lenght;
  }
  
  public String toString(){
    String s  = new String();
    s = "lenght = " + lenght + "/n";
    s = s +"Area = " +getArea()+ "Perimeter = " + getPerimeter();
    return s;
  }
}
      