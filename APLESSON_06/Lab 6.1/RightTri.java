import java.util.Scanner;

public class RightTri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put your word.");
		String word = kb.next();
		
		for(int i = word.length(); 0 <=word.length(); i--)
		{
			System.out.println(word.substring(i));
		}
	}
}