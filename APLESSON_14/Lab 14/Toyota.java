//1 string paramter that contains the coordinates.
//split()

public class Toyota implements Location
{
	private double xSide;
	private double ySide;
	private String location[];
	
	public Toyota()
	{
		location = new String [1];
	}
	
	public Toyota(String loc)
	{
		location = new String [1];
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