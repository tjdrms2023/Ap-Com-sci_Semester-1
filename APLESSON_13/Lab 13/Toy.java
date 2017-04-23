public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy (String n)
	{
		name = n;
		count = 1;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
    //Modifiers
	public void setName(String n)
	{
		name = n;
	}
	
	public void setCount(int c)
	{
		count = c;
	}
	
	public abstract String getType();

	
	public String toString()
	{
		return name + count;
	}
}