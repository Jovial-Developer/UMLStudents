package DavisJames_08UML;

import java.util.Scanner;

/*James Davis
* CIS 2212-501 Java
* Assignment 08-UML Class Diagram
Project: DavisJames_08UML
Purpose: Learn how to use classes and objects.
*/

class StudentsDriver
{
	public static void main(String[] args)
	{
				
		String firstName;
		String lastName;
		int studentID;
		int birthYear;
		
		Scanner scan = new Scanner(System.in);
		
	//Here the user makes a few inputs.
		System.out.print("Enter First Name: " );
		firstName = scan.nextLine();
		
		System.out.print("Enter Last Name: " );
		lastName = scan.nextLine();
		
		
		System.out.print("Enter Student ID: ");
		studentID = scan.nextInt();
		
	//This is input validation for the student ID.  Only a valid value will allow the user to escape the loop.
		while ((studentID < 54000) || (studentID > 54999 ))
		{
			System.out.print("Range is between 54000 and 54999. Please try again: ");
			studentID = scan.nextInt();
		}
		
		
		System.out.print("Enter 4-Digit year of birth: ");
		birthYear = scan.nextInt();
		
	//This is input Validation for the birthYear no one in the program can be over 100 years old.
		while ((birthYear < 1916) && (birthYear > 2003 ))
		{
			System.out.print("Range is between 1916 to 2003. Please try again: ");
			birthYear = scan.nextInt();
		}
		
		
	//The students class is created and the entered values are passed into the Students class methods.
		Students studentZero = new Students();
				studentZero.setFirstName(firstName);
				studentZero.setLastName(lastName);
				studentZero.setStudentID(studentID);
				studentZero.setBirthYear(birthYear);
				
	//These are provided values that the user does not enter.
		Students studentOne = new Students("Lisa", "Larraby", 54321, 1995);
		Students studentTwo = new Students("Karen", "Kramer", 54123, 1983);
		
	//Here the criteria is displayed neatly after being passed through the Students class.  The to String method is used from the Students class.
		System.out.println("\n");
		System.out.println(studentZero.toString());
		System.out.print("\n");
		System.out.println(studentOne.toString ());
		System.out.println("\n");
		System.out.println(studentTwo.toString());
		
	}
}
//End of text.