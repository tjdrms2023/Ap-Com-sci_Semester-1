import java.util.Scanner;

public class yOrN
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("recursion");
		String choice = kb.next();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Recursion");
			else
				System.out.println("Failed");
		}
		else
			System.out.println("Please enter Y or N");
		    recursion();
	}
}