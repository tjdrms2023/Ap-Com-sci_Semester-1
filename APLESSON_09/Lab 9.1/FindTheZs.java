import java.util.Scanner;
public class FindTheZs
{
	static String [] Array = new String [5];
	public static void main(String[]args)
	{
		fillArray();
		
		System.out.println("For the wordds" + printArray());
		System.out.println("only" + hasZs() + "contains the letter z.");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter 5 things: ");
		
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = kb.next();
		}
	}
	
	public static String printArray()
	{
		String array = " ";
		for (String word : Array)
		{
		   array += (word + " ");
		}
		return array;
	}
	
	public static String hasZs()
	{
		String zs = " ";
		
		for(String word : Array)
		{
			if(word.indexOf("z") >=0)
			   zs= zs + " " + word;
		}
		
		if (zs == " ")
		   zs = "none";
	   return zs;
	}

}	