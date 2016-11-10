import java.util.Scanner;

public class AdvGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Advanture starts. Choose A or B.");
		String choice = kb.next();
		
		if(choice.equals("A"))
		{
			System.out.println("Choose C or D");
			String cho2 = kb.next();
			if (cho2.equals("C"))
			{
				System.out.println("Choose E or F.");
				String cho3 = kb.next();
					if(cho3.equals("E"))
					{
						System.out.println("You got the first place!");
					}
					else
					{
						System.out.println("You got the second!");
					}	
			}
			else
			{	
				System.out.println("Choose E or F.");
				String cho21 = kb.next();
					if(cho21.equals("F"))
					{
						System.out.println("You got the third!");
					}
					else
					{	
						System.out.println("You got the fourth...");
					}	
			}	
        }
			
		else
		{	
			System.out.println("Choose C or D");
		    String oth = kb.next();
				if(oth.equals("C"))
				{	
					System.out.println("Choose E or F");
					String oth2 = kb.next();
	
					if(oth2.equals("E"))
					{
						System.out.println("Fifth place...");
					}
					else
					{	
						System.out.println("Sixth place...");
					}	
				}
				else
				{	
					System.out.println("Choose E or F.");
					String ano = kb.next();
					if(ano.equals("F"))
					{
						System.out.println("Seventh place...");
				    }
					else
					{	
						System.out.println("Eighth place...");
					}	
				}	
		}			
	}
}