import java.util.Scanner;

public class CircleRet
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your radius");
		int rad = kb.nextInt();
		
		print(calcArea(rad));
	}
	
	public static double calcArea(int r)
	{
		return 3.14 * r * r;
	}
	
	public static void print(double area)
	{
		System.out.println("Your area is " + area);
	}
}