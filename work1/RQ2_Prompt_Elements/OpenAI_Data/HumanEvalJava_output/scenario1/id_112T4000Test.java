// ReverseDeleteTest.java
package scenario1;

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
		String s = "abccba";
		String c = "abc";
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete2() {
		String s = "abccba";
		String c = "cba";
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete3() {
		String s = "abccba";
		String c = "c";
		List<Object> expected = Arrays.asList("ababa", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete4() {
		String s = "abccba";
		String c = "b";
		List<Object> expected = Arrays.asList("acaca", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete5() {
		String s = "abccba";
		String c = "a";
		List<Object> expected = Arrays.asList("bccb", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete6() {
		String s = "abccba";
		String c = "";
		List<Object> expected = Arrays.asList("abccba", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete7() {
		String s = "abccba";
		String c = "d";
		List<Object> expected = Arrays.asList("abccba", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete8() {
		String s = "abccba";
		String c = "abcd";
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete9() {
		String s = "abccba";
		String c = "dcba";
		List<Object> expected = Arrays.asList("", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
	
	@Test
	void testReverseDelete10() {
		String s = "abccba";
		String c = "dc";
		List<Object> expected = Arrays.asList("ababa", true);
		List<Object> actual = ReverseDelete.reverseDelete(s, c);
		assertEquals(expected, actual);
	}
}