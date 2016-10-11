import java.util.Scanner;

public class GUIDE_10
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
System.out.println("Please enter your Math grade: ");
double math = kb.nextDouble();
System.out.println("Please enter your Science grade: ");
double science = kb.nextDouble();
System.out.println("Please enter your English grade: ");
double english = kb.nextDouble();
System.out.println("Please enter your History grade: ");
double history = kb.nextDouble();
System.out.println("Please enter your COMPSCI grade: ");
double compsci = kb.nextDouble();

double gpa = (math + science + english + history + compsci)/500;
System.out.println(gpa);
	}
}