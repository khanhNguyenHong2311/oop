import java.util.Scanner;
/**
 * Exercise 1.4.10 :Prints n poker hands ( 5 cards each ) from a shuffled deck. 
 * @param n n is the number of poker hands
 * @return print n poker hands
 */
public class Deal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 10 ) {
            System.out.print("n is invalid!");
            System.exit(0);
        }
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" } ;
        String[] ranks = {  "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"} ;
        String[] deck = new String[suits.length * ranks.length];
        
        // initialize
        int index = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[index] = ranks[i] + " of " + suits[j];
                index++; 
            }
        }

        // shuffle
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print
        for (int i = 0; i < n * 5; i++ ) {
            System.out.println( deck[i] );
            if ( i % 5 == 4 ) {
                System.out.println();
            }
        }
    }
}
