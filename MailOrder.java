/* Corey Hicks
 * 6 May 2018
 * CIS 402A
 * 
 * Write an application for a mail order company. The program uses a data entry screen in which the user types an item 
 * number and a quantity. Write each record to a file. Save your file as MailOrder.java.	
 * 
 * This program focuses on using try/catch statements to handle error exceptions during run time. I was unable to successfully
 * run this program with logging to a new filepath. I opted to remove the logging and use pop-up logging for now. I will revisit
 * this program and edit the functionality to handle logging.	*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MailOrder {
	
	private int itemNumberValue;
	private int itemQuantityValue;
	private JButton myButton = new JButton("Submit");
	private JLabel itemNumberLabel = new JLabel("Item Number");
	private JLabel itemQuantityLabel = new JLabel("Item Quantity");
	private JTextField myItemNumber = new JTextField(15);
	private JTextField myItemQuantity = new JTextField(15);
	private JFrame myFrame;
	
	private ActionListener myActionListener = new ActionListener() {
			
		@Override // override method for alert button action
		public void actionPerformed(ActionEvent e) {
				
				String itemNumberText = myItemNumber.getText();
				String itemQuantityText = myItemQuantity.getText();
				
				try { 
					// attempt to parse entered values as integers
					itemNumberValue = Integer.parseInt(itemNumberText);	
					itemQuantityValue = Integer.parseInt(itemQuantityText);
					
				}
				
				catch (Exception E) { // catches all exceptions thrown by the system
					
					JOptionPane.showMessageDialog(null, "Message: " + E); // displays error message caught
					itemNumberValue = 0;
					itemQuantityValue = 0;
					
				}
				
			if (itemNumberValue > 0 && itemQuantityValue > 0) { // only displays item number and quantity if both values are correct
				
				JOptionPane.showMessageDialog(null, "Item Number is: " + itemNumberValue + "\n" +
						"Item Quantity is: " + itemQuantityValue, "Totals", 1);
				
			}
			
			else if (itemNumberValue == 0 && itemQuantityValue == 0) {
				
				JOptionPane.showMessageDialog(null, "Item number and quantity may not be zero or blank.");
				
			}
			
			else if (itemNumberValue == 0) {
				
				JOptionPane.showMessageDialog(null, "Item number may not be zero or blank.");
				
			}
			
			else if (itemQuantityValue == 0) {
				
				JOptionPane.showMessageDialog(null, "Item quantity may not be zero or blank.");
				
			}
			
		}
		
	};

	public MailOrder() {

		myFrame = new JFrame("Mail Order");
		myFrame.setSize(250, 250);
		myFrame.getContentPane().setLayout(new FlowLayout());
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().add(itemNumberLabel);
		myFrame.getContentPane().add(myItemNumber);
		myFrame.getContentPane().add(itemQuantityLabel);
		myFrame.getContentPane().add(myItemQuantity);
		myFrame.getContentPane().add(myButton);
		myFrame.setVisible(true);

	}
	
	private void launchJFrame() {
		
		// adds action listeners to buttons and text fields
		myButton.addActionListener(myActionListener);
		myItemNumber.addActionListener(myActionListener);
		myItemQuantity.addActionListener(myActionListener);
		
	}
	
	public static void main(String[] args) {
		
		MailOrder myMailOrder = new MailOrder();
		myMailOrder.launchJFrame();
		
	}

}
