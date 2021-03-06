package mvrcus.BlackJack;

import mvrcus.BlackJack.Deck.Card;

public class DealerHand extends CardHand{
	boolean hidden;
	
	//Constructor 
	public DealerHand(Card c) {
		super(c);
		hidden = true;
	}
	
	public void showHand() {
		this.hidden = false;
	}
	public boolean isHidden() {return this.hidden;}
	
	
	public String toString() {
		if(!hidden) {return super.toString();}
		StringBuilder cards = new StringBuilder();
		Card c = list.get(0);
		cards.append(c.getType()).append(" ");
		cards.append(c.getNum());
		return cards.toString();
	} // end toString
	
	
	//Override for dealer
	public int getSum() {
		int res;
		if(hidden) {
			int tmp = list.get(0).getNum();
			if(tmp> 10 && tmp < 14) {
				res = 10;
			}else if(tmp == 14) {
				res = 11;
			}else {
				res =  tmp;
			}
		}else {
			res = super.getSum();
		}
		return res;
	}//end getSum. 

	
	
}// end DealerHand
