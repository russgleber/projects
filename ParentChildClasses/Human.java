/* 
Human.java
The Human Class
By: Russ Gleber
*/

public class Human{
	//properties, variables, or members (can be called any of these)
	String name;
	int age;

	//constructors
	public Human(){
		name = "no name";
		age = 0;
	}
	public Human(String s){
		name = s;
		age = 0;
	}
	public Human(int n){
		name = "no name";
		age = n;
	}
	public Human(String s, int n){
		name = s;
		age = n;
	}
	public Human(int n, String s){
		name = s;
		age = n;
	}
	// can include these other 2 constructors in case you think someone will make a mistake and add 2 strings for name instead of 1
	public Human(String s1, String s2, int n1){
		name = s1;
		age = n1;
	}
	public Human(String s1, String s2){
		name = s1;
		age = 0;
	}
	// methods (getter and setter)

	// getter (get name) has a return value, but no parameters inside the parentheses (using this to pull name and age)
	public String getName(){
		String temp;
		temp = name;
		return temp;
	}
	public int getAge(){
		int temp;
		temp = age;
		return temp;
	}
	// setter, has no r4eturn value, but does have parameters to set (use this to set values for the name and age)
	public void setName(String s){
		name = s;
	}
	public void setAge(int num){
		age = num;
	}

	// others
	public void greeting(){
		//print an introduction
		System.out.println("Hello, my name is "+ name + " and my age is "+ age);
	}
}