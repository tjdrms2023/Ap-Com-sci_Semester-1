//1 string paramter that contains the coordinates.
//split()

public class Toyota implements Location
{
	private double xSide;
	private double ySide;
	private int ID;
	
	public Toyota(String loc)
	{
		xSide = Double.parseDouble(loc.split(", ")[0]);
		ySide = Double.parseDouble(loc.split(", ")[1]);
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