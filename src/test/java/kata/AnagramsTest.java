package kata;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnagramsTest {
    @Test
    public void the_anagram_of_an_empty_string_should_be_itself() {
        assertThat(Anagrams.of(""), is(Arrays.asList("")));
    }

    @Test
    public void the_anagram_of_a_one_letter_string_should_be_itself() {
        assertThat(Anagrams.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_number_of_the_anagram_of_a_two_letter_string_should_be_2() {
        assertThat(Anagrams.of("ab"), is(Arrays.asList("ab", "ba")));
    }
}
