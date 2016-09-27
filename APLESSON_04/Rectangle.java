public class Rectangle
{
	static int length = 3;
	static int width = 4;
		
	public static void main(String[] args)
	{
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