public class Bill extends Money
{
    private String name;
	private String face;
	private double value;
	
	public Bill()
	{
        super();
		this.face = "";
	}
	
	public Bill(String n, String f, double y)
	{
        super(n,v);
		this.face = 0; 
	}
	
	public String scan()
	{
		return face;
	}
	public String toString()
	{
		return "Face: " + face + "\n"
		       super.toString();
	}
}