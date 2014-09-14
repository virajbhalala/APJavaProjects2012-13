public class CardDriver{
  public static void main(String args[]){ 
    
    ArrayList<Card> deck = new ArrayList<Card>();
    
    for(int x = 0; x < 52; x++){
       deck.add(new Card(x));
    }
    
    System.out.println("The Deck Contains");
    System.out.println(deck);
    
    
  }
}