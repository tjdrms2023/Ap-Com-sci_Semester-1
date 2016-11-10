import java.util.Scanner;

public class DigitAdder
{
    static int number;
	static int sum = 0;
	static int num = number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Put your number.");
		number = kb.nextInt();
		sumDigits();
	}
	public static void sumDigits()
	{
		num = number;
		while(num > 0)
		{
			
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("The sum of the digits in " + number + " is " + sum + ".");
	}
}