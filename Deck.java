import java.util.ArrayList;
import java.util.Random;


/**
 * Description: TODO: please add description here 用迴圈產生所有的牌再放進ArrayList
 * 迴圈第一層:共有幾副牌deck 迴圈第二層:分配花色suit 迴圈第三層:分配點數rank
 */
public class Deck {
	private ArrayList<Card> cards;// 現在牌面上的牌
	private ArrayList<Card> usedCards;// 存發過的牌
	
	public int nUsed;// 記錄發過幾張牌

	// TODO: Please implement the constructor (30 points)
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		usedCards = new ArrayList<Card>();//usedCards初始化(不然會出錯，可是打了也是錯)QQQQQQQQQQQ
		// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		// Hint: Use new Card(x,y) and 3 for loops to add card into deck
		// Sample code start
		// Card card=new Card(1,1); ->means new card as clubs ace
		// cards.add(card);
		// Sample code end

		// 總共有幾副牌就產生
		for (int i = 0; i < nDeck; i++) {
			// 全部花色 改用enum
			for (Card.Suit s : Card.Suit.values()) {// 改成列舉後的
				
				// 全部點數(1~13)
				for (int r = 1; r < 14; r++) {
					Card card = new Card(s, r);
					cards.add(card);
				}
			}

		}
		shuffle();
	}

	// 作業三 ：洗牌
	public void shuffle() {
		// 如果牌有用過
		if(usedCards.size() != 0)
		{
			// 把用過的牌加回去
			for(Card c : usedCards)
			{
				cards.add(c);
			}
			// 把用過的牌清空
			usedCards.clear();
			nUsed = 0;
		}
		
		Random rnd = new Random();
		// i是現在要處理的牌
		for (int i = 0; i < cards.size(); i++) {
			// j是隨機在所有cards中的一張牌
			int j = rnd.nextInt(cards.size());
			// 把第i張先記錄起來
			Card tmp = cards.get(i);
			// 第j張拿到第i張的位置
			cards.set(i, cards.get(j));
			// 第i張拿到第j張的位置
			cards.set(j, tmp);
		}
	}

	// 作業三，發牌
	public Card getOneCard() {
		// 拿出在第一個位置的牌
		Card c = cards.get(0);
		// 把這張牌記錄起來
		
		usedCards.add(c);
		// 記錄多發了一張牌
		nUsed++;
		// 把這張牌刪掉
		cards.remove(c);
		// 如果牌發完了
		if (cards.size() == 0) {
			// 重新執行洗牌method
			shuffle();
		}
		// 回傳這張牌
		return c;
	}

	// TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck() {
		// Hint: print all items in ArrayList<Card> cards,
		// TODO: please implement and reuse printCard method in Card class (5 points)
		// 印出牌面上所有的牌
		for (Card i : cards)// for each
		{
			i.printCard();
		}

	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}
}
