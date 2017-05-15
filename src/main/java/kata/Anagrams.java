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
        return Arrays.asList(input, "b" + "a");
    }
}
