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

    @Test
    public void the_number_of_the_anagram_of_a_three_letter_string_should_be_6() {
        assertThat(Anagrams.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    public void the_number_of_the_anagram_of_a_four_letter_string_should_be_24() {
        assertThat(Anagrams.of("abcd").size(), is(24));
    }
}
