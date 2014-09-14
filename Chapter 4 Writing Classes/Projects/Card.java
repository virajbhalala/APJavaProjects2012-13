public class Card {
  private int num;
  public Card (int pnum){
    num = pnum;
  
  if ( num<0 || num>51)
    System.err.print("error");
  
 
  
  
}
public String getValue(){
String s = new String();
   if (num %13== 0)
     s= "ACE";
   if ( num%13 == 1)
   s= "2";
  if ( num%13==2)
    s="3";
  if ( num %13==3)
    s= "4";
  if (num % 13 == 4)
    s= "5";
   if ( num%13 == 5)
    s= "6";
  if ( num%13==6)
    s= "7";
  if ( num %13==7)
    s= "8";
  if (num % 13 == 8)
    s= "9";
   if ( num%13 == 9)
    s= "10";
  if ( num%13==10)
    s= "JACK";
  if ( num %13==11)
    s= "QUEEN";
  if (num % 13 == 12)
    s= "KING";
  return s;
                                                   
  //figure out
  //Ace ->King
  //use mod
  //num%13
}


public String getSuite(){
  String s = new String();
 int SPADES = 0;
 int HEARTS = 1;
 int DIAMONDS = 2;
int CLUBS = 3;

   if ( num/13 == HEARTS)
    s= "Hearts";
  if ( num/13==SPADES)
    s= "Spades";
  if ( num /13==DIAMONDS)
    s= "Diamonds";
  if (num / 13 == CLUBS)
    s= "Clubs";
  return s;
//  spade
//    Diamond
//    Clubs
//    Hearts
//    num/13
//    use division
    
    
}
}