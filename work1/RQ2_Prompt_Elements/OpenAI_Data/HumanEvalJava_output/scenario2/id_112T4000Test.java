// ReverseDeleteTest.java
package scenario2;

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
	void testReverseDelete1() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("", "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete2() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("", "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete3() {
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete("a", "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete4() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("a", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete5() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("ab", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete6() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("ba", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete7() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("aba", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete8() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("bab", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete9() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("baba", "b");
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete10() {
		List<Object> expected = Arrays.asList("a", true);
		List<Object> actual = ReverseDelete.reverseDelete("abab", "b");
		assertEquals(expected, actual);
	}
}