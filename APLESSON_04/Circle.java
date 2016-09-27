public class Circle
{
	static int r = 5;
	static double area = calcArea();
	public static void main(String[] args)
	{
		print();
	}
	
	public static double calcArea()
	{
		return 3.141592 * r * r;
	}
	
	public static void print()
	{
		System.out.println("\"The area of a circle with a radius of" +r + "is " + area);
	}
}