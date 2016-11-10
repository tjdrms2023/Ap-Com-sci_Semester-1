import java.util.Scanner;
public class Rectangle
{
	static int length;
	static int width;
	static double perimeter;
		
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("length?");
		length = kb.nextInt();
		System.out.println("Width?");
		width = kb.nextInt();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
	    perimeter = 2* (length + width);
	}
	
	public static void print()
	{
		System.out.println("\"Your rectangle is " + perimeter + "ft around.\"" );
	}
}