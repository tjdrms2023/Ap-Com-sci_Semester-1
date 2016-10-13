import java.util.Scanner;

public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Enter your English Grade");
		String Eng = kb.next();
		
		System.out.println("Enter your Math Grade");
		String Math = kb.next();
		
		System.out.println("Enter your History Grade");
		String Hist = kb.next();
		
		System.out.println("Enter your Computer Science Grade");
		String Com = kb.next();
		
		System.out.println("Enter your Economics Grade");
		String Econ = kb.next();
		
		System.out.println("Enter your Physics Grade");
		String Sci = kb.next();
		
		System.out.println("Enter your Painting Grade");
		String Paint = kb.next();
		
		double gPoints = calcPoints(Eng) +calcPoints(Math)+calcPoints(Hist)+calcPoints(Com)+calcPoints(Econ)+calcPoints(Sci)+calcPoints(Paint);
		double result = gPoints / 7;
		System.out.println("Your GPA is " + result);
		
	}
	public static double calcPoints(String subject)
	{
		double GradePoints = 0.0;
		if (subject.equals("A"))
			return 4.0;
		if (subject.equals("B"))
			return 3.0;
		if (subject.equals("C"))
			return 2.0;
		if (subject.equals("D"))
			return 1.0;
		if (subject.equals("F"))
			return 0;
		return GradePoints;
	}
}