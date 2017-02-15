public class GameRunner
{
	public static void main(String[]args)
	{
		gSystem PC = new PCSystems("PCMR");
		gSystem XBox = new XBox("XBONE");
		Console PS = new PlayStation("PSHIT");
		
		System.out.println(PC);
		System.out.println(XBox);
		System.out.println(PS);

	}	
}