/* Corey Hicks
 * 29 April 2018
 * CIS 402A
 * 
 * 	Modify the following 'MessageBoxes' application so it uses a single action listener for each button. This will require you to 
 * separate the single action listener logic into multiple listeners, one for each button. Then modify the code to provide 
 * additional options to two or more buttons.
 * 
 * 	First, I removed the array that held each JButton object before implementing each JButton separately. Second, I removed the 
 * single logic statement that determined the correct event and built them separately. Third, I removed the for loops that built
 * the content panes and actionlisteners for each button to assign them separately. Finally, I added additional features to the
 * color button actionlistener and the values button actionlistener. As a bonus, I changed the text of the input button to prompt
 * the user to enter whatever they want in the text box.	*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes {

	// removed JButton from array and initialized each button separately
	private JButton alert = new JButton ("Alert");
	private JButton yesNo = new JButton ("Yes/No");
	private JButton color = new JButton ("Color");
	private JButton input = new JButton ("Input");
	private JButton values = new JButton ("6 Vals"); // changed button text to reflect additional options

	private JTextField txt = new JTextField(15);

	private JFrame frame;

	// creates new action listener event
	private ActionListener alertListener = new ActionListener() {

		@Override // override method for alert button action
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "There's a bug on you!", "Hey!", JOptionPane.ERROR_MESSAGE);
			
		}
		
	};
	
	// creates new action listener event
	private ActionListener yesNoListener = new ActionListener() {

		@Override // override method for Yes/No button action
		public void actionPerformed(ActionEvent e) {
			int val = JOptionPane.showConfirmDialog(null, "or no", "Chose yes", JOptionPane.YES_NO_OPTION);

			if (val != JOptionPane.CLOSED_OPTION) {

				if (val == 0) {

					txt.setText("Yes");
					
				} else {

					txt.setText("No");
				}
				
			}
			
		}
		
	};
	
	// creates new action listener event
	private ActionListener colorListener = new ActionListener() {

		@Override // override method for color button action
		public void actionPerformed(ActionEvent e) {
			Object[] options = { "Red", "Blue", "Yellow", "Purple", "Green", "Orange" }; // added 4 additional colors to button options

			int sel = JOptionPane.showOptionDialog(null, "Choose a Color!", "Warning", JOptionPane.DEFAULT_OPTION,
					JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			
			if (sel != JOptionPane.CLOSED_OPTION) {
				txt.setText("Color Selected: " + options[sel]);
				
			}
			
		}
		
	};
	
	// creates new action listener event
	private ActionListener inputListener = new ActionListener() {

		@Override // override method for input button action
		public void actionPerformed(ActionEvent e) {
			String val = JOptionPane.showInputDialog("Type in whatever you want!"); // changed user prompt text
			txt.setText(val);
			
		}
		
	};
	
	// creates new action listener event
	private ActionListener valuesListener = new ActionListener() {

		@Override // override method for values button action
		public void actionPerformed(ActionEvent e) {
			Object[] selections = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth" }; // added 3 additional number options
			Object val = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
					null, selections, selections[0]);

			if (val != null) {
				txt.setText(val.toString());
			}
			
		}
		
	};

	public MessageBoxes() {
		
		frame = new JFrame("Title");
		frame.setSize(250, 250);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// removed for loop and added each button to the frame individually
		frame.getContentPane().add(alert);
		frame.getContentPane().add(yesNo);
		frame.getContentPane().add(color);
		frame.getContentPane().add(input);
		frame.getContentPane().add(values);
		frame.getContentPane().add(txt);
		frame.setVisible(true);

	}

	public void launchJFrame() {

		// assigns appropriate actionlistener event to the appropriate JButton
		alert.addActionListener(alertListener);
		yesNo.addActionListener(yesNoListener);
		color.addActionListener(colorListener);
		input.addActionListener(inputListener);
		values.addActionListener(valuesListener);
		
	}

	public static void main(String[] args) {

		MessageBoxes messageBoxes = new MessageBoxes();
		messageBoxes.launchJFrame();
		
	}
	
}