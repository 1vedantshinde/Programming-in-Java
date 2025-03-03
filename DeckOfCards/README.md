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
