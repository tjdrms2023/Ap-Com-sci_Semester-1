import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpSolver
{
	static ArrayList <String> equation;
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Equation: ");
		String Eq = kb.nextLine();
		
		equation = new ArrayList<>(Arrays.asList(Eq.split(" ")));
		System.out.println(equation);
		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*")||equation.get(i).equals("/")){
				if(equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * (Integer.parseInt(equation.get(i +1)))));
				}	
				else{
					equation.set(i,  "" + (Integer.parseInt(equation.get(i-1)) / (Integer.parseInt(equation.get(i +1)))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;		
		}
		i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+")||equation.get(i).equals("-"))
			{
                if(equation.get(i).equals("+"))
				{
					equation.set(i,  "" + (Integer.parseInt(equation.get(i-1)) + (Integer.parseInt(equation.get(i +1)))));
				}	
				else{
					equation.set(i,  "" + (Integer.parseInt(equation.get(i-1)) - (Integer.parseInt(equation.get(i +1)))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;	
		}
				
		System.out.println(equation);
	}
		
}

