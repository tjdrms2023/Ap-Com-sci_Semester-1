import java.util.Scanner;
public class Lesson_07_3
{
	static String sentence;
	static int top = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
		while (top < sentence.length()-1)
		{
			System.out.println(sentence.charAt(top));
			top++;
		}
	}
}

public class Lesson_07_3
{
	static String sentence;
	static int top = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
		while (top < sentence.length()-1)
		{
			while(sentence.indexOf(" ") >= 0)
			{
				
			}
		}
	}
}