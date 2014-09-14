public class PiggyBankDriver{
  public static void main(String args[]){ 
    
    //empty bank
   PiggyBank bank1 = new PiggyBank();
   //bank with $2
   PiggyBank bank2 = new PiggyBank(4, 8, 2, 10, "Joe");
   
   System.out.println("Number of Quarters should be 4 " + bank2.getQuarters());
   System.out.println("Number of Pennies should be 0 " + bank1.getPennies());
   
   //add 2 quarters to bank 1
   bank1.add("quarters", 2);
   //add 2 dimes to bank 2
   bank2.add("dimes", 2);
   
   System.out.println("Bank 1 should have $0.50 "+ bank1.getAmount());
   System.out.println("Bank 2 should have $2.20 " + bank2.getAmount());
   
   System.out.println("Get half of Bank 1 $0.25 "+ bank1.getHalf());
   System.out.println("Get half of Bank 2 $1.10 " + bank2.getHalf());
   
   System.out.println("Bank 1 should have $0.20 "+ bank1.getAmount());
   System.out.println("Bank 2 should have $1.10 " + bank2.getAmount());
   
   bank1.breakTheBank();
   bank2.breakTheBank();
   
   //Call toString
   System.out.println("Bill $0.00 "+ bank1);
   System.out.println("Joe $0.0 " + bank2.toString());
   

  }}