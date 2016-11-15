import java.util.Scanner;

public class Center
{
	static String f;
	static String s;
	static String t;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First: ");
		f = kb.nextLine();
		
		System.out.println("Second: ");
		s = kb.nextLine();
		
		System.out.println("Third: ");
		t = kb.nextLine();
		
		makeCenter(f);
		makeCenter(s);
		makeCenter(t);
	}
	
	public static String makeCenter(String sen)
	{
		sen = " ";
		if(sen.length() >= 20)
			return sen;
		else
			return sen = " " + sen + " ";
	}
}