import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter hair color: ");
		String hair = kb.nextLine();
		System.out.println("Enter eye color: ");
		String eyes = kb.nextLine();
		System.out.println("Enter skin tone: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair,eyes,skin);
	
		System.out.printf("My info...%nHair: %s%nEyes: %s%nSkin: %s%n",object.getHair(),object.getEyes(),object.getSkin());
		
		object.setHES("brown","blue","pale");
		System.out.printf("Friend's info...%nHair: %s%nEyes: %s%nSkin: %s%n",object.getHair(),object.getEyes(),object.getSkin());

		
		
		
	}
}