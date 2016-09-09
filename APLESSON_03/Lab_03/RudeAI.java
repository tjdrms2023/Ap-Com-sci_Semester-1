import java.util.Scanner;

public class RudeAI
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI. \nI'd like to ask you a few questions. \nWhat is your name?");
		String name =keyboard.next();
		
		System.out.println(name + "?!!!" + "Why would anyone name a baby that? \nHow old are you," + name + "?");
		String age =keyboard.next();
		
		System.out.println("Oooooo!!!" + age + "is getting up there. \nWhat do you do for fun," + name + "?");
		String hobby =keyboard.next();
		
		System.out.println("I thought only nerds like to " + hobby + "?\nWhat kind of music do you like?");
		String music =keyboard.next();
		
		System.out.println("Booo!!"+ "I wouldn't wish the sound of " + music + "on my worst enemy. \nHow many sibilings do you have?");
		String numOfSiblings =keyboard.next();
		
		System.out.println(numOfSiblings + "?" + "Wow, I hope the rest of your family is better looking. \nWhat do you wnat to be when you grow up?");
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a" + job + ". \nSo" +name + ", you're" + age + "... \nYou like to " +hobby +"and listen to" +music + ". \nGood luck becoming a " + job +". \nI'm only kiddin'" + name);
		
		
		
	
	}
}