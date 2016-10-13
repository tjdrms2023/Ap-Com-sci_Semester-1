import java.util.Scanner;
public class Rectangle
{
	static int length;
	static int width;;
		
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		length = kb.nextInt();
		width = kb.nextInt();
		calcPerim();
		print();
		
	}
	public static int calcPerim()
	{
		return 2* (length + width);
	}
	
	public static void print()
	{
		System.out.println("\"Your rectangle is " + calcPerim() + "ft around.\"" );
	}
}