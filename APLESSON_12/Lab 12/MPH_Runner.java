import java.util.Scanner;

public class MPH_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put the value : ");
		int distance = kb.nextInt();
		int hours = kb.nextInt();
		int minutes = kb.nextInt();
	
		MPH object = new MPH(distance, hours, minutes);
	
		System.out.println("MPH is: " + object.getMPH());
	
		object.setValues(10000, 20, 31);
	
		System.out.println();
	
		System.out.println("MPH is: " + object.getMPH());
	}
	
}