public class Average
{
	static int num1 = 3;
	static int num2 = 4;
	static int num3 = 5;
	
	public static void main(String[] args)
	{
		print();
	}
	
	public static double average()
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void  print()
	{
		System.out.println("\"The average of " + num1 +" , " +num2 +" ,and " + num3 + " is " + average() + ".");
	}
}