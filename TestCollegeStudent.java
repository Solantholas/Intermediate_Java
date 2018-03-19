/* Corey Hicks
 * 18 Mar 2018
 * CIS 402A
 * 
 * 		This program prompts the user through several dialog boxes to enter user information for 2 students.
 * Each student requires: first name, last name, day-month-year of enrollment to school. New GregorianCalendar
 * objects are initialized and the day-month-year are passed into the first GC object. The second GC object
 * utilizes the add method to augment the year value by 4 years. Finally, a message dialog displays all the
 * user input with getter method calls from the previous program.*/

// import all java utilities and javax swing
import java.util.*;
import javax.swing.*;

public class TestCollegeStudent {

	public static void main(String[] args) {
		
		String rawInput; // initialize blank string value
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' First Name: ");
		String firstName = (rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Last Name: ");
		String lastName = (rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Day: ");
		int Day = Integer.parseInt(rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Month (0 - 11): ");
		int Month = Integer.parseInt(rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Year: ");
		int Year = Integer.parseInt(rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' First Name: ");
		String firstName02 = (rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Last Name: ");
		String lastName02 = (rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Day: ");
		int Day02 = Integer.parseInt(rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Month (0 - 11): ");
		int Month02 = Integer.parseInt(rawInput);
		
		// prompts user for input with input dialog box
		rawInput = JOptionPane.showInputDialog(null, "Please enter the students' Enrollment Year: ");
		int Year02 = Integer.parseInt(rawInput);

		// instantiates new GregorianCalendar object and sets year, month, and day from user input
		GregorianCalendar enrollment = new GregorianCalendar(Year, Month, Day);	
		// instantiates new GregorianCalendar object and sets year, month, and day from user input
		GregorianCalendar graduation = new GregorianCalendar(Year, Month, Day);
		
		// utilizes the calendar add method to add 4 years to the graduation GregorianCalendar object
		graduation.add(Calendar.YEAR, 4);
		
		// instantiates new GregorianCalendar object and sets year, month, and day from user input
		GregorianCalendar enrollment02 = new GregorianCalendar(Year02, Month02, Day02);
		// instantiates new GregorianCalendar object and sets year, month, and day from user input
		GregorianCalendar graduation02 = new GregorianCalendar(Year02, Month02, Day02);
		
		// utilizes the calendar add method to add 4 years to the graduation GregorianCalendar object
		graduation02.add(Calendar.YEAR, 4);
		
		// instantiates new CollegeStudent object and passes in first name, last name, enrollment, and graduation dates
		CollegeStudent student1 = new CollegeStudent(firstName, lastName, enrollment, graduation);
		// instantiates new CollegeStudent object and passes in first name, last name, enrollment, and graduation dates
		CollegeStudent student2 = new CollegeStudent(firstName02, lastName02, enrollment02, graduation02);
		
		//displays user input for the first student object
		JOptionPane.showMessageDialog(null, "Student Name: " + student1.getFirstName() + " " + student1.getLastName() + "\n" +
											"Enrollment Date: " + student1.getEnrollmentDate() + "\n" +
											"Approximate Graduation Date: " + student1.getGraduationDate());
		
		//displays user input for the second student object
		JOptionPane.showMessageDialog(null, "Student Name: " + student2.getFirstName() + " " + student2.getLastName() + "\n" +
				"Enrollment Date: " + student2.getEnrollmentDate() + "\n" +
				"Approximate Graduation Date: " + student2.getGraduationDate());

	}

}
