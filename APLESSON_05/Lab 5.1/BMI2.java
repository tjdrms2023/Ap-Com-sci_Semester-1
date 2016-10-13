import java.util.Scanner;

public class BMI2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your height.");
		double height = kb.nextDouble();
		
		System.out.println("Your weight.");
		double weight = kb.nextDouble();
		
		double result1 = weight / height;
		
		String result2 = calcBMI(result1);
		
		
		System.out.println("Your BMI is: " + result1 );
		System.out.println("You are " + result2);
	}
	
	public static String calcBMI(double BMI)
	{
		double BM;
		if(BMI <18.5)
			return "Underweight";
		else if(BMI<24.9)
			return "Normal";
		else if(BMI<29.9)
			return "Overweight";
		else if(BMI<34.9)
			return "Obese";
		else if(BMI<39.9)
			return "VeryObese";
		else 
			return "MorbidlyObese";
	}
}