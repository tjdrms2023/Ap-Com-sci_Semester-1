public class GMC implements Location
{
	private double xSide;
	private double ySide;
	
	public GMC()
	{
		xSide = 0;
		ySide = 0;
	}
	
	public GMC(double x, double y)
	{
		xSide = x;
		ySide = y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000) + 1;
	}
	
	public void move(double x, double y)
	{
		xSide += x;
		ySide += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double [2];
		location[0] = xSide;
		location[1] = ySide;
		
		return location;
	}
}