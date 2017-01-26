import java.lang.Math.*;

public class MPH
{
	//instant variables
	private int distance, hours, minutes;
	private double mph;
	
	//default constructor
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	//Constructor w/ params
	public MPH(int dis, int hou, int min)
	{
		distance = dis;
		hours = hou;
		minutes = min;
		mph = 0;
	}
	
	//modifier
	public void setValues(int dis, int hou, int min)
	{
		distance = dis;
		hours = hou;
		minutes = min;
		mph = 0;
	}
	
	//accessor
	public double getMPH()
	{
		mph = Math.round(distance / ((hours + minutes) / 60.0));
		return mph;
	}
}