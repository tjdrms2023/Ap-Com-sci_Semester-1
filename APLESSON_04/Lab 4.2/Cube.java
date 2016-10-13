public class Cube
{
	static int side = 5;
	static int sa = calcSurf();
	
	public static void main(String[] args)
	{
		print();
	}
	
	public static int calcSurf()
	{
		return 6 * side * side;
	}
	
	public static void print()
	{
		System.out.println("\"The surface are of a cube with " +side+ "is " + sa + ".");
	}
}