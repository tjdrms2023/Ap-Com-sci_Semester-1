public interface Car implements Location
{
	private double location[];
	public int ID = (int)(Math.random() * 100000) + 1;
	
	public Car()
	{
		location = new double [1];
	}
	
	public Car(double loc[])
	{
		location = new double [1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000) + 1;
	}
	
	public abstract void move();
	
	public double[] getLoc()
	{
		return location;
	}
	
	
}