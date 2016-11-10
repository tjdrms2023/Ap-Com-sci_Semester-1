import java.util.Scanner;
public class Circle
{
	static double r;
	static double a;
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Radius");
		r = kb.nextInt();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		a=  3.141592 * r * r;
	}
	
	public static void print()
	{
		System.out.println("\"The area of a circle with a radius of" +r + "is " + a);
	}
}