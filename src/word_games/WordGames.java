package word_games;

/**
 * Name: Brandon Smith (put your name here)
 * Date: 10-10-24 (put date of last revision here)
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
        // switch first half
        // and second half
        int index = word.length() / 2;
        String firstHalf = word.substring(0,index);
        String secondHalf = word.substring(index);
        return secondHalf + firstHalf;

    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position

        String firstHalf = word.substring(0, insertIdx);
        String secondHalf =  word.substring(insertIdx);

        // insertIdx
        return firstHalf + insertText + secondHalf;

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int index = word.indexOf(insertChar);
        String firstHalf = word.substring(0, index);
        String secondHalf = word.substring(index);

        return firstHalf + insertText + secondHalf;

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";

    }

}
