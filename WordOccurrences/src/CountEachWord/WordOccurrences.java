package CountEachWord;
/*
  Word occurrences
  @author Nick Zambri
 * 4/17/2023
 */
import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = input.split("[\\s.;,?:!()\"]+");
        for (String word : words) {
            word = word.trim();
            if (word.length() > 0) {
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        }
        return wordCounts;
    }
}