import java.util.Scanner;
public class Distance_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Put your values: ");
		int x1 = kb.nextInt();
		int y1 = kb.nextInt();
		int x2 = kb.nextInt();
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.println("distance: " + object.getDist());
		
		object.setValues(1,3, 2, 4);
		
		System.out.println("distance: " + object.getDist());
		
	}
}