import java.util.*;
public abstract class Car implements Location
{
	private double x,y;
	public int ID;
	public double [] location;
	
	public Car()
	{
		x = 0;
		y = 0;
		ID = (int)(Math.random() * 999999) + 1;
	}
	
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double a, double b)
	{
		x+=a;
		y+=b;
	}
	
	public double[] getLoc()
	{
		location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
	
	
}