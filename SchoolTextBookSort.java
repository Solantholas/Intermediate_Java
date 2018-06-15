/*	Corey Hicks
 * 	8 April 2018
 * 	CIS 402A
 * 
 * 	Write an application with an array that holds 5 instances of the SchoolTextBook class, filled without prompting the user for 
 * 	input. Next prompt the used to enter a field for sorting, sort the array of objects based on the user input, and then 
 * 	display the newly sorted array of objects. Save this class in a file titled SchoolTextBookSort.java	
 * 
 * 		This program works with objects filled with arrays and the arrays.sort method in conjunction with the comparator method.
 * 	In the SchoolTextBook.java file there are 5 comparator methods that are used to sort the array columns by ascending order.
 * 	First, the comparator method is defined and constructor values are passed to the constructor method before compare method
 * 	is called. Second, the comparator method is called in conjunction with the arrays.sort method to sort the appropriate 
 * 	column based on the switch/case statement. This allows the user to determine how they would like to sort the array.	*/

import java.text.NumberFormat;
import java.util.Arrays;
import javax.swing.*;

public class SchoolTextBookSort {

	public static void main(String[] args) {

		String rawInput;

		// instantiate NumberFormat and SchoolTextBook objects
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		SchoolTextBook[] myTextBook = new SchoolTextBook[5];

		// fill array with 5 SchoolTextBook objects
		myTextBook[0] = new SchoolTextBook("Ken Kesey", "One Flew Over the Cuckoo's Nest", 320, "978-0451163967", 8.90);
		myTextBook[1] = new SchoolTextBook("Anthony Burgess", "A Clockwork Orange", 213, "978-0393312836", 9.27);
		myTextBook[2] = new SchoolTextBook("Chuck Palahniuk", "Fight Club", 224, "978-0393327342", 6.07);
		myTextBook[3] = new SchoolTextBook("Bret Easton Ellis", "American Psycho", 399, "978-0679735779", 9.51);
		myTextBook[4] = new SchoolTextBook("Stephen King", "The Stand", 1200, "978-0307947307", 11.62);

		// prompt user to enter value
		rawInput = JOptionPane.showInputDialog(null, "Please enter a sorting value\n\n" + "1 = Author\n" + "2 = Title\n"
				+ "3 = Page Count\n" + "4 = ISBN\n" + "5 = Price");
		int test = Integer.parseInt(rawInput) - 1; // adjust rawInput value to align with switch/case statement values

		// determines which sort to invoke based on user input
		switch (test) {
		case 0:
			Arrays.sort(myTextBook, SchoolTextBook.BookAuthorComparator);
			break;
		case 1:
			Arrays.sort(myTextBook, SchoolTextBook.BookTitleComparator);
			break;
		case 2:
			Arrays.sort(myTextBook, SchoolTextBook.BookPageCountComparator);
			break;
		case 3:
			Arrays.sort(myTextBook, SchoolTextBook.BookISBNComparator);
			break;
		case 4:
			Arrays.sort(myTextBook, SchoolTextBook.BookPriceComparator);
			break;
		}

		// display sorted object array by user input
		JOptionPane.showMessageDialog(null, myTextBook[0].getAuthor() + ", " + myTextBook[0].getTitle() + ", "
				+ myTextBook[0].getPageCount() + ", " + myTextBook[0].getISBN() + ", "
				+ currency.format(myTextBook[0].getPrice()) + "\n" + myTextBook[1].getAuthor() + ", "
				+ myTextBook[1].getTitle() + ", " + myTextBook[1].getPageCount() + ", " + myTextBook[1].getISBN() + ", "
				+ currency.format(myTextBook[1].getPrice()) + "\n" + myTextBook[2].getAuthor() + ", "
				+ myTextBook[2].getTitle() + ", " + myTextBook[2].getPageCount() + ", " + myTextBook[2].getISBN() + ", "
				+ currency.format(myTextBook[2].getPrice()) + "\n" + myTextBook[3].getAuthor() + ", "
				+ myTextBook[3].getTitle() + ", " + myTextBook[3].getPageCount() + ", " + myTextBook[3].getISBN() + ", "
				+ currency.format(myTextBook[3].getPrice()) + "\n" + myTextBook[4].getAuthor() + ", "
				+ myTextBook[4].getTitle() + ", " + myTextBook[4].getPageCount() + ", " + myTextBook[4].getISBN() + ", "
				+ currency.format(myTextBook[4].getPrice()) + "\n");

	}

}
