/*
//Cards uses ArrayList.size()
//
//52 playing cards, 4 suits: Hearts, Diamonds, Spades, Clubs/ 
//c,d,h,s order
C2...C14, D2...D15, H2...H14, S2...S14
//13 cards per suit
//Rank: 2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K),14(A)
//my_deck can:
//Constructors: Deck(), Deck(int n), 
//Methods - shuffle(), dealCard()
*/
import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	// properties
	ArrayList <String> cards = new ArrayList<String>();


	// constructors
	public Deck(){
		for (int i=2; i < 15; i++){
			cards.add("C"+i);
			cards.add("D"+i);
			cards.add("H"+i);
			cards.add("S"+i);
		}
	}
	public Deck(int n){
		// can generate multiple decks of cards
	}


	// methods
	public void shuffleCards(){
		Collections.shuffle(cards);
	}

	public String dealCard(){
		String temp="";
		temp = cards.remove(cards.size()-1);


		return temp;
	}

	public void showCards(){
		for (int i=0; i<cards.size(); i++){
			System.out.print(cards.get(i)+" ");
		}
		System.out.println();
	}

}