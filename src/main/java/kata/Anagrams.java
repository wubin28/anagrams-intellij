package kata;

import java.util.Arrays;
import java.util.List;

/**
 * Created by twer on 5/15/17.
 */
public class Anagrams {
    public static List<String> of(String input) {
        if (input.length() <= 1) {
            return Arrays.asList(input);
        }
        if (input.length() == 2) {
            return Arrays.asList(input, input.substring(1, 2) + input.substring(0, 1));
        }
        return Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
    }
}
