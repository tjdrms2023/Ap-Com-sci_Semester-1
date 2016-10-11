import java.util.Scanner;

public class Ex_03
{
	public static void main (String[] args)
	{
		
		Ex_03 form = new Ex_03 ();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your interest rate?");
		double intRate = kb.nextDouble();
		
		System.out.println ("What is your principal value?");
		double principal = kb.nextDouble();
		
		System.out.println("Put your number of time the loan is compounded per year.");
		double numOfTimes = kb.nextDouble();
		
		System.out.println("Put your life of the loan.");
		double lifeLoan = kb.nextDouble();
		
		double result = form.calcLoan(intRate, principal, numOfTimes, lifeLoan);
		
		
		System.out.printf ("Your total monthly payment is $ %10.2f" ,result / 12);
		System.out.printf ("\nYour total yearly payment is $ %10.2f",result);
		
		
	}
	
	public double calcLoan (double intRate, double principal, double numOfTimes, double lifeLoan)
	{
		double base = 1 + (intRate / numOfTimes);
		double exponent = numOfTimes * lifeLoan ;
		
		return principal * Math.pow(base, exponent);
		
		
	}
}