/* 
MathQuiz.java
By: Russ Gleber
12/15/2021

This is a java code for a 5 question math quiz
*/

// Import Scanner
import java.util.Scanner;
	// Main Class
    class MathQuiz {
        public static void main(String[] args) {
		  //Welcome Message
        	System.out.println("This quiz is comprised of five basic math questions. Good luck!");
		  //First Question
        	System.out.print("What is 12 x 2? ");
        	Scanner a = new Scanner(System.in);
        	String ans1 = a.next();
			//Right/Wrong
        		if (ans1.equals("24")) {
            	System.out.println("Correct!");
        		} 		  
				else {
            	System.out.println("Wrong!");
        		}
		  //Second Question		
        	System.out.print("What is 4 x 3? ");
        	Scanner b = new Scanner(System.in);
        	String ans2 = b.next();
			//Right/Wrong
        		if (ans2.equals("64")) {
            	System.out.println("Correct!");
        		} 		  
				else {
            	System.out.println("Wrong!");
				}
		  //Third Question
        	System.out.print("What is 56 / 4? ");
        	Scanner c = new Scanner(System.in);
        	String ans3 = c.next();
			//Right/Wrong
        		if (ans3.equals("14")) {
            	System.out.println("Correct!");
        		} 
				else {
            	System.out.println("Wrong!");
        		}
		  //Fourth Question
        	System.out.print("What is 12 + 354? ");
        	Scanner d = new Scanner(System.in);
        	String ans4 = d.next();
			//Right/Wrong
        		if (ans4.equals("366")) {
            	System.out.println("Correct!");
        		} 
				else {
            	System.out.println("Wrong!");
        		}
		  //Fifth Question
        	System.out.print("What is 24 - 234? ");
        	Scanner e = new Scanner(System.in);
        	String ans5 = e.next();
			//Right/Wrong
        		if (ans5.equals("-210")) {
            	System.out.println("Correct!");
        		} 
				else {
            	System.out.println("Wrong!");
        		}

        	System.out.println("That is the end of the quiz - Thank you for playing!");
        }
     }