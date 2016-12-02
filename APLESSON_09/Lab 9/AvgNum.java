public class AvgNum
{
	public static void main(String[]args)
	{
		int [] nums = new int [10];
		System.out.println("10 numbers");
		
		for (int i = 0; i < nums.length; i++)
	    {
		   nums[i] = (int)(Math.random() * 100) + 1;
	    }
		System.out.println("numbers...");
		
		for (int num : nums)
		{
		   System.out.print(num + " ");
		}
		System.out.println("\n");
		System.out.println("The average of the numbers: " +average(nums));
	}
	
	public static int average(int[] n)
	{
		int average = 0;
		for(int num : n)
		{
			average += num;
		}
		return average / 10;
	}
}