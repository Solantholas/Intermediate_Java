/* Corey Hicks
 * 21 April 2018
 * CIS 402A 
 * 
 * 		Create an abstract Division class with fields for a company's division name and account number, and an abstract display() 
 * method that will be defined in the subclasses.  Use a constructor in the superclass that requires values for both fields.  
 * Create two subclasses named InternationalDivision and DomesticDivision.  The InternationalDivision class includes a field 
 * for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields 
 * when created.  The DomesticDivision class include a field for the state in which the division is located and a constructor that 
 * requires all fields when created.  Write an application named UseDivision that creates two instances of each of these 
 * concrete classes (4 total instances).  Save the files as: UseDivision.java  
 * 
 * 		This file declares a new object array filled with Division Superclass objects and a length of 4. Second, each leg of the 
 * array is declared as a new International or Domestic Division constructor and the appropriate values are declared. Third, a 
 * for loop iterates 4 times (the length of the array). Each iteration calls the Display method for the appropriate Subclass 
 * override. Note, the Class and Method are overridden / extended by the Subclass and method contained in the Subclass.	*/

public class UseDivision{

  public static void main(String [] args){
    
	// declares new object array filled with Division objects
    Division divisions[] = new Division[4];
    
    // fills the object array with new Subclass constructors
    divisions[0] = new InternationalDivision("Europe", 1, "Germany", "German");
    divisions[1] = new InternationalDivision("Asia", 2, "China", "Chinese");
    divisions[2] = new DomesticDivision("Central", 3, "Nebraska");
    divisions[3] = new DomesticDivision("West", 4, "California");
    
    // iterates the for loop to display Subclass Display override
    for(int i = 0; i < divisions.length; i++){

      divisions[i].Display();
      
    }
      
  }
  
}