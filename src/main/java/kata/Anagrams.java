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
        return Arrays.asList(
                input.substring(0, 1) + of(dropChar(input, 0)).get(0),
                input.substring(0, 1) + of(dropChar(input, 0)).get(1),

                input.substring(1, 2) + "ac",
                input.substring(1, 2) + "ca",

                input.substring(2, 3) + "ab",
                input.substring(2, 3) + "ba");
    }

    private static String dropChar(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1, input.length());
    }
}
