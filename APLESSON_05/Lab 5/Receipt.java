import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("item 1");
		String it1 = kb.next();
		
		System.out.println("price 1");
		double pr1 = kb.nextDouble();
		
		System.out.println("item 2");
		String it2 = kb.next();
		
		System.out.println("price 2");
		double pr2 = kb.nextDouble();
		
		System.out.println("item 3");
		String it3 = kb.next();
		
		System.out.println("price 3");
		double pr3 = kb.nextDouble();
		
		System.out.println("item 4");
		String it4 = kb.next();
		
		System.out.println("price 4");
		double pr4 = kb.nextDouble();
		
		double subPrice = pr1 + pr2 + pr3 + pr4;
		double taxPrice = subPrice/10;
		double discount = discount(subPrice);
		double total = subPrice + taxPrice - discount;
		
		
		String subtotal = "subtotal";
		String Tax = "Tax";
		String Total = "Total";
		
	    System.out.println("\n <<<<<<<<<<<<<___RECEIPT___>>>>>>>>>>>>>");
	
	
	   form.format(it1, pr1);
	   form.format(it2, pr2);
	   form.format(it3, pr3);
	   form.format(it4, pr4);
	   form.format(subtotal, subPrice);
	   form.format(Tax, taxPrice);
	   form.format(Total, total);
	   
		System.out.println("\n_________________________________________");
		System.out.println("\n         * Thank you for your support *");
	}
	
	public static double discount(double total)
	{
		double discount=0;
		if(total > 2000)
			discount = total * 0.85;
		if(total < 2000)
			discount = total;
		return discount;
	}
	
	public void format (String it, double pr)
	{	
		System.out.printf("\n*"+"%20s" +"........." +  "%10.2f", it, pr);
	
	}
}