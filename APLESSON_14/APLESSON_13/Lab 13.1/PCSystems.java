public class PCSystems extends gSystem
{

	
	public PCSystems()
	{
		super();
	}
	
	public PCSystems(String p)
	{
		super(p);
	}
	
	public String getSystemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getSystemInput();
	}
}