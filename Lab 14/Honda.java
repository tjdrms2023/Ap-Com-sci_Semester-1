public class Honda implements Location
{
	private int ID;
	private double xSide;
	private double ySide;
	private double location[];
	
	public Honda(double loc[])
	{
		xSide = loc[0];
		ySide = loc[1];
		ID = (int)(Math.random() * 999999) + 1;
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
		location = new double [2];
		location[0] = xSide;
		location[1] = ySide;
		
		return location;
	}
}