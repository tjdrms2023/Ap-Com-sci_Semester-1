import java.util.Scanner;

public class CubeRet
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your side");
		double side = kb.nextDouble();
		
		print(calcArea(side));
		
	}
	
	public static double calcArea(double s)
	{
		return 6 * s * s;
	}
	
	public static void print(double area)
	{
		System.out.println("The surface area of cube is " + area);
	}
}