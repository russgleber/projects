/* 
MyGame.java
By: Russ Gleber
*/
import java.util.Scanner;

public class MyGame{
	//main
	public static void main(String[] args){
		Deck my_deck=new Deck();
		// my_deck.showCards();

		System.out.println("***** CARDS ARE SHUFFLED *****");

		my_deck.shuffleCards();
		my_deck.showCards();

		System.out.println("***** FIRST DEAL *****");
		int num_of_cards_to_deal=3;
		for (int i=1; i<num_of_cards_to_deal+1; i++){
		System.out.println(my_deck.dealCard());
		}

		System.out.println("***** REMAINING IN DECK *****");
		my_deck.showCards();

		System.out.println("***** CARDS ARE DEALT *****");
		Player player1 = new Player("John");
		Player player2 = new Player("Computer");

		// deal 5 cards for each player

		for (int i=0; i<5; i++){
			player1.getCard(my_deck.dealCard());
			player2.getCard(my_deck.dealCard());
		}

		player1.showCards();
		player2.showCards();
		
		System.out.println("***** REMAINING IN DECK *****");
		my_deck.showCards();

		// play games
		// FIRST ROUND 

		Scanner sc = new Scanner(System.in);
		int idx=0;
		String player1_temp_card = "";
		String player2_temp_card = "";
		int player1_card_value=0;
		int player2_card_value=0;

		for (int i=0; i<5; i++){
			player1.showCards();
			idx = sc.nextInt();
			System.out.println();

			player1_temp_card = player1.playCard();
			System.out.println(player1.getName()+": "+player1_temp_card);

			player2_temp_card = player2.playCard();
			System.out.println(player2.getName()+": "+player2_temp_card);

			System.out.println();

			// check who will win
			player1_card_value=Integer.parseInt(player1_temp_card.substring(1));
			player2_card_value=Integer.parseInt(player2_temp_card.substring(1));

			// if Player 1 wins
			if (player1_card_value > player2_card_value){
				System.out.println("Congratulations, "+player1.getName()+" wins round "+(i+1));
				player1.increaseScores(1);
			}

			// if Player 2 wins
			if (player1_card_value < player2_card_value){
				System.out.println(player2.getName()+" wins round "+(i+1)+" .. try again next round.");
				player2.increaseScores(1);
			}

			//if it's atie			
			if (player1_card_value == player2_card_value){
				System.out.println("Round "+ (i+1)+ " is a tie. Try again next round!");
			}
			System.out.println();
		}
		System.out.println("___________________");

		// final --- check the winner
		if (player1.getScores()>player2.getScores()){
			System.out.println("*"+player1.getName()+" is the winner!*");
		}

		if (player1.getScores()<player2.getScores()){
			System.out.println("*"+player2.getName()+" wins.*");
		}

	}

}
