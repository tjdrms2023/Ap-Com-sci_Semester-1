public class Lesson_04
{
	public static void main(String[] args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blash";
		double number1 = 4564.45343;
		
		form.format(word1, number1);
		
		String word2 = "Yessss";
		double number2 = 203984.234;
		
		form.format(word2, number2);
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
}