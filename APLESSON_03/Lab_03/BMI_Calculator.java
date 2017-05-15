import java.util.Scanner;

public class BMI_Calculator
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hi. Welcome to BMI Calculator. \nWhat is your name, sir?");
		String name=kb.next();
		
		System.out.println("Oh, Mr." +name+ ". How tall are you, Mr." +name+ "?");
		double height = kb.nextDouble();
		
		System.out.println("Oh, you are very tall, sir." + "Then your weight please..?");
		double weight = kb.nextDouble();
		double result = weight / height;
		
		System.out.println("All set! Your BMI is..." + result);
	}
}