/*
HumanTest.java
By: Russ Gleber 
*/

public class HumanTest{

	//main method
	public static void main(String[] args){
		System.out.println("Hello, Welcome to Niagara");
		//demonstrate constructor 2
		Human person1 = new Human(); //no name, 0
		//demonstrate constructor 2
		Human person2 = new Human(20); // no name, 20
		//demonstrate constructor 3
		Human person3 = new Human("John"); //John, 0
		//demonstrate constructor 4
		Human person4 = new Human("Mary",18); //Mary, 18
		//demonstrate constructor 5
		Human person5 = new Human(19,"Sam"); //Sam, 19

		person1.greeting();
		person2.greeting();
		person3.greeting();
		person4.greeting();
		person5.greeting();

		Student s1 = new Student();
		Student s2 = new Student("Smith", "Computer Science", 21);

		s1.greeting();
		s2.greeting();
	}
}