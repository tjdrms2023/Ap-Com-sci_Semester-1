import java.util.Scanner;

public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("put your number.");
		int num = kb.nextInt();
		
		System.out.println("Size of the table?");
		int size = kb.nextInt();
		
		System.out.println("   x   |  y");
		System.out.println("_______________");
		for(int i =1; i<= size; i++)
		{
			System.out.println("   " + i + "   |  " + iterator(num, i));
		}	
		
	}
	
	public static int iterator(int num, int i)
	{
		return num*i;
	}
}