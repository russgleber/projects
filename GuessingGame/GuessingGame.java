/*
GuessingGame.java
By: Russ Gleber
This app is designed to be a game where the user has 5 chances to guess a number between 1-100. Good luck!
*/


import java.util.Scanner;
 
public class GuessingGame {
    //main method
    public static void main(String []args){
    
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Set the number to guess
        int a=(int)(101*Math.random());
    
        // Give a set amount of attempts
        int attempts=5;
 
        int i, guess;
 
        System.out.println("A number is chosen between 1 and 100. You have 5 guesses. Good luck!");
 
        // Guess 1 - 5 function
        for (i=0; i<attempts; i++) {
 
            System.out.println(
                "What's the number?");
 
            // Take input for guessing
            guess=sc.nextInt();
 
            // If the number is guessed
            if (guess==a) {
                System.out.println(
                    "You guessed it - good job!");
                break;
            }
		 // If the guess is too small
            else if (guess<a && i!=a-1) {
                System.out.println(
                    "The number is greater than "+guess);
            }
		 // If the guess is too large
            else if (guess>a && i!=a-1) {
                System.out.println(
                    "The number is less than "+guess);
            }
        }
 	  // Parameter to stop the guesses
        if (i==attempts) {
            System.out.println(
                "You used all 5 guesses.");
 
            System.out.println(
                "The number was "+a);
        }
    }

}