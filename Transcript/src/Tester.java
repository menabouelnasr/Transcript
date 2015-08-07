import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Tester 
{
	@Test
	   public void test_GPA() 
	   {
	      System.out.println("Test if GPA gets set properly to a 4.0 for a grade of A.") ;
	      CourseEnrollment S = new CourseEnrollment("class 1",2, "A") ;
	      assertTrue(S.getGpa() == 4.0) ; 
	   }
	@Test
	   public void test_GPA2() 
	   {
	      System.out.println("Test if GPA gets set properly to a 3.0 for a grade of B.") ;
	      CourseEnrollment S1 = new CourseEnrollment("class 1",2, "B") ;
	      assertTrue(S1.getGpa() == 3.0) ; 
	   }
	@Test
	   public void test_GPA3() 
	   {
	      System.out.println("Test if GPA gets set properly to a 2.0 for a grade of C.") ;
	      CourseEnrollment S2 = new CourseEnrollment("class 1",2, "C") ;
	      assertTrue(S2.getGpa() == 2.0) ; 
	   }
	@Test
	   public void test_GPA4() 
	   {
	      System.out.println("Test if GPA gets set properly to a 1.0 for a grade of D.") ;
	      CourseEnrollment S3 = new CourseEnrollment("class 1",2, "D") ;
	      assertTrue(S3.getGpa() == 1.0) ;
	   }
	@Test
	   public void test_GPA5() 
	   {
	      System.out.println("Test if GPA gets set properly to a 0.0 for a grade of F.") ;
	      CourseEnrollment S4 = new CourseEnrollment("class 1",2, "F") ;
	      assertTrue(S4.getGpa() == 0.0) ; 
	   }
	@Test
		public void test_validator()
		{
	    
	      System.out.println("Test course name validator evaluates the inputted course.") ;
	      Validator x = new Validator();
	      assertTrue(x.getCourse("name")==true); 
		}
	@Test
	public void test_validator2()
	{
		  System.out.println("Tests Grade.") ;
		  Validator y = new Validator();
		  assertTrue(y.getGrades("A").equalsIgnoreCase("")); 
	}
	@Test
	public void test_validator3()
	{
		  System.out.println("Tests Credits.") ;
		  Validator z = new Validator();
		  assertTrue(z.getCredits(1)==1); 
			
		}
}
