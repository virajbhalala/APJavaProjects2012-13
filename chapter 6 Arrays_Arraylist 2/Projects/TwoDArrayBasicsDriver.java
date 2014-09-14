public class TwoDArrayBasicsDriver{
  public static void main(String args[]){ 
    TwoDArrayBasicsII t = new TwoDArrayBasicsII();
    System.out.println(t);
    System.out.println("Your sum is " + t.sum());
    t.set(3,4, 7);
    t.set(3,5, 7);
    t.flood(6,6, 0);
    System.out.println();
    System.out.println(t);
    System.out.println(t.countAround(2,2));
    System.out.println(t.countAround(0,0)); //be careful, might blow up
  
  }
}