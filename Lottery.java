/* Create a lottery game application.  Generate four random numbers, each between 0 and 9 (inclusive).  Allow the user to guess four numbers.  
 * Compare each of the user’s guesses to the four random numbers and display a message that includes the user’s guess, the randomly 
 * determined four-digit number, and the amount of points the user has won as follows:
 * 
 * no matches = 0 points
 * any one digit match = 5 points
 * any two digits matching = 100 points
 * any three digits matching = 2,000 points
 * all four digits matching = 1,000,000 points	
 * 
 * 		This program focused on using loops, if/else statements, and case/switch statements to build logically sound programs. 
 * First, user input is obtained with a for loop that iterates 4 times and assigns those values to an array only if the input
 * is between 0 and 9. Second, the computer "guesses" are obtained with a for loop that iterates 4 times and assigns the 
 * values to a second array. Third, the user input is compared to the computer guesses with a inner and outer for loops along
 * with if/else statements before assigning the values to a 3rd array and adding the number of correct guesses to a counter.
 * Finally, a case/switch statement is used to determine how many points the user has earned before displaying all the info
 * to the user.
 * 
 * 		As an added bonus, I incorporated a do/while loop and a try/catch statement to validate user input. A do/while loop
 * allows the user to enter incorrect guesses without triggering the for loop to increase the iteration number. For instance,
 * if a user enters 10, the do/while loop reiterates and allows the user an opportunity to enter a number in the correct format.
 * Try/catch is used to validate that the user input is within the limitations of integers. If the user enters a decimal or a 
 * string value, the program would break without exceptions being thrown. For example, if a user enters "four" instead of 4
 * the program will throw an exception and set the value to 11 which will trigger the do/while loop to reiterate.*/

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {

		String rawInput;
		String points = null;
		int correctGuesses = 0;
		int userInput = 0;
		boolean test = true;

		// initialize 3 arrays with a length of 4.
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		int[] array3 = new int[4];

		// instantiate new Random and Scanner objects.
		Random random = new Random();

		// display game introduction in message box
		JOptionPane.showMessageDialog(null, "Let's play the Lottery Game! \n\n\n" +
				"You will be prompted to enter 4 number guesses. Your answers will be compared to the \n" +
				"computer's guesses and you will be awarded points based on correct guesses! \n\n" +
				"0 = 0 Points, 1 = 5 Points, 2 = 100 Points, 3 = 2,000 Points, and all 4 = 1,000,000 Points \n\n" +
				"If you would like to quit at any time, press cancel.");
		
		// prompt user to enter 4 guesses.
		for (int x = 0; x < 4; x++) {
				
			// resets guess attempt if user enters a letter or a number that is too low/high
			do {
					
				rawInput = JOptionPane.showInputDialog(null, "Enter guess between 0 and 9: ");
				
				// try/catch that will throw exception e if user enters a letter instead of a number.
				try {
					
					userInput = Integer.parseInt(rawInput);
					
				}
				
				// outputs a console display to the user that they entered a string value
				catch (Exception E){
					
					// exit program if user presses cancel
					if (rawInput == null){
						
						System.exit(0);
						
					}
					
					else {
						
						/* future coding for logging features
						System.out.println("User entered a string value instead of a number."); */
						
						// sets input number to a value out of bounds to trigger else statement for valid number input
						userInput = 11;
					
					}
					
				}
	
				// if/else statement to determine if the user entered a number between 9 and 0
				if (userInput <= 9 && userInput >= 0) {
	
					array1[x] = userInput;
					
					test = true;
				}
	
				else {
	
					JOptionPane.showMessageDialog(null, "Enter a valid number please.");
	
					rawInput = "";
					
					test = false;
		
				}
					
			}while(!(test));

		}

		// obtain computer guesses
		for (int x = 0; x < 4; x++) {

			array2[x] = random.nextInt(10);

		}

		// compares user guesses and computer guesses
		for (int x = 0; x < array1.length; x++) {

			for (int y = 0; y < array2.length; y++) {

				// parses out matching guesses and adds them to array3
				if (array1[y] == array2[y]) {

					array3[y] = array2[y];

					// adds matching guesses to counter for point tracking
					if (array3[x] != 0) {

						correctGuesses += 1;

					}

				}

			}

		}

		// switch/case statements to assign points for total number of correct guesses
		switch (correctGuesses) {
		case 0:
			points = "No Points, try again!";
			break;
		case 1:
			points = "5 Points, nice!";
			break;
		case 2:
			points = "100 Points, great!";
			break;
		case 3:
			points = "2,000 Points, so close!";
			break;
		case 4:
			points = "1,000,000 Points, you're the best!";
			break;
		}

		// parses out array values and assigns them to a string for user display
		String str = Arrays.toString(array1);
		String str2 = Arrays.toString(array2);

		// displays user guesses
		JOptionPane.showMessageDialog(null, "Your lotter picks: " + str + "\n" + "Winning numbers: " + str2 + "\n"
				+ "Correct guesses: " + correctGuesses + "\n" + points);

	}

}