//import java.util.Scanner;
//public class RE
//{
	//public static void main(String[]args)
	//{
		//Scanner kb = new Scanner(System.in);
		//System.out.println("Number");
		//System.out.println(countDigits(kb.nextInt()));
	//}
	
	//public static int countDigits(int num)
	//{
		//while(num > 0)
		//{
		//	return 1 + (countDigits(num / 10));
		//}
		//return 0;
	//}
//}

public class RE
{
	public static void main(String[]args)
	{
		System.out.println(factorial(8));
	}
	
	public static int factorial(int n)
	{
		if (n == 1) return 1;
		return n * factorial (n-1);
	}
}
