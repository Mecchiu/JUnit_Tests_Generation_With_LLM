// FindMaxTest.java
package original;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

	@Test
	void testFindMax() {
		assertEquals("string", FindMax.findMax(List.of("name", "of", "string")));
		assertEquals("enam", FindMax.findMax(List.of("name", "enam", "game")));
		assertEquals("aaaaaaa", FindMax.findMax(List.of("aaaaaaa", "bb", "cc")));
		assertEquals("abc", FindMax.findMax(List.of("abc", "cba")));
		assertEquals("footbott", FindMax.findMax(List.of("play", "this", "game", "of", "footbott")));
		assertEquals("gonna", FindMax.findMax(List.of("we", "are", "gonna", "rock")));
		assertEquals("nation", FindMax.findMax(List.of("we", "are", "a", "mad", "nation")));
		assertEquals("this", FindMax.findMax(List.of("this", "is", "a", "prrk")));
		assertEquals("b", FindMax.findMax(List.of("b")));
		assertEquals("play", FindMax.findMax(List.of("play", "play", "play")));
	}
}