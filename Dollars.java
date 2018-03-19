/* Corey Hicks
 * 11 March 2018
 * CIS 402A
 * 
 * 		Create a class that calculates and displays the conversion of an entered number of dollars into currency 
 * denominations - 100s, 50s, 20s, 10s, 5s, and 1s.  Obtain all inputs and display all outputs using dialog 
 * boxes.  Save the class as Dollars.Java. 
 * 
 * 		This program uses the javax.swing package to utilize pre-build methods that display windows panes. The 
 * first pane includes a dialog bar and an OK button to allow the user to enter an integer. The second and third
 * panes display user input and the result of the mathematical logic with a simple OK button for the user to click on.	*/

import javax.swing.*;

public class Dollars{

  public static void main(String [] args){
  
    int dollarsEntered = 0;
    String rawInput;

    //gets user input and assigns the integer to dollarsEntered
    rawInput = JOptionPane.showInputDialog(null, "Please enter a whole dollar amount: ");
    dollarsEntered = Integer.parseInt(rawInput); //assigns rawInput
    
    //logic to determine the number of each dollar type from ones to one hundreds.
    int hundreds = dollarsEntered / 100;
    int fifties = (dollarsEntered - 100 * hundreds) / 50;
    int twenties = (dollarsEntered - (50 * fifties + 100 * hundreds)) / 20;
    int tens = (dollarsEntered - (20 * twenties + 50 * fifties + 100 * hundreds)) / 10;
    int fives = (dollarsEntered - (10 * tens + 20 * twenties + 50 * fifties + 100 * hundreds)) / 5;
    int ones = (dollarsEntered - (5 * fives + 10 * tens + 20 * twenties + 50 * fifties + 100 * hundreds));

    //Displays user input in pop-up window
    JOptionPane.showMessageDialog(null, "You put $" + dollarsEntered);
    
    //Displays computation of dollar types in pop-up window
    JOptionPane.showMessageDialog(null, "That is: " + hundreds + " hundreds, " + fifties + " fifties, " + twenties + " twenties, " + tens + " tens, " + fives + " fives, and " + ones + " ones.");

    System.exit(0);
  }
}