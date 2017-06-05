/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card ("ace", "spade", 1);
		Card b = new Card ("seven", "hearts", 7);
		Card c = new Card ("queen", "diamonds", 12);
		System.out.println(a + "\n" + b + "\n" + c);
	}
}
