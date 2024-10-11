// SelectWordsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

	@Test
	void testSelectWords_1() {
		String s = "";
		int n = 0;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_2() {
		String s = "";
		int n = 1;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_3() {
		String s = "";
		int n = 2;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_4() {
		String s = "a";
		int n = 0;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_5() {
		String s = "a";
		int n = 1;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_6() {
		String s = "a";
		int n = 2;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_7() {
		String s = "a b";
		int n = 0;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_8() {
		String s = "a b";
		int n = 1;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_9() {
		String s = "a b";
		int n = 2;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords_10() {
		String s = "a b";
		int n = 3;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
}