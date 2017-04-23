public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket Wu = new Walkup(14);
		Ticket Ad = new Advance(5);
		Advance StAd = new StudentAdvance(20);
		
		System.out.println("Walkup\n" + Wu + "\n" );
		System.out.println("Advance\n" + Ad + "\n" );
		System.out.println("Student advance\n" + StAd + "\n" );
	}
}