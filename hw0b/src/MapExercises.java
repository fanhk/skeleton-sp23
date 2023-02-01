import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> result = new HashMap<>();
        int i = 1;
        for (Character c = 'a'; c <= 'z'; c++) {
            result.put(c, i);
            i++;
        }
        return result;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : nums) {
            result.put(i, i * i);
        }
        return result;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> result = new HashMap<>();
        Set<String> temp = new HashSet<>(words);
        for (String s : temp) {
            int count = 0;
            for (String st : words) {
                if (s.equals(st)) {
                    count++;
                }
            }
            result.put(s, count);
        }
        return result;
    }
}
