/* Corey Hicks
 * 21 April 2018
 * CIS 402A 
 * 
 * 		This file creates an abstract Superclass with private fields, a constructor, and an abstract display method. First, an abstract
 * Class is created (note, this means that the class cannot be instantiated later but it can contain an abstract method). Second, 
 * private fields and a constructor are defined within the class. Third, get methods are created for the private fields. Finally, an
 * abstract method is declared without definition to be utilized by the subclasses.	*/

// Creates new abstract super class
abstract class Division {
    
    private String name;
    private int accountNumber;
    
    // creates class constructor that accepts String, int values
    public Division (String name, int accountNumber) {

        this.name = name;
        this.accountNumber = accountNumber;
    
    }
    
    // get method for name field
    public String getName() {

        return name;
    
    }
    
    // get method for accountNumber field
    public int getAccountNumber() {
        
        return accountNumber;
        
    }
    
    // creates new abstract Display method for definition in subclasses
    abstract void Display();
    
}