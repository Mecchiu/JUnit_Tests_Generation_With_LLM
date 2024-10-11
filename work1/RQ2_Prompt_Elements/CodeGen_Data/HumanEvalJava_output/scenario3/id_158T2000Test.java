// FindMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains one unit test case for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
// FindMax.java
package scenario3;

import java.util.List;

class FindMax {

    /**
     * Write a function that accepts a list of strings.
     * The list contains different words. Return the word with maximum number
     * of unique characters. If multiple strings have maximum number of unique
     * characters, return the one which comes first in lexicographical order.
     *
     * findMax(["name", "of", "string"]) == "string"
     * findMax(["name", "enam", "game"]) == "enam"
     * findMax(["aaaaaaa", "bb","cc"]) == ""aaaaaaa"
     *
     * > findMax(["name", "of", "string"])
     * "string"
     * > findMax(["name", "enam", "game"])
     * "enam"
     * > findMax(["aaaaaaa", "bb", "cc"])
     * "aaaaaaa"
     * > findMax(["abc", "cba"])
     * "abc"
     * > findMax(["play", "this", "game", "of", "footbott"])
     * "footbott"
     * > findMax(["we", "are", "gonna", "rock"])
     * "gonna"
     * > findMax(["we", "are", "a", "mad", "nation"])
     * "nation"
     * > findMax(["this", "is", "a", "prrk"])
     * "this"
     * > findMax(["b"])
     * "b"
     * > findMax(["play", "play", "play"])
     * "play"
     */
    public static String findMax(List<String> words) {
    }
}

// FindMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains one unit test case for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
		
		@Test
    public void test() {
        assertEquals("we", findMax("we"));
    }

		// TODO finish test case



}
