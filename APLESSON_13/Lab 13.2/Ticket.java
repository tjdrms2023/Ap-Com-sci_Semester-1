import static java.lang.Math.*;
public abstract class Ticket
{
	private int serialNo;
	private int price;
	
	public Ticket()
	{
		price = 0;
		serialNo = (int)(Math.random() * 9999999 + 1);
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