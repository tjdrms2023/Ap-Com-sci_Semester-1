import java.util.Scanner;
public class RectRet
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your length.");
		double length = kb.nextDouble();
		
		System.out.println("Your width");
		double width = kb.nextDouble();
		
		print(calcPerim(length, width));
	}
	
	public static double calcPerim(double length, double width)
	{
		return 2* (length + width);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("\"Your rectangle is " + perimeter + " ft around.\"" );
	}
}


	