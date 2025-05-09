

//Main.java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        
        // Display deck initially
        System.out.println("\n********** Initial Deck **********");
        deck.printDeck();
        
        int choice;
        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Print a Card (by index)");
            System.out.println("2. Shuffle Deck and Display");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Generate Two Random Cards and Check Same Suit");
            System.out.println("5. Generate Two Random Cards and Check Same Rank");
            System.out.println("6. Print Deck");
			System.out.println("7. Print One Random Card");
			System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 2:
                    deck.shuffleDeck();
                    System.out.println("Shuffled Deck:");
                    deck.printDeck();
                    break;
                case 3:
                    deck.dealCard();
                    break;
                case 4:
                    deck.sameCard();
                    break;
                case 5:
                    deck.compareCard();
                    break;
				case 6:
					deck.printDeck();
					break;
				case 7:
					deck.printOneRandomCard();
					break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice. Try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
