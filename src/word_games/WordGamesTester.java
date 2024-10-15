package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();

        WordGames wordGames = new WordGames(word1);

        // Scramble it
        // Print out scrambled word
        System.out.println(wordGames.scramble());

        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();

        // Add random word at index
        System.out.println(wordGames.bananaSplit(idx,word));
        // Print out the word


        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter a character: ");
        String idx1 = input.nextLine();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();

        System.out.println(wordGames.bananaSplit(idx1,word2));

    }
}
