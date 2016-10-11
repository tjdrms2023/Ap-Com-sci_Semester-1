class Lab_02
{
	public static void main(String[] args)
	{
		int num1 = 3;
		int num2 = 5;
		int result = num1 * num2;
		
		System.out.println (num1 + " multiplied by " + num2 + " is " + result);
		
		String Name = "Seong Geun Cho";
		String Address = "12640 Torrey Bluff #16";
		String City = "San Diego";
		int zipCode = 92130;
		String State = "california";
		
		System.out.println (Name);
		System.out.println (Address);
		System.out.println (City +", "+  State + " " +  zipCode);
		
		int Length = 10;
		int Height = 9;
		int Width = 8;
		int surfaceArea = 2*(Length + Height) + 2*(Height + Width) + 2*(Width + Length);
		
		System.out.println ("The surface area of your rectangle is "+ surfaceArea);
	}
}