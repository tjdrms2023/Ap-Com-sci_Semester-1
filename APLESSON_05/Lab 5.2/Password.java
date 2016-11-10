import java.util.Scanner;

public class Password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
		
	}
	
	public static void passCheck()
	{
		System.out.println("Put your username correctly.");
		String un = kb.next();
		
		System.out.println("Put your password correctly.");
		String pw = kb.next();
		
		if(un.equals("csk223") && pw.equals("csk322"))
			System.out.println("You are granted access!");
		else
		{
			if(un.equals("csk223"))
				System.out.println("Your password is incorrect!");
			if(pw.equals("csk322"))
			{
				System.out.println("Your username is incorrect!");
			}	
			else
			{
				System.out.println("Your username and password are incorrect!");
                passCheck();
			}
		}
	}
}