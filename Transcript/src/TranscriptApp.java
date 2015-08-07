import java.util.Scanner;

public class TranscriptApp {

	public static void main(String[] args) 
	{
		String grade="", course="", choice="y";
		int credits=0;
		
		CourseEnrollment codes = new CourseEnrollment(choice, credits, choice);
		Transcript transcript = new Transcript();
		
		 System.out.println("Welcome to the transcript application.\n");
	 
		        while (choice.equalsIgnoreCase("y"))
		        {
		        	Scanner keyboard = new Scanner(System.in);
		    		System.out.println("Enter course:");
		    		course= keyboard.nextLine();
		    		codes.setCode(course);
		    		
		    		System.out.println("Enter credits:");
		    		credits=keyboard.nextInt();
		    		codes.setCredits(credits);
		    		
		    		System.out.println("Enter grade:");
		    		grade= keyboard.next();
		    		codes.setGrade(grade);
		    		
		            //validates the code
		    		String promptGrades = Validator.getGrades(grade);
		        	boolean promptCourse = Validator.getCourse(course);
		    		int promptCredits = Validator.getCredits(credits);
		    		
		    		
		    		transcript.addCourse(new CourseEnrollment(course, credits, grade));
		    		System.out.println("Would you like to enter another course?");
		    		choice=keyboard.next();
		    		}
		        System.out.println("Course     Credits     Grades    Quality Points ");
				System.out.println("-------------------------------------------------");
		        System.out.println(transcript);
		        System.out.println(" \n                                      GPA = "+ transcript.getFormattedGPA());
		  
		        }

		
		 
	}

