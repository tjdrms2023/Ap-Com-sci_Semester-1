public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

public String getResponse(String statement){
	
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
	
		else if (findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "robinette") >= 0 )
		{
			response = "Is he a pretty dank teacher?";
		}

		
		
	
	// Responses which require transformations
	else if (findKeyword(statement, "I want to", 0) >= 0)
	{
	  response = transformIWantToStatement(statement);
	}


	else
	{
	  // Look for a two word (you <something> me)
 	 // pattern
 	 int psn = findKeyword(statement, "you", 0);


		if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
		{
		response = transformYouMeStatement(statement);
		}
		else
		{
			response = getRandomResponse();
		}
	psn = findKeyword(statement, "i", 0);


 	 if (psn >= 0   && findKeyword(statement, "you", psn) >= 0)
  	{
   	  response = transformIYoustatement(statement);
	  }
 	 else
  	{
     	response = getRandomResponse();
 	 }
	 
	 

	}
	return response;
	
	
}






private String transformIWantToStatement(String statement)
{
	String lastChar = statement.substring(statement.length() - 1); 
	if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
statement.trim();
		int psn = findKeyword (statement, "i want to", 0);
		String restOfStatement = statement.substring(psn + 6);
		return "What would it mean to " + restOfStatement + "?";
	}



private String transformYouMeStatement(String statement)
{
	statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}



private String transformIYoustatement(String statement)
		{
		   statement = statement.trim();
		   String lastChar = statement.substring(statement.length() - 1, statement.length());
		   if(lastChar.equals("."))
		   {
			    statement = statement.substring(0,statement.length()-1);
		   }
		   int psnofI = findKeyword(statement, "i");
		   int psnofYou = findKeyword(statement, "you", psnofI+1);
		   String restOfStatement = statement.substring(psnofI+1, psnofYou-1);
		   return "Why do you " + restOfStatement + " me?";
		}

	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		phrase = " " + phrase.toLowerCase() + " ";
			
		int psn = phrase.indexOf(goal, startPos);
		
		int before, after;
			if (psn>=0){
				before = psn-1;
				after = psn+goal.length();
		
				if (phrase.substring(before, before+1).equals(" ") && phrase.substring(after, after+1).equals(" ")){
					return psn - 1;
				}	
			}
		return -1;
	}


	
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 5;
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
		else if (whichResponse == 4)
			response = "I dont really know about that.";

		return response;
	}
}