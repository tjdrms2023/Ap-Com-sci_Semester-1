import java.util.Scanner;

public class Average
{
	static int num1;
	static int num2;
	static int num3;
	static int a;
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First number?");
		num1 = kb.nextInt();
		System.out.println("Second number?");
		num2 = kb.nextInt();
		System.out.println("Third number?");
		num3 = kb.nextInt();
		average();
		print();
	}
	
	public static void average()
	{
		a= (num1 + num2 + num3)/3;
	}
	
	public static void  print()
	{
		System.out.println("\"The average of " + num1 +" , " +num2 +" ,and " + num3 + " is " + a + ".");
	}
}