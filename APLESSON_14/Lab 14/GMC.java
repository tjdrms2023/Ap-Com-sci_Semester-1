public class GMC implements Location
{
	private double xSide;
	private double ySide;
	private int ID;
	
	public GMC(double x, double y)
	{
		xSide = x;
		ySide = y;
		ID = (int)(Math.random()*999999)+1;
	}
	
	public int getID()
	{
		return ID;
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