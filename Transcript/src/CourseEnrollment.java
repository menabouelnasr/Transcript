
public class CourseEnrollment 
{
	private String grade, code;
	private int credits,gpa;
	private double total;
	
	
	public CourseEnrollment(String code, int credits, String grade)
	{
		this.code = code;
        this.credits = credits;
        this.grade = grade;
        this.gpa= gpa;
	}
	public String getGrade() 
	{
		return grade;
	}
	public void setGrade(String grade) 
	{
		this.grade = grade;
	}
	public String getCode() 
	{
		return code;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}
	public int getCredits() 
	{
		return credits;
	}
	public void setCredits(int credits) 
	{
		this.credits = credits;
	}

	public void setGpa(int gpa) 
	{
		this.gpa = gpa;
	}
	public int getGpa() 
	{
		if (getGrade().equalsIgnoreCase("A")) 
		{
			gpa=4;
			
		} else if (getGrade().equalsIgnoreCase("B")) 
		{
			gpa=3;
		} else if (getGrade().equalsIgnoreCase("C")) 
		{
			gpa=2;
		} else if (getGrade().equalsIgnoreCase("D")) 
		{
			gpa=1;
		} else {
			gpa=0;
		}
		return gpa;
	}
	public String toString()
	{
		return String.format("%7s", code)+ String.format("%10s", credits)+ String.format("%23s", grade + String.format("%12s", getGpa()));
	}
}
