public class ToyRunner
{
	public static void main(String[]args)
	{
		String toy = "AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore dankmemes = new ToyStore(toy);
		System.out.println(dankmemes);
		System.out.println(dankmemes.getMostFrequentToy());
		System.out.println(dankmemes.getMostFrequentType());
	}	
}