import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


class Transcript 
{

	private List<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
	private CourseEnrollment course;
	
	public Transcript() 
	{
		
	}

	public List<CourseEnrollment> getCourses() 
	{
		return courses;
	}

	public void setCourses(List<CourseEnrollment> courses) 
	{
		courses = courses;
	}

	public void addCourse(CourseEnrollment course) 
	{
		courses.add(course);
	}


	public double getGpa() 
	{
		double result = 0;
		for (CourseEnrollment course : courses) 
		{
			result += course.getGpa();
		}
		return result;
	}

	public double getAverageGpa() 
	{
		double result = 0;
		int count = courses.size();
		if (getGpa() > 0 && count > 0)
		{
			result = getGpa() / count;
		}
		return result;
	}

	 public String toString()
	    {
	    	String output= "";
	    	
	    	for (CourseEnrollment courses : courses)
	    	{
	    		output += (courses + "\n");
	    	}
	    	return output ;
	    }
	 
	 public String getFormattedGPA()
	 {
		 NumberFormat formatter = new DecimalFormat("0.0");     
		 return formatter.format(this.getAverageGpa());
	 }
}
