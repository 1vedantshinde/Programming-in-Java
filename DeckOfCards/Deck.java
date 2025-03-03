import java.util.*;
// Deck.java 
class Deck {
    private ArrayList<Card> deck;
    private Random random;

    public Deck() {
        deck = new ArrayList<>();
        random = new Random();
        createDeck();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and 51.");
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void dealCard() {
        System.out.println("Five Random Cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(random.nextInt(deck.size())));
        }
    }

    public void sameCard() {
        Card card1 = deck.get(random.nextInt(deck.size()));
        Card card2 = deck.get(random.nextInt(deck.size()));
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        if (card1.suit.equals(card2.suit)) {
            System.out.println("Both cards are from the same suit.");
        } else {
            System.out.println("Cards are from different suits.");
        }
    }

    public void compareCard() {
        Card card1 = deck.get(random.nextInt(deck.size()));
        Card card2 = deck.get(random.nextInt(deck.size()));
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        if (card1.rank.equals(card2.rank)) {
            System.out.println("Both cards have the same rank.");
        } else {
            System.out.println("Cards have different ranks.");
        }
    }

	public void printOneRandomCard() {
        System.out.println("Random Card: " + deck.get(random.nextInt(deck.size())));
    }
}
