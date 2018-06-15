/* Corey Hicks
 * 13 March 2018
 * CIS 402A
 * 
 * 		Create a class that calculates and displays the conversion of an entered number of dollars into currency 
 * denominations - 100s, 50s, 20s, 10s, 5s, and 1s.  Obtain all inputs and display all outputs using dialog 
 * boxes.  Save the class as Dollars.Java. 
 * 
 * 		This program uses the javax.swing package to utilize pre-built methods that display message dialogs. The 
 * focus of this program is to focus on static vs non-static methods. First, the user is prompted with an input 
 * dialog to enter a double value. Second, the user input value is passed to a static method that squares the 
 * entered value and returns the new value to a message dialog. Third, the entered value is passed to a non-
 * static method before cubing the value and returning the new value to a message dialog. As a note for non-static
 * methods, class objects must be instantiated in the static method that is calling the non-static method before
 * the non-static method in the respected class.	*/

import javax.swing.*;

public class Exponent {

	public static void main(String[] args) {

		double enteredValue = 0;
		String rawInput;

		// gets user input and assigns the string to rawInput
		rawInput = JOptionPane.showInputDialog(null, "Please enter a double: ");
		// parses double value from rawInput and assigns it to enteredValue
		enteredValue = Double.parseDouble(rawInput);

		// instantiates new Exponent class object and assigns it to obj
		Exponent obj = new Exponent();

		// calls static method and displays output in a Message Dialog
		JOptionPane.showMessageDialog(null, enteredValue + " squared is " + squared(enteredValue));
		// calls non-static method and displays output in a Message Dialog
		JOptionPane.showMessageDialog(null, enteredValue + " cubed is " + obj.cubed(enteredValue));
	}

	// static method that is passed a double value
	public static double squared(double numberSquared) {

		double result = Math.pow(numberSquared, 2);
		// uses math.pow method to square the passed double value before returning
		return result;

	}

	// non-static method that is passed a double value
	public double cubed(double numberCubed) {

		double result = Math.pow(numberCubed, 3);
		// uses math.pow method to cube the passed double value before returning
		return result;

	}
}
