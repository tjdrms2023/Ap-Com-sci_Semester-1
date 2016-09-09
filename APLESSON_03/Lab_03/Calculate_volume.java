import java.util.Scanner;

public class Calculate_volume
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Volume Calculation: \n input width.");
		double w =kb.nextDouble();
		
		System.out.println("input length.");
		double l =kb.nextDouble();
		
		System.out.println ("input height.");
		double h = kb.nextDouble();
		double result = w*l*h;
		
		System.out.println("All set. the volume is.... \n" + result);
	}
}