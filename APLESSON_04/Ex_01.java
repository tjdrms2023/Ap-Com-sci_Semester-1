import java.util.Scanner;

public class Ex_01
{
	public static void main(String[] args)
	{
		Ex_01 form = new Ex_01();
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter item1:");
		String item1 = kb.nextLine();
	
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item3:");
		String item3 = kb.next();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		double subPrice = price1 + price2 + price3;
		double taxPrice = subPrice/10;
		double totalPrice = subPrice + taxPrice;
		
		String subtotal = "subtotal";
		String Tax = "Tax";
		String Total = "Total";
		
			     System.out.println("\n<<<<<<___RECEIPT___>>>>>>>");
	
	
	   form.format(item1, price1);
	   form.format(item2, price2);
	   form.format(item3, price3);
	   form.format(subtotal, subPrice);
	   form.format(Tax, taxPrice);
	   form.format(Total, totalPrice);
	   
		System.out.println("\n___________________________________");
		System.out.println("\n* Thank you for your support *");
	}	
	
	public void format (String item, double price)
	{	
		System.out.printf("\n*"+"%20s" +"........." +  "%10.2f", item, price);
	
	}
}