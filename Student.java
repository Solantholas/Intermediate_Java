/* Create a class named Student that includes String data fields titled firstName and lastName, and an integer field titled studentID. 
 * Create a constructor that requires two String parameters and one integer parameter to populate the firstName, lastName, and 
 * studentID fields*/

public class Student {

	private String firstName;
	private String lastName;
	private int studentID;
	
	// defines Student constructor that takes 3 variables
	public Student(String firstName, String lastName, int studentID) {
		setFirstName(firstName);
		setLastName(lastName);
		setStudentID(studentID);
	}
	
	// set methods for all 3 variables
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	// get methods for all 3 variables
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	// override method for printing LinkedList elements
	@Override
	  public String toString(){

	    return (
	    	
    		Integer.toString(studentID) + "\t" +
	    	firstName + "\t\t" + lastName);
	    
	  }
	
}
