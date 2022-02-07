/*
deliver_Card (1 card)
Cards; can hold 5 uses ArrayList
Name
Scores
Player(); name
//Methods:
playCards();
showCards();
getCards();

Player 1; Me
Player 2; Computer
*/
import java.util.ArrayList;

public class Player{
	//
	private String name;
	private int scores;
	private ArrayList<String> cards = new ArrayList<String>();

	// constructors
	public Player(String s){
		scores=0;
		name=s;
	}

	//  methods
	public void getCard(String s){
		cards.add(s);
	}

	public String playCard(){
		String temp;
		temp = cards.remove(0);

		return temp;
	}

	public String playCard(int idx){
		String temp;
		//temp = cards.get(idx);
		temp = cards.remove(idx);
		return temp;
	}

	public void showCards(){
		System.out.print(name+": \t");
		for (int i=0; i<cards.size(); i++){
			System.out.print(cards.get(i)+":["+(i+1)+"],");
		}
		System.out.println();
	}
	
	public String getName(){
		return name;
	}

	public int getScores(){
		return scores;
	}

	public void increaseScores(int num){
		scores=scores + num;
	}
}