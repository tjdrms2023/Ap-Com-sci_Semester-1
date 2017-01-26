import java.util.Scanner;
public class Inventory_Runner
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Will you enter the item category and price information? Y or N: ");
		String YorN = kb.nextLine();
		
		if(YorN.equals("Y"))
		{
			System.out.println("Name: ");
			String name = kb.nextLine();
			System.out.println("Manufacturer: ");
			String manufacturer = kb.nextLine();
			System.out.println("Category: ");
			String category = kb.nextLine();
			System.out.println("Price: ");
			double price = kb.nextDouble();
			Inventory item1 = new Inventory(name, manufacturer, category, price);
			System.out.println(item1);
		}
		else
		{
			System.out.println("Name: ");
			String name = kb.nextLine();
			System.out.println("Manufacturer: ");
			String manufacturer = kb.nextLine();
			
			Inventory item2 = new Inventory(name, manufacturer);
			System.out.println(item2);
			
		}
		
	}
	
	
}