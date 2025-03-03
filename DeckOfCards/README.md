## Explanation

> Problem: Design a menu-driven Java program to simulate a standard 52-card deck, allowing users to perform various operations. The program should support creating, shuffling, displaying, searching, and comparing cards. Users can pick specific cards, check for matching suits or ranks, deal random cards, and shuffle the deck. The menu should allow repeated interactions until the user chooses to exit.


#### Main.java
The `Main.java` class acts as the front-end for the DeckOfCards program and displays the menu where the user can choose between the operations that can be performed on the deck of cards. These operations are:
1. Display a single card based on index
2. Shuffle Deck and Display
3. Deal 5 Random Cards
4. Generate Two Random Cards and Check Same Suit
5. Generate Two Random Cards and Check Same Rank
6. Print Deck
7. Print One Random Card
8. Exit

Based on the user input, the corresponding function in `Deck.java` is called.


#### Deck.java
The `Deck.java` class acts as the backend for the DeckOfCards program, handling the creation, management, and operations on a deck of 52 playing cards. It provides various methods to manipulate and interact with the deck, such as shuffling, dealing random cards, and comparing cards based on their suits or ranks. The deck is implemented using an `ArrayList<Card>` to store card objects.

This class includes methods to:
1. Create and display the deck
2. Retrieve specific cards based on index
3. Shuffle and print the deck
4. Select random cards to check for matching suits or ranks
5. Search for a specific card in the deck

### **Function Table for `Deck.java`**
| **Method Name**        | **Description** |
|------------------------|----------------|
| `Deck()`              | Constructor that initializes the deck and fills it with 52 cards. |
| `createDeck()`        | Creates a standard deck of 52 playing cards (4 suits, 13 ranks each). |
| `printDeck()`         | Prints all the cards in the deck. |
| `printCard(int index)` | Prints a single card at the specified index. |
| `printOneRandomCard()` | Selects and prints one random card from the deck. |
| `shuffleDeck()`       | Shuffles the deck to randomize card order. |
| `dealCard()`          | Selects and prints five random cards from the deck. |
| `sameCard()`         | Picks two random cards and checks if they have the same suit. |
| `compareCard()`      | Picks two random cards and checks if they have the same rank. |
| `findCard(String rank, String suit)` | Searches for a specific card in the deck and prints if found. |


#### Card.java
The `Card.java` class represents an individual playing card. Each card has two attributes:  
- `rank` (e.g., "Ace", "2", "King")  
- `suit` (e.g., "Hearts", "Diamonds")

This class provides a way to create, store, and display individual cards.

