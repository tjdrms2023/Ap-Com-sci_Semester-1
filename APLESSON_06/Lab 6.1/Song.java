public class Song
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		int num1= 4;
		
		
		sing(word1, num1);	//put in parameters
		sing(word1, num1);
	}
	
	public static void sing(String word, int num)//need parameters
	{
		for(int i = 0; i <num; i++)
		{
			System.out.print(word +"\t");
		}
	}
}