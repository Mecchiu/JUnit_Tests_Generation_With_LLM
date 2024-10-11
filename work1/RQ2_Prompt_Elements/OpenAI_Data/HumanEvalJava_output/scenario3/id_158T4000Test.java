// FindMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

	@Test
	void testFindMax() {
		List<String> words = List.of("name", "of", "string");
		assertEquals("string", FindMax.findMax(words));
		
		words = List.of("name", "enam", "game");
		assertEquals("enam", FindMax.findMax(words));
		
		words = List.of("aaaaaaa", "bb", "cc");
		assertEquals("aaaaaaa", FindMax.findMax(words));
		
		words = List.of("abc", "cba");
		assertEquals("abc", FindMax.findMax(words));
		
		words = List.of("play", "this", "game", "of", "footbott");
		assertEquals("footbott", FindMax.findMax(words));
		
		words = List.of("we", "are", "gonna", "rock");
		assertEquals("gonna", FindMax.findMax(words));
		
		words = List.of("we", "are", "a", "mad", "nation");
		assertEquals("nation", FindMax.findMax(words));
		
		words = List.of("this", "is", "a", "prrk");
		assertEquals("this", FindMax.findMax(words));
		
		words = List.of("b");
		assertEquals("b", FindMax.findMax(words));
		
		words = List.of("play", "play", "play");
		assertEquals("play", FindMax.findMax(words));
	}
}