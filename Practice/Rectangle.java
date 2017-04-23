public class Rectangle implements CutShapes
{
	double sideA, sideB;
	
	public Rectangle()
	{
		sideA = sideB = 0;
	}
	
	public Rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	
	public double getsideA()
    {
		return sideA;
	}
	
	public double getsideB()
	{
		return sideB; 
	}
	
	public double getArea()
	{
		return sideA * sideB;
	}
}