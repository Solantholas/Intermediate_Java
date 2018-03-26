/* Corey Hicks
 * 25 March 2018
 * CIS 402A
 * 
 * Create a class named Purchase.  Each Purchase contains an invoice number, amount of sale, and amount of sales tax.  Include set methods 
 * for the invoice number and sale amount.  Within the set() method for the sale amount, calculate the sales tax as 7.5% (using a static 
 * field in the Purchase class) of the sale amount.  Also include a display method that displays a purchase's details in a well formatted 
 * output display.  Save the file as Purchase.java.		
 * 
 * 		This program focuses on using private static and non-static fields with static and non-static methods. First, get and set methods
 * are used to access the private invoice and sale amount fields. Since sales tax is a static field, it is able to be called directly 
 * into the setSaleAmount method without the use of a set method. A dynamic display method is used to instantiate a Purchase object and
 * pass in values for invoice and sale amount. These two values are obtained in the MAIN method via user input before calling the display
 * method and passing the values.*/

import javax.swing.*;
import java.text.NumberFormat;	// import NumberFormat for currency

public class Purchase {

	private int invoiceNumber;
	private double saleAmount;
	private static double salesTax; // static field for sales tax
	
	// defines Purchase constructor that takes 2 variables
	public Purchase(int invoiceNumber, double saleAmount) {
		setInvoiceNumber(invoiceNumber);
		setSaleAmount(saleAmount);
	}
	
	// set methods for invoice
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	// set method for sales amount and calculates sales tax
	public void setSaleAmount(double saleAmount) {
		
		this.saleAmount = saleAmount;
		
		salesTax = saleAmount * .075;
	}
	
	// get methods for all 3 fields
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	
	public double getSaleAmount () {
		return saleAmount;
	}
	
	public double getSalesTax() {
		return salesTax;
	}
	
	// display method that creates a purchase object and displays the values
	public static void display(int invoiceNumber, double saleAmount) {
		
		// initializes numberformat and purchase objects
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		Purchase purchase1 = new Purchase(invoiceNumber, saleAmount);
		
		//calculates total cost of purchase
		double totalCost = purchase1.getSaleAmount() + purchase1.getSalesTax();
		
		// receipt output to the user
		JOptionPane.showMessageDialog(null, "Invoice number: " + purchase1.getInvoiceNumber() + "\n" + 
											"Subtotal:       " + currency.format (purchase1.getSaleAmount()) + "\n" + 
											"Tax:            " + currency.format (purchase1.getSalesTax()) + " at 7.5%. \n" +
											"Total:          " + currency.format(totalCost));
		
	}
	// Begin MAIN Method
	public static void main(String[] args) {
		
		int invoiceNumber;
		double saleAmount;
		String rawInput;
		
		// obtains user input
		rawInput = JOptionPane.showInputDialog(null, "Please enter your invoice number");
		invoiceNumber = Integer.parseInt(rawInput);

		// obtains user input
		rawInput = JOptionPane.showInputDialog(null, "Please enter your sale amount");
		saleAmount = Double.parseDouble(rawInput);
		
		// calls the display method and passes invoice and sale amount variables
		Purchase.display(invoiceNumber, saleAmount);

	}

}
