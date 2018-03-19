/* Corey Hicks
 * 18 Mar 2018
 * CIS 402A
 * 
 * Create a CollegeStudent class.  This class will contain data fields that hold a student's first name, 
 * last name, enrollment date, and projected graduation date, using the GregorianCalendar class for each 
 * date.  Provide get() and set() methods for each field.  Also provide a constructor that requires 
 * first and last names and enrollment date, and sets the project graduation date to exactly four years 
 * after enrollment.  Save the class as CollegeStudent.java.
 * 
 * Create an interactive application that prompts the user for data for two CollegeStudent objects.  
 * Prompt the user for first name, last name, enrollment month, enrollment day, and enrollment year for 
 * each CollegeStudent, and then instantiate the objects.  Display all the values, including the 
 * projected graduation dates.  Save the application as TestCollegeStudent.java
 * 
 * GregorianCalendar enrollmentDate;
 * public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate){}	
 * 
 * 		This program challenged me to create getters, setters, and a constructor to accomplish the tasks listed above.
 * I started by instantiating all 4 variables as private. A constructor is then defined that takes 4 variables. Finally,
 * Getter and Setter methods are defined for each variable.*/

// imports all java utilities
import java.util.*;
public class CollegeStudent {
	
	//initializes private variables
	private String firstName;
	private String lastName;
	private GregorianCalendar enrollmentDate;
	private GregorianCalendar graduationDate;
	
	// defines CollegeStudent constructor that takes 4 variables
	public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate, GregorianCalendar graduationDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setEnrollmentDate(enrollmentDate);
		setGraduationtDate(graduationDate);
	}
	
	// set methods for all 4 variables
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEnrollmentDate(GregorianCalendar enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
		
	}
	
	public void setGraduationtDate(GregorianCalendar graduationDate) {
		this.graduationDate = graduationDate;
		
	}
	
	// get methods for all 4 variables
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Date getEnrollmentDate() {
		return enrollmentDate.getTime();
	}
	
	public Date getGraduationDate() {
		return graduationDate.getTime();
	}
}
