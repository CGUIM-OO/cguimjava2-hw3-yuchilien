import java.util.ArrayList;
import java.util.Random;

/**
 * Description: TODO: please add description here �ΰj�鲣�ͩҦ����P�A��iArrayList
 * �j��Ĥ@�h:�@���X�ƵPdeck �j��ĤG�h:���t���suit �j��ĤT�h:���t�I��rank
 */
public class Deck {
	private ArrayList<Card> cards;// �{�b�P���W���P
	private ArrayList<Card> usedCards;// �s�o�L���P
	public int nUsed;// �O���o�L�X�i�P

	// TODO: Please implement the constructor (30 points)
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		// Hint: Use new Card(x,y) and 3 for loops to add card into deck
		// Sample code start
		// Card card=new Card(1,1); ->means new card as clubs ace
		// cards.add(card);
		// Sample code end

		// �`�@���X�ƵP�N����
		for (int i = 0; i < nDeck; i++) {
			// ������� ���enum
			for (Card.Suit s : Card.Suit.values()) {// �令�C�|�᪺
				
				// �����I��(1~13)
				for (int r = 1; r < 14; r++) {
					Card card = new Card(s, r);
					cards.add(card);
				}
			}

		}
		shuffle();
	}

	// �@�~�T �G�~�P
	public void shuffle() {
		
		Random rnd = new Random();
		// i�O�{�b�n�B�z���P
		for (int i = 0; i < cards.size(); i++) {
			// j�O�H���b�Ҧ�cards�����@�i�P
			int j = rnd.nextInt(cards.size());
			// ���i�i���O���_��
			Card tmp = cards.get(i);
			// ��j�i�����i�i����m
			cards.set(i, cards.get(j));
			// ��i�i�����j�i����m
			cards.set(j, tmp);
		}
	}

	// �@�~�T�A�o�P
	public Card getOneCard() {
		// ���X�b�Ĥ@�Ӧ�m���P
		Card c = cards.get(0);
		// ��o�i�P�O���_��
		//usedCards.add(c);
		// �O���h�o�F�@�i�P
		nUsed++;
		// ��o�i�P�R��
		cards.remove(c);
		// �p�G�P�o���F
		if (cards.size() == 0) {
			// ���s����~�Pmethod
			shuffle();
		}
		// �^�ǳo�i�P
		return c;
	}

	// TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck() {
		// Hint: print all items in ArrayList<Card> cards,
		// TODO: please implement and reuse printCard method in Card class (5 points)
		// �L�X�P���W�Ҧ����P
		for (Card i : cards)// for each
		{
			i.printCard();
		}

	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}
}
