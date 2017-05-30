public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.toLowerCase().trim();
		
		if (statement.length()==0){
			return "Say something, please.";
		}

		if (findKeyword(statement,"no") >= 0)
		{
			return "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			return "Tell me more about your family.";
		}

		else if (findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"fish") >= 0
				|| findKeyword(statement,"turtle") >= 0)
		{
			return "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement,"robinette") >= 0)
		{
			return "Sounds like a dank teacher.";
		}

		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
			return transformIWantToStatement(statement);
		}
		
		else if (findKeyword(statement, "i", 0) >= 0)
		{
			int psnYou = findKeyword(statement, "you", 0);
			
			if(psnYou >= findKeyword(statement, "i", psnYou)){
				return transformIYouStatement(statement);
			}
		}
		
		else{
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				return transformYouMeStatement(statement);
			}
			}
		
		response = getRandomResponse();
		return response;
		}
		
	private String transformIWantToStatement(String statement)
	{
		statement = statement.toLowerCase().trim();
		String lastChar = statement.substring(statement.length()-1, statement.length());
		
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		statement.trim();
		int psn = findKeyword(statement,"i want to");
		String restOfStatement = statement.substring(psn+9);
		
		return "What would it mean to" + restOfStatement + "?";
	}

	private String transformYouMeStatement(String statement)
	{
		statement = statement.toLowerCase().trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals("."))
		{
			statement.replace(".", " ");
			statement.trim();
		}
		
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe  = findKeyword(statement, "me");
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		
		return "What makes you think that I " + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		statement = statement.toLowerCase().trim();
		String lastChar = statement.substring(statement.length());
		
		if (lastChar.equals("."))
		{
			statement.replace(".", " ");
			statement.trim();
		}
		
		int psnOfI = findKeyword(statement, "I");
		int psnOfYou  = findKeyword(statement, "you");
		
		String restOfStatement = statement.substring(psnOfI+3, psnOfYou);
		
		return "Why do you " + restOfStatement + "me?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		phrase = " " + phrase.toLowerCase() + " ";
			
		int psn = phrase.indexOf(goal,startPos);
		int before,after;
			if (psn>=0){
				before = psn-1;
				after = psn+goal.length();
		
				if (phrase.substring(before, before+1).equals(" ") && phrase.substring(after, after+1).equals(" ")){
					return psn - 1;
				}	
			}
		return -1;
	}
	
	private int findKeyword(String statement, String goal){

		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse(){
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}