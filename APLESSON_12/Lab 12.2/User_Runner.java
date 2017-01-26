import java.util.Scanner;
public class User_Runner
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("First name: ");
		String firstName = kb.nextLine();
		System.out.println("Last name: ");
		String lastName = kb.nextLine();
		System.out.println("Public avatar? Y or N: ");
		String YorN = kb.nextLine();
		
		if(YorN.equals("N"))
		{
			User user1 = new User (firstName, lastName);
			System.out.println(user1);
			
		}
		else
		{
			System.out.println("Avatar: ");
			String avatar = kb.nextLine();
			User user2 = new User(firstName, lastName, avatar);
			System.out.println(user2);
			
		}
		
	}
	
	
}