// AntiShuffleTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
// AntiShuffle.java
package original;

import java.util.Arrays;

class AntiShuffle {

    /**
     * * Write a function that takes a string and returns an ordered version of it.
     * Ordered version of string, is a string where all words (separated by space)
     * are replaced by a new word where all the characters arranged in
     * ascending order based on ascii value.
     * Note: You should keep the order of words and blank spaces in the sentence.
     *
     * For example:
     * antiShuffle('Hi') returns 'Hi'
     * antiShuffle('hello') returns 'ehllo'
     * antiShuffle('Hello World!!!') returns 'Hello!!!Wdlor'
     *
     * > antiShuffle("Hi")
     * "Hi"
     * > antiShuffle("hello")
     * "ehllo"
     * > antiShuffle("number")
     * "bemnru"
     * > antiShuffle("abcd")
     * "abcd"
     * > antiShuffle("Hello World!!!")
     * "Hello!!!Wdlor"
     * > antiShuffle("")
     * ""
     * > antiShuffle("Hi. My name is Mister Robot. How are you?")
     * ".Hi My aemn is Meirst.Rboot How aer?ouy"
     */
    public static String antiShuffle(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = sortString(words[i]);
        }
        return String.join(" ", words);
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

// AntiShuffleTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	static final int TEST_NUM = 1;

	@Test
	@SuppressWarnings("unchecked")
	public void testAntiShuffle() {
			
		for (int i = 0; i < TEST_NUM; i++) {
			
			String s = "hi";
			String actualOutput = AntiShuffle.antiShuffle(s);
			String expectedOutput = Arrays.toString(new String[]{"Hello!!!Wdlor", "Hello!!!Wdlor", "Hello!!!Wdlor"});
			
			assertEquals(expectedOutput, actualOutput);
			
		}
	
	}
	
}

