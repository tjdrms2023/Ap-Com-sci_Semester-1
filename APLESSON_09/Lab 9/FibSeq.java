import java.util.Scanner;

public class FibSeq
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter your starting number: ");
		int stNum = kb.nextInt();
		
		System.out.println("Please enter your sequence size: ");
		int seqSize = kb.nextInt();
		
		int[] seq = new int[seqSize];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i ==0 || i==1)
			{
				seq[i] =stNum;
			}
			else
			{
				seq[i] = seq[i-2] + seq[i-1];
			}
			System.out.println(seq[i] + " ");
		}
	}
}