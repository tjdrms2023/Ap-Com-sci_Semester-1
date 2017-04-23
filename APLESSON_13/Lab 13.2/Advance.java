public class Advance extends Ticket
{
	private int daysLeft = 0;
	
	public Advance(int d)
	{
		d = daysLeft;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30.00;
		else
			return 40.00;
	}
}
