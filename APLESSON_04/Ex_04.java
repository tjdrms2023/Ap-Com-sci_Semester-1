import java.util.Scanner;

public class Ex_04
{
	public static void main(String[] args)
	{
		Ex_04 form = new Ex_04 ();
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println ("Height.");
		double h = kb.nextDouble();
		
		System.out.println ("Length.");
		double l = kb.nextDouble();
		
		System.out.println ("Width.");
		double w = kb.nextDouble();
		
		double result = form.calcVol (h, l ,w);
		
		System.out.printf ("The volume of subwoofer boxes in cubic feet is %10.2f", result );
		System.out.printf ("\nThe volume of subwoofer boxes in cubic inch is %10.10f", result /(12*12*12));
		
		
	}
	
	public double calcVol(double h, double l, double w)
	{
		return h * l * w;
	}
}