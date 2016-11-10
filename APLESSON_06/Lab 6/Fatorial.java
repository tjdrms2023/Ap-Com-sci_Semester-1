import java.util.Scanner;

public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put your number.");
		int num = nextInt();
		
		for(int i = 1; i >= num; i++)
		{
			System.out.println(i);
		}	
	}
}