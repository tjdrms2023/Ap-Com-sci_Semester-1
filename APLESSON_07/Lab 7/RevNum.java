import java.util.Scanner;

public class RevNum
{
	static int num;
	static int rev = 0;
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("number: ");
		number = kb.nextInt();
		getReverse();
	}
	public static void getReverse()
	{
		num = number;
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		
		System.out.println(number + " reversed is " + rev );
	}
	
	
}