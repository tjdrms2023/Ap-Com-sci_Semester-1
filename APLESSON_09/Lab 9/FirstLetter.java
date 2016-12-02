import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("5 words");
	
	for (int i = 0; i < words.length; i++)
	{
		words[i] = kb.next();
	}
	first(words);
	}
	public static void first(String[] word)
	{
		for(String words: word)
		{
			System.out.println(words.charAt(0) + " ");
		}
	}
}
