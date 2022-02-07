/* Banking.java
By: Russ Gleber
12/16/2021

This app is designed to assist with a personal banking account for deposits, withdrawals, transaction history of both, and an overall balance check.
*/
import java.util.Scanner;

class Banking{
  public static void main(String[] args) {
	  //Assign BankAccount class
	  BankAccount obj1 = new BankAccount("FirstLastName", "FirstLast0001");
	  obj1.showMenu();
  }
}

class BankAccount{
	// Integers
	int balance=0;
	int previousTransaction=0;
	String customerName;
	String customerID;
	// Constructor
	BankAccount(String cName, String cID){
		customerName= cName;
		customerID= cID;
	}
	// Deposit Money
	void deposit(int amount){
		if(amount !=0);{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	// Withdraw Money
	void withdraw(int amount){
		if(amount !=0){
			balance = balance - amount;
			previousTransaction = -amount;
		}

	}
	// Show Last Transaction
	void getPreviousTransaction(){
		if(previousTransaction>0){
			System.out.println("Deposited $"+previousTransaction);
		}
		else if(previousTransaction<0){
			System.out.println("Withdrew $"+Math.abs(previousTransaction));
		}
		else{
			System.out.println("There is no transaction history");
		}
	}

	void showMenu(){
		char option='\0';
		Scanner scanner=new Scanner(System.in);

		System.out.println("Welcome "+customerName);
		System.out.println("Your Customer ID is "+customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Transaction History");
		System.out.println("E. Exit Menu");

		do{
			System.out.println("===================================");
			System.out.println("Please select an option.");
			System.out.println("===================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch(option){

				case 'A':
					System.out.println("-----------------------------------");
					System.out.println("Your balance is $"+balance);
					System.out.println("-----------------------------------");
					System.out.println("\n");
					break;

				case 'B':
					System.out.println("-----------------------------------");
					System.out.println("Enter deposit amount:");
					System.out.println("-----------------------------------");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;

				case 'C':
					System.out.println("-----------------------------------");
					System.out.println("Enter withdrawal amount:");
					System.out.println("-----------------------------------");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;

				case 'D':
					System.out.println("-----------------------------------");
					getPreviousTransaction();
					System.out.println("-----------------------------------");
					break;

				case 'E':
					System.out.println("***********************************");
					break;

				default:
					System.out.println("-----------------------------------");
					System.out.println("Invalid Option! Please try again");
					break;
			}
		
		
		
		}
		while(option != 'E');
		System.out.println("Thank you. Have a good day!");



	}



}