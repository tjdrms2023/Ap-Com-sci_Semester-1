import java.util.Scanner;

public class SpaceShooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*100)+1;
		
		if (target == enemyLoc)
			System.out.println("Hit");
		else
			System.out.println("GAme over");
	}
}