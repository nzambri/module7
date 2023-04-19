import CountEachWord.WordOccurrences;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
  Word occurrences
  @author Nick Zambri
 * 4/17/2023
 */
import java.util.Map;

public class WordOccurrencesTest {

    @Test
    public void testWordCountsWithOneWord() {
        String input = "one";
        Map<String, Integer> wordCounts = WordOccurrences.countWords(input);
        assertEquals(1, wordCounts.size());
        assertEquals(1, wordCounts.get("one").intValue());
    }

    @Test
    public void testWordCountsWithMultipleWords() {
        String input = "one two one";
        Map<String, Integer> wordCounts = WordOccurrences.countWords(input);
        assertEquals(2, wordCounts.size());
        assertEquals(2, wordCounts.get("one").intValue());
        assertEquals(1, wordCounts.get("two").intValue());
    }

    @Test
    public void countWords() {
        String input = "one";
        Map<String, Integer> wordCounts = WordOccurrences.countWords(input);
        assertEquals(1, wordCounts.size());
        assertEquals(1, wordCounts.get("one").intValue());
    }
}