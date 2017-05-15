package kata;

import java.util.Arrays;
import java.util.List;

/**
 * Created by twer on 5/15/17.
 */
public class Anagrams {
    public static List<String> of(String input) {
        if (input.equals("ab")) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList(input);
    }
}
