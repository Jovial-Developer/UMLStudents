/*James Davis
* CIS 2212-501 Java
* Assignment 08-UML Class Diagram
Project: DavisJames_08UML
Purpose: Learn how to use classes and objects.
*/
package DavisJames_08UML;

public class Students {

//Current year is a final it always has a set value. This set value is used for comparisons.
	private final int CURRENT_YEAR = 2016;
	
	private String firstName;
	private String lastName;
	private int studentID;
	private int birthYear;

	Students()
	{
		firstName = null;
		lastName = null;
		studentID = 0;
		birthYear = 0;
	}
	
	
	Students(String firstName, String lastName, int studentID, int birthYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.birthYear = birthYear;
	}
	
//The students are given ages by subtracting the CURRENT_YEAR variable and the birthYear variable.
	public int calcAge()
	{
		return CURRENT_YEAR - birthYear;
	}
	
	
//The next couple of methods are getter and setter methods from taking user input from the StudentsDriver class.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getBirthYear() {
		return birthYear;
	}

//BirthYear is determined to be valid or not.
	public void setBirthYear(int birthYear) {
		int age = CURRENT_YEAR - birthYear;
		if(age <= calcMaxAge() && age >= calcMinAge())
			this.birthYear = birthYear;
	}
	
	public int calcMaxAge() {
		return 100;
	}
	
	public int calcMinAge() {
		return 13;
	}

	@Override
	
//The toString Method neatly displays all the entered values.
	public String toString() {
		return firstName + " " + lastName + "\n   Student ID:  " + studentID + "\n   Age in " + CURRENT_YEAR + ": " + calcAge() + " years old";
	}

	
}
//End of text.