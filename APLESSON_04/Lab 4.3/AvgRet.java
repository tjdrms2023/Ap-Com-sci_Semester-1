import java.util.Scanner;
public class AvgRet
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First number.");
		int num1 = kb.nextInt();
		
		System.out.println("Second number.");
		int num2 = kb.nextInt();
		
		System.out.println("Last number.");
		int num3 = kb.nextInt();
		
		print(calcAvg(num1, num2, num3));
	}
	
	public static double calcAvg(int n1, int n2, int n3)
	{
		return (n1 + n2 + n3)/3;
	}
	
	public static void print(double average)
	{
		System.out.println("The average is " + average);
	}
}




