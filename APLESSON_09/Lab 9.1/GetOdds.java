public class GetOdds
{
	static int [] Array = new int [10];
	public static void main(String[]args)
	{
		
		fillArray();
		System.out.println("For the following number..." + printArray());
		System.out.println("The " + getOdds() + " are odd numbers.");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < Array.length; i++)
		{
		    Array[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static String printArray()
	{
		String array = " ";
		for (int num : Array)
		{
		   array += (num + " ");
		}
		return array;
	}
	
	public static String getOdds()
	{
		String odds = " ";
		for(int num : Array)
		{
		    if(num % 2 == 1)
			{
				odds += (num + " ");
			}
		}
		return odds;
	}
}