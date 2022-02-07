/*
Student.java
By: Russ Gleber
This is a child class of HumanTest.java
*/

public class Student extends Human{
	// properties, members, variables
		String major;
	// constructors
	public Student(){
		super();
		major="no-major";
	}
	public Student(String str_name, String str_major, int age1){
		super(str_name,age1);
		major=str_major;
	}

	//methods
	public void greeting(){
		super.greeting();
		System.out.println("My major is "+ major);
	}

}