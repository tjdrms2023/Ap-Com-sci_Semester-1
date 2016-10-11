import java.util.Scanner;

public class GUIDE_04
{
	public static void main(String[] args)
	{
		Sca7nner kb = new Scanner(System.in);
		System.out.println("How many pieces of pizza do you want?");
		int slices = kb.nextInt();
		System.out.println(slices + "slices, coming right up!");
	}
}