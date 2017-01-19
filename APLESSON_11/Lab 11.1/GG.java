import java.util.Scanner;
public class GG
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String [CLIPSIZE];
		resetClip();
		
		Scanner kb = new Scanner(System.in);
		
		while( bulletCount >=0 || shotCount >= 0)
		{
			System.out.println("Action: ");
			String action = kb.next();
			
		    if (action.equalsIgnoreCase("R"))
				reload();
			if (action.equalsIgnoreCase("S"))
				System.out.println(shoot());
			
			System.out.println(printClip());
		}
		
		System.out.println("Out of Bullets!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
		    shotCount--;
		    return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if(bulletCount >=CLIPSIZE)
		{
			bulletCount-=CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static String printClip()
	{
		String word = " ";
		System.out.println("Bullets: " + "\t" +bulletCount + "\n" + "Clip: " + "\t");
		
		for(int i = 0; i < CLIPSIZE; i++)
		{
			word += clip[i];
		}
	    
		return word;
	}
}