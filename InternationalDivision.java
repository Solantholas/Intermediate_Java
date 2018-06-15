/* Corey Hicks
 * 21 April 2018
 * CIS 402A 
 * 
 * 		This file creates an Subclass with private fields, a constructor, and defines the abstract display method. First, the class is declared as a
 * Subclass (note this is accomplished by the extends keyword). Second, private fields and a constructor are defined within the class (note, the 
 * super() keyword allows the class to utilize the values in the Superclass constructor). Third, get methods are created for the private fields. 
 * Finally, the abstract method is defined to print the values assigned to the constructor.	*/

// creates new subclass of Division
class InternationalDivision extends Division {
    
    private String country;
    private String language;
    
	// creates class constructor that accepts String, int, String, String values
    public InternationalDivision (String name, int accountNumber, String country, String language) {

        super (name, accountNumber);	// super() keyword pulls name and accountNumber values from the Superclass (Division) constructor
        this.country = country;
        this.language = language;
        
    }
    
    // get method for country field
    public String getCountry() {

        return country;
    
    }
    
    // get method for language field
    public String getLanguage() {

        return language;
    
    }

    // defines abstract Display method to display the name, account number, and country, language of the international division
    void Display() {

        System.out.println(getName() + "\t" + getAccountNumber() + "\t" + country + "\t" + language);
        
  }
  
}