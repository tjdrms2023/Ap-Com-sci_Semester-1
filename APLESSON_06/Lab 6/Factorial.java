import java.util.Scanner;

public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put your number.");
		int num = kb.nextInt();
		int factorial = 1;
		for(int i = 1; i <= num; i++)
		{
			factorial *= i;
		}	
		
		System.out.println(factorial);
	}
}