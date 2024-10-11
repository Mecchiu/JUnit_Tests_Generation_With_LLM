// LongestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

	@Test
	void testLongest_1() {
		List<Object> strings = List.of("a", "b", "c");
		assertEquals("a", Longest.longest(strings));
	}
	
	@Test
	void testLongest_2() {
		List<Object> strings = List.of("a", "bb", "ccc");
		assertEquals("ccc", Longest.longest(strings));
	}
	
	@Test
	void testLongest_3() {
		List<Object> strings = List.of();
		assertEquals(null, Longest.longest(strings));
	}
	
	@Test
	void testLongest_4() {
		List<Object> strings = List.of("x", "y", "z");
		assertEquals("x", Longest.longest(strings));
	}
	
	@Test
	void testLongest_5() {
		List<Object> strings = List.of("x", "yyy", "zzzz", "www", "kkkk", "abc");
		assertEquals("zzzz", Longest.longest(strings));
	}
	
	@Test
	void testLongest_6() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff");
		assertEquals("a", Longest.longest(strings));
	}
	
	@Test
	void testLongest_7() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		assertEquals("ggggggg", Longest.longest(strings));
	}
	
	@Test
	void testLongest_8() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh");
		assertEquals("hhhhhhhh", Longest.longest(strings));
	}
	
	@Test
	void testLongest_9() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh", "iiiiiiiii");
		assertEquals("iiiiiiiii", Longest.longest(strings));
	}
	
	@Test
	void testLongest_10() {
		List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg", "hhhhhhhh", "iiiiiiiii", "jjjjjjjjjj");
		assertEquals("jjjjjjjjjj", Longest.longest(strings));
	}
}