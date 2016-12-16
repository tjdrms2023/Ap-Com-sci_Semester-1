import java.util.Scanner;

public class Underscores
{
	static String sentence;
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("sentence: ");
		sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") < 0)
			return sentence;
			return replace(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1));  
	}
}