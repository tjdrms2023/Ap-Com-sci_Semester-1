import java.util.Scanner;

public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put your first number.");
		int to = kb.nextInt();
		
		System.out.println("Put your second number.");
		int by = kb.nextInt();
		
		for(int i = by; i <= to; i+=by)
		{
		   System.out.print(i + "\t");
		}
	}
}

