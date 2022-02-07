/* 
TempConvert.java
Designed by: Russ Gleber
This app is designed to convert temperatures between F to C with user input
*/

// import scanner
import java.util.Scanner;
// main class
public class TempConvert {
	// main method
	public static void main(String arg[]){
	    double f,c;
			// receive user input
        	Scanner sc=new Scanner(System.in);
	    		System.out.println("Temperature Degree Conversion: \n 1.Celsius to Fahrenheit  \n 2.Fahrenheit to Celsius \n Please enter 1 or 2");
                   int ch=sc.nextInt();

		switch(ch){
		// if user chooses option 1
	    case 1:  System.out.println("OK, convert Celsius to Fahrenheit. Please enter an integer:");
                   	  c=sc.nextDouble();
			  f=((9*c)/5)+32;
	    	  System.out.println("Result is "+f);

		  break;
		// if user chooses option 2
	    case 2:  System.out.println("OK, convert Fahrenheit to Celsius. Please enter an integer:");
                   	  f=sc.nextDouble();
	    	  c=(f-32)*5/9;
	    	  System.out.println("Result is "+c);

		  break;
		// if user inputs a different number
	   default:  System.out.println("Please enter 1 or 2");
	   }  
	} 
}