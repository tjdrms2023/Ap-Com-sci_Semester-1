import java.util.Scanner;

public class Lucky7s
{
	static int num;
	static int digits;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Number: ");
		num = kb.nextInt();
		System.out.println(luck(num));
	}
	
	public static int luck(int number)
	{
		num = number;
		if (number > 0)
		{
			if (number % 10 == 7)
				return 1 + number / 10;
			else
				return 0 + number / 10;
		}
		
		else
			return 0;
	}
}