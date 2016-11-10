import java.util.Scanner;

public class AvgDigits
{
	static int digits = 0;
	static int average = 0;
	static int number;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	    System.out.println("Number: ");
	    number = kb.nextInt();
		avDigits();
		
	}

	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits++;
			average = (average + num %10);
			num /= 10;
		}
		
		average = average / digits;
		
		System.out.println("The average of the digits in " + number + " is " + average);
	}
}