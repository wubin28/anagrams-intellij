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
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            String droppedChar = input.substring(i, i + 1);
            List<String> anagramsOfRest = of(dropChar(input, i));
            for (String anagramOfRest : anagramsOfRest) {
                result.add(droppedChar + anagramOfRest);
            }
        }

        return result;
    }

    private static String dropChar(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1, input.length());
    }
}
