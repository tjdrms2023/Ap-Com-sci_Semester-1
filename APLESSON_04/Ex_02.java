import java.util.Scanner;

public class Ex_02
{
	public static void main(String[] args)
	{
		Ex_02 form = new Ex_02();
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter your first name:");
		String first = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String last = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.next();
		
	    System.out.println("What is your subject?");
		String subject = kb.next();
		
		System.out.println("***************************");
		form.ID (school, year);
		form.ID (first, last);
		form.ID (title, subject);
		System.out.println("\n***************************");
		
	}
	
	public void ID (String word, String number)
	{
		System.out.printf("\n*" +"%10s    %15s" + "*", word, number);
	}
	
}