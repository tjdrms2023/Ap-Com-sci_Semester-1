public class rollDice
{
	public static void main(String[] args)
	{
		int p = 1+ (int)((Math.random()*7));
		int c = 1 + (int)((Math.random()*7));
		
		String winner = rollDice(p, c);
		
		System.out.println("You rolled a " + p);
		System.out.println("Computer rolled a " + c);
		System.out.println("The winner is "+ winner);
	}
	
	public static String rollDice(int player, int computer)
	{
		String winner = "";
		if(player > computer)
		  winner = "Player";
        if(player < computer)
			winner = "Computer";
		return winner;
	}

}
