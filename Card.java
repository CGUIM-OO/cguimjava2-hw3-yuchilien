/**
 * Description: TODO: please add description here
 * suit是花色,rank是點數 建立這兩個屬性 還有建構子
 * 轉換數字代碼與花色和點數的英文名字
 */
public class Card {
	public enum Suit{Spade,Heart,Diamond,Clubs}//列舉花色
	private Suit suit; // Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4 類型可以是物件
	private int rank; // 1~13
	
	/**
	 * @param s suit花色
	 * @param r rank點數
	 */
	public Card(Suit s, int value) {//建構子
		
		suit = s;
		rank = value;
	}

	// TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10
	// for rank)
	public  void printCard() {
		// Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as
		// Clubs Ace
		//建立兩個String變數來存轉換後的英文名字
		String sString="";//存花色
		String rString="";//存點數ToString(suit)
		// 按照花色,數字1~4分別對應的花色,判斷是幾號再存入sString

		switch(suit)
		{
			case Clubs:
				sString ="Club";
				break;
			case Diamond:
				sString = "Diamond";
				break;
			case Heart:
				sString = "Heart";
				break;
			case Spade:
				sString = "Spade";
				break;
		}


		// 按照點數,1、11、12、13點分別有英文名字所以要做轉換再存入rString
	switch(rank)
	{
		case 1:
			rString ="Ace";
			break;
		case 11:
			rString = "Jack";
			break;
		case 12:
			rString = "Queen";
			break;
		case 13:
			rString = "King";
			break;
		//
		default:
			rString = Integer.toString(rank);
			break;
	}
		// 印出牌的花色及點數
		System.out.println(sString + "," + rString);
	
	}

	public Suit getSuit() {//return type改成 列舉的項目
		return suit;
	}

	public int getRank() {
		return rank;
	}
}
