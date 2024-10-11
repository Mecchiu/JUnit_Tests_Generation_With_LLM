// ReverseDeleteTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {

	@Test
	void testReverseDelete() {
		List<Object> expected = Arrays.asList("bcd", false);
		List<Object> actual = ReverseDelete.reverseDelete("abcde", "ae");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete2() {
		List<Object> expected = Arrays.asList("acdef", false);
		List<Object> actual = ReverseDelete.reverseDelete("abcdef", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete3() {
		List<Object> expected = Arrays.asList("cdedc", true);
		List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "ab");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete4() {
		List<Object> expected = Arrays.asList("dik", false);
		List<Object> actual = ReverseDelete.reverseDelete("dwik", "w");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete5() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("a", "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete6() {
		List<Object> expected = Arrays.asList("abcdedcba", true);
		List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete7() {
		List<Object> expected = Arrays.asList("abcdedcba", true);
		List<Object> actual = ReverseDelete.reverseDelete("abcdedcba", "v");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete8() {
		List<Object> expected = Arrays.asList("abba", true);
		List<Object> actual = ReverseDelete.reverseDelete("vabba", "v");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete9() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("mamma", "mia");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete10() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("", "a");
		assertEquals(expected, actual);
	}
}