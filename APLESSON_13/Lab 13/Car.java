public class Car extends Toy
{
	private String name;
	
	public Car()
	{
		name = "";
	}
	
	public Car(String n)
	{
		name = n;
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return name;
	}
}