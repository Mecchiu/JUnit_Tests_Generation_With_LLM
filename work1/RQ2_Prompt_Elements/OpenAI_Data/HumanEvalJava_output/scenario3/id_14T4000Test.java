// AllPrefixesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

	@Test
	void testAllPrefixes_1() {
		List<Object> result = AllPrefixes.allPrefixes("abc");
		assertEquals(3, result.size());
		assertEquals("a", result.get(0));
		assertEquals("ab", result.get(1));
		assertEquals("abc", result.get(2));
	}
	
	@Test
	void testAllPrefixes_2() {
		List<Object> result = AllPrefixes.allPrefixes("");
		assertEquals(0, result.size());
	}
	
	@Test
	void testAllPrefixes_3() {
		List<Object> result = AllPrefixes.allPrefixes("asdfgh");
		assertEquals(6, result.size());
		assertEquals("a", result.get(0));
		assertEquals("as", result.get(1));
		assertEquals("asd", result.get(2));
		assertEquals("asdf", result.get(3));
		assertEquals("asdfg", result.get(4));
		assertEquals("asdfgh", result.get(5));
	}
	
	@Test
	void testAllPrefixes_4() {
		List<Object> result = AllPrefixes.allPrefixes("WWW");
		assertEquals(3, result.size());
		assertEquals("W", result.get(0));
		assertEquals("WW", result.get(1));
		assertEquals("WWW", result.get(2));
	}
	
	@Test
	void testAllPrefixes_5() {
		List<Object> result = AllPrefixes.allPrefixes("a");
		assertEquals(1, result.size());
		assertEquals("a", result.get(0));
	}
	
	@Test
	void testAllPrefixes_6() {
		List<Object> result = AllPrefixes.allPrefixes("ab");
		assertEquals(2, result.size());
		assertEquals("a", result.get(0));
		assertEquals("ab", result.get(1));
	}
	
	@Test
	void testAllPrefixes_7() {
		List<Object> result = AllPrefixes.allPrefixes("asdf");
		assertEquals(4, result.size());
		assertEquals("a", result.get(0));
		assertEquals("as", result.get(1));
		assertEquals("asd", result.get(2));
		assertEquals("asdf", result.get(3));
	}
	
	@Test
	void testAllPrefixes_8() {
		List<Object> result = AllPrefixes.allPrefixes("asdfg");
		assertEquals(5, result.size());
		assertEquals("a", result.get(0));
		assertEquals("as", result.get(1));
		assertEquals("asd", result.get(2));
		assertEquals("asdf", result.get(3));
		assertEquals("asdfg", result.get(4));
	}
	
	@Test
	void testAllPrefixes_9() {
		List<Object> result = AllPrefixes.allPrefixes("asdfgh");
		assertEquals(6, result.size());
		assertEquals("a", result.get(0));
		assertEquals("as", result.get(1));
		assertEquals("asd", result.get(2));
		assertEquals("asdf", result.get(3));
		assertEquals("asdfg", result.get(4));
		assertEquals("asdfgh", result.get(5));
	}
	
	@Test
	void testAllPrefixes_10() {
		List<Object> result = AllPrefixes.allPrefixes("asdfghj");
		assertEquals(7, result.size());
		assertEquals("a", result.get(0));
		assertEquals("as", result.get(1));
		assertEquals("asd", result.get(2));
		assertEquals("asdf", result.get(3));
		assertEquals("asdfg", result.get(4));
		assertEquals("asdfgh", result.get(5));
		assertEquals("asdfghj", result.get(6));
	}
}