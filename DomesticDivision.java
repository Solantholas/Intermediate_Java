/* Corey Hicks
 * 21 April 2018
 * CIS 402A 
 * 
 * 		See International Division header for detailed description of the class.	*/

// creates new subclass of Division
class DomesticDivision extends Division {

    private String state;

	// creates class constructor that accepts String, int, String values
    public DomesticDivision (String name, int accountNumber, String state) {

        super (name, accountNumber);	// super() keyword pulls name and accountNumber values from the parent class (Division) constructor
        this.state = state;
        
    }
    
    // get method for state field
    public String getState() {

        return state;
    
    }

    // defines abstract Display method to display the name, account number, and state of the domestic division
    void Display() {

        System.out.println(getName() + "\t" + getAccountNumber() + "\t" + state);
        
  }
    
}