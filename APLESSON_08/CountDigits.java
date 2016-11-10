import java.util.Scanner;
public class CountDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		System.out.println(CountDigits(kb.nextInt()));
	}
	
	public static int CountDigits(int num)
	{
		while(num > 0)
		{
			return 1 + (CountDigits(num/10));
		}
		return 0;
	}
}