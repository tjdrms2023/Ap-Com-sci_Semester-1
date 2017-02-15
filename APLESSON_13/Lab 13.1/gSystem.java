import java.util.Random;
public class gSystem
{
	String platform;
	int serialNo;
	
	//Constructor
	public gSystem()
	{
		platform = "";
		serialNo = (int)(Math.random() * 1000000 + 1);
	}
	
	//Constructor w/ param
	public gSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * 1000000 + 1);
	}
	
	//Accessors
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}


	
