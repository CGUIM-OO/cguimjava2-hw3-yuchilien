CGUIMOOP_HW3
From HW2.java
�NCard �M Deck class���X�A�s��Card.java�PDeck.java�A�ó]��public
�NCard.java, Deck.java �PHW3.java��b�P�@�Ӹ�Ƨ��A�P�@��JAVA project
Card.java
Use enumerated type in Card class:
Suit: Club, Diamond, Heart, Spade
Add Method:
�ק�Constructor�A�Ыت���ɡA�ݭn��J�Ѽ�(Suit s, int value)
�ק�public void printCard (); �d�ҡGSpade Ace
�]��Suit�ק�A�즳getSuit(); ��k��return type �n�ץ�
Deck.java
Add new Filed:

ArrayList usedCard;
public int nUsed;
Add new Method:

public void shuffle() �~�P�A�N�������P���^�]���޵o�X�h�X�i�^�A���s�~�P
���ܡG�H�����@�i�P�P�A���s����m
Random rnd = new Random(); int j = rnd.nextInt(i + 1);
���]usedCard, nUsed
public Card getOneCard() �o�@�i�P�X�ӡA�^��Card object
�n�ˬd�S�P�F (�P���o���F) ����H shuffle() �I
�o�X�h���P�����bArrayList usedCard
�o�F�X�i�P�H�����bpublic int nUsed;
Deck constructor �b�̫�I�sshuffle() method
�]��Card ��Constructor�ק�A����Code �n���
���ܡG for (Card.Suit s : Card.Suit.values()){ }