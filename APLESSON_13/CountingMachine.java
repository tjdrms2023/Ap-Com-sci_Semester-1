import java.util.ArrayList;
import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[]args)
	{
		ArrayList<Money> inventory = new ArrayList<Money>();
	}
	
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter your bills and coins...");
	String cash = kb.nextLine();
	Scanner scan = new Scanner(cash);
	
	while(scan.hasNext())
	{
		String x = scan.next();
		
		for(Money b : inventory)
		{
			if(b.scan().equals(x) || b.getName().equals.(x))
			{
				b.setCount(b.getCount() + 1);
			}
		}
		
		for(Money x : inventory)
		{
			total += x.getValue() * x.getCount();
		}
		
		System.out.println(total);
	}
}