import java.util.Random;
public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 1000000 + 1);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}