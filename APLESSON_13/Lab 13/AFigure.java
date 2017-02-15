public class AFigure extends Toy
{
	private String name;
	
	public AFigure()
	{
		name = "";
	}
	
	public AFigure(String n)
	{
		name = n;
	}
	
	public String getType()
	{
		return "Action Figure";
	}
	
	public String toString()
	{
		return name;
	}
}


