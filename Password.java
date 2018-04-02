/* Corey Hicks
 * 1 April 2018
 * CIS 402A
 * 
 * Write an application that accepts a user's password from an input dialogs.  When the entered password is less than six 
 * characters, more than 10 characters, or does not contain at least one letter and one digit, prompt the user again.  
 * When the user's entry meets all the password requirements, prompt the user to reenter the password, and do not let 
 * the user continue until the second password matches the first one.  Save the file as Password.java.
 * 
 * 		This week I worked with Regular Expressions or regex. I was able to validate user input by using the .matches
 * method with a captured string from the user. This is accomplished by an if/else statement that checks the regex with
 * the user input (regex description below). A do/while statement forces the user to enter their first password and
 * second password until both passwords are exact matches and fit the regex criteria.
 * 
 * Note: requirements do not specify special characters. While these characters are not included in the requirements, they 
 * are allowed to be used in the passwords.	*/

import javax.swing.*;

public class Password {

	public static void main(String[] args) {
		
		String rawInput;
		String password1 = null;
		String password2 = null;
		boolean test;
		
		// prompt user to enter initial password following regex validation criteria
		do {
			
			// accepts user input
			rawInput = JOptionPane.showInputDialog(null, "Please enter a password: ");
			
			/* validates user input with regex:
			 * ^ 			start of the string
			 * (?=.*[0-9]) 	string must have one number
			 * (?=.*[a-z]) 	string must have one lower case letter
			 * (?=.*[A-Z]) 	string must have one upper case letter
			 * .{6,10} 		string must be between 6 and 10
			 * $			end of the string	*/
			if (!(rawInput.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,10}$"))) {
				
				// invalid entry message and flips boolean to false
				JOptionPane.showMessageDialog(null, "Password must contain the following: \n\n" +
													"Between 6 and 10 characters \n" +
													"1 lower case letter \n" +
													"1 upper case letter \n" +
													"1 number \n");
				
				test = false;
				
			}
					
			// assigns valid password to string element and flips boolean to true
			else {
				
				password1 = rawInput;
				test = true;
				
			}
		
		} while(!(test));
		
		// prompt user to re-enter password and validates entry with initial password
		do {
			
			rawInput = JOptionPane.showInputDialog(null, "Please re-enter your password: ");
			
			// validates 2nd password attempt with exact match only
			if (!(rawInput.matches(password1))) {
				
				// invalid entry message and flips boolean to false
				JOptionPane.showMessageDialog(null, "Password mismatch, please try again.");
				test = false;
				
			}
			
			else {
				
				// assigns valid password to string element and flips boolean to true
				password2 = rawInput;
				test = true;
				
			}
			
		} while(!(test));
		
		JOptionPane.showMessageDialog(null, "Great job, you entered both passwords in the correct format! \n" +
											"First attempt: " + password1 + "\n" +
											"Second attempt: " + password2);
		
	}

}
