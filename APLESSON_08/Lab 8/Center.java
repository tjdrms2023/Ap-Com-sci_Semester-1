import java.util.Scanner;

public class Center
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First: ");
		String f = kb.nextLine();
		
		System.out.println("Second: ");
		String s = kb.nextLine();
		
		System.out.println("Third: ");
		String t = kb.nextLine();
		
		System.out.println(makeCenter(f));
		System.out.println(makeCenter(s));
		System.out.println(makeCenter(t));
	}
	
	public static String makeCenter(String sen)
	{
		if(sen.length() >= 20)
			return sen;
		else
			return makeCenter(" " + sen + " ");
	}
}