package kata;

import java.util.ArrayList;
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
        List<String> result = new ArrayList<String>();

        result.add(input.substring(0, 1) + of(dropChar(input, 0)).get(0));
        result.add(input.substring(0, 1) + of(dropChar(input, 0)).get(1));

        result.add(input.substring(1, 2) + of(dropChar(input, 1)).get(0));
        result.add(input.substring(1, 2) + of(dropChar(input, 1)).get(1));

        result.add(input.substring(2, 3) + of(dropChar(input, 2)).get(0));
        result.add(input.substring(2, 3) + of(dropChar(input, 2)).get(1));

        return result;
    }

    private static String dropChar(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1, input.length());
    }
}
