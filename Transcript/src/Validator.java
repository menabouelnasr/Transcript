import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator 
{
	public static boolean getCourse(String prompt)
	{
		String name = "[a-zA-Z]+";
		Pattern pattern = Pattern.compile(name);
		Matcher match = pattern.matcher(prompt);
	    return match.matches();
	}

	public static int getCredits(int prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	    	if (prompt==1 || prompt==2|| prompt==3|| prompt==4)
	    	{
	    		isValid = true;
	    	}
	    	else
	    		System.out.println( "Error! Invalid value. Try again.");	
	    }
	    return 1;
	}

	public static String getGrades(String prompt)
	{
	    boolean isValid = false;
	    while (isValid == false)
	    {
		    if (prompt.equalsIgnoreCase("A") || prompt.equalsIgnoreCase("B") ||prompt.equalsIgnoreCase("C") || prompt.equalsIgnoreCase("D") || prompt.equalsIgnoreCase("F"))
		    {
		    	isValid = true;
		    }
	        else
	        	System.out.println("Error! Invalid grades value. Try again.");
	        	
	       
	    }
	    return "";
	}

}
