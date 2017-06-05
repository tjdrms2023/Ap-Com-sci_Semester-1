/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"Ace", "two", "three"};
		String[] suit1 = {"Hearts", "Clubs", "Diamonds"};
		int[] value1 = {1, 2, 3};
	    Deck d1 = new Deck(rank1, suit1, value1);
		System.out.println(d1);
	   
	    String[] rank2 = {"four", "five", "six"};
	    String[] suit2 = {"Clubs", "Spades", "Hearts"};
	    int[] value2 = {4, 5, 6};
	    Deck d2 = new Deck(rank2, suit2, value2);
		System.out.println(d2);
	  
	    String[] rank3 = {"seven", "eight", "nine"};
	    String[] suit3 = {"Diamonds", "Spades", "Clubs"};
	    int[] value3 = {7, 8, 9};
	    Deck d3 = new Deck(rank3, suit3, value3);
		System.out.println(d3);
	}
}
