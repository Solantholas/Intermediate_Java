/* Corey Hicks
 * 15 April 2018
 * CIS 402A
 * 
 * Create a class named Student that includes String data fields titled firstName and lastName, and an integer field titled studentID. 
 * Create a constructor that requires two String parameters and one integer parameter to populate the firstName, lastName, and 
 * studentID fields. Create a LinkedList of 20 Student objects each having different first names, last names, and student IDs. Print 
 * your LinkedList, first in the order your items were placed onto the LinkedList and then in reverse order. Save your files as 
 * Student.java and ClassRoster.java.	
 * 
 * 		This week I implemented a LinkList data set and filled it with constructor objects. First, a constructor is made with the
 * Student class that accepts 2 strings and an integer. Also, the Student class houses the override method for formatting and 
 * displaying the linked list records. Second, new LinkedList is created with a reference to the Student class. Third, 20 Student
 * objects are created and added as data sets to the studentList LinkedList. Fourth, the LinkedList is printed with a for loop
 * and invoking the override method for formatting. Finally, the LinkedList is reversed with the Collections.reverse method call
 * and the LinkedList is printed a second time.	*/

import java.util.Collections;
import java.util.LinkedList;

public class ClassRoster {

	public static void main(String[] args) {
		
		// create new LinkedList object to be filled with student objects
		LinkedList<Student> studentList = new LinkedList<Student>();
		
		// fills LinkedList with 20 student objects
		studentList.add(new Student("Ross", "Wallman", 1));
		studentList.add(new Student("Kassie", "Hicks", 2));
		studentList.add(new Student("Keysha", "Wolf", 3));
		studentList.add(new Student("Zach", "Harder", 4));
		studentList.add(new Student("Chelsea", "Gaylord", 5));
		studentList.add(new Student("Aaron", "Henderson", 6));
		studentList.add(new Student("Kamden", "Mabon", 7));
		studentList.add(new Student("Jeremy", "Hochstein", 8));
		studentList.add(new Student("Stanley", "Pewter", 9));
		studentList.add(new Student("Inga", "Johnson", 10));
		studentList.add(new Student("Hilda", "Elephant", 11));
		studentList.add(new Student("Mike", "Jones", 12));
		studentList.add(new Student("Jen", "McDonald", 13));
		studentList.add(new Student("Dustin", "Rivers", 14));
		studentList.add(new Student("Riley", "Blues", 15));
		studentList.add(new Student("Jack", "Ling", 16));
		studentList.add(new Student("Robert", "Planter", 17));
		studentList.add(new Student("Roman", "Raynes", 18));
		studentList.add(new Student("Regina", "George", 19));
		studentList.add(new Student("Stormy", "Daniels", 20));
		
		// print all 20 LinkedList elements
		for(int i = 0; i < studentList.size(); ++i){

	      System.out.println(studentList.get(i)); // Invoke toString() override method
		      
	    }
		
		System.out.println("\n");
		
		// reverse LinkedList by order of assignment
		Collections.reverse(studentList);
		
		// print all 20 LinkedList elements in reverse order
		for(int i = 0; i < studentList.size(); ++i){

	      System.out.println(studentList.get(i)); // Invoke toString() override method
		      
	    }
		
	}

}
