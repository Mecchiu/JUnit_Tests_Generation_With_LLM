// SelectWordsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

	@Test
	void testSelectWords1() {
		List<Object> result = SelectWords.selectWords("Mary had a little lamb", 4);
		assertEquals(1, result.size());
		assertEquals("little", result.get(0));
	}
	
	@Test
	void testSelectWords2() {
		List<Object> result = SelectWords.selectWords("Mary had a little lamb", 3);
		assertEquals(2, result.size());
		assertEquals("Mary", result.get(0));
		assertEquals("lamb", result.get(1));
	}
	
	@Test
	void testSelectWords3() {
		List<Object> result = SelectWords.selectWords("simple white space", 2);
		assertEquals(0, result.size());
	}
	
	@Test
	void testSelectWords4() {
		List<Object> result = SelectWords.selectWords("Hello world", 4);
		assertEquals(1, result.size());
		assertEquals("world", result.get(0));
	}
	
	@Test
	void testSelectWords5() {
		List<Object> result = SelectWords.selectWords("Uncle sam", 3);
		assertEquals(1, result.size());
		assertEquals("Uncle", result.get(0));
	}
	
	@Test
	void testSelectWords6() {
		List<Object> result = SelectWords.selectWords("", 4);
		assertEquals(0, result.size());
	}
	
	@Test
	void testSelectWords7() {
		List<Object> result = SelectWords.selectWords("a b c d e f", 1);
		assertEquals(4, result.size());
		assertEquals("b", result.get(0));
		assertEquals("c", result.get(1));
		assertEquals("d", result.get(2));
		assertEquals("f", result.get(3));
	}
	
	@Test
	void testSelectWords8() {
		List<Object> result = SelectWords.selectWords("a b c d e f", 0);
		assertEquals(0, result.size());
	}
	
	@Test
	void testSelectWords9() {
		List<Object> result = SelectWords.selectWords("a b c d e f", 6);
		assertEquals(0, result.size());
	}
	
	@Test
	void testSelectWords10() {
		List<Object> result = SelectWords.selectWords("a b c d e f", 7);
		assertEquals(0, result.size());
	}
}