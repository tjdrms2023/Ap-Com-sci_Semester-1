import java.util.*;
public abstract class Car implements Location
{
	private double[] location = new double [2];
	public int ID;
	
	public Car()
	{
		location[0] = 0;
		location[1] = 0;
		ID = (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double a, double b)
	{
		location[0] +=a;
		location[1] +=b;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
		public int getID()
	{
		return ID;
	}
}