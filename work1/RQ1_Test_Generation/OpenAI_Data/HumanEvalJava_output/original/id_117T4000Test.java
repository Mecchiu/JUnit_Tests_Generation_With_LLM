// SelectWordsTest.java
package original;

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
	void testSelectWords1() {
		String s = "Mary had a little lamb";
		int n = 4;
		List<Object> expected = new ArrayList<>();
		expected.add("little");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords2() {
		String s = "Mary had a little lamb";
		int n = 3;
		List<Object> expected = new ArrayList<>();
		expected.add("Mary");
		expected.add("lamb");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords3() {
		String s = "simple white space";
		int n = 2;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords4() {
		String s = "Hello world";
		int n = 4;
		List<Object> expected = new ArrayList<>();
		expected.add("world");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords5() {
		String s = "Uncle sam";
		int n = 3;
		List<Object> expected = new ArrayList<>();
		expected.add("Uncle");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords6() {
		String s = "";
		int n = 4;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords7() {
		String s = "a b c d e f";
		int n = 1;
		List<Object> expected = new ArrayList<>();
		expected.add("b");
		expected.add("c");
		expected.add("d");
		expected.add("f");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords8() {
		String s = "a b c d e f";
		int n = 0;
		List<Object> expected = new ArrayList<>();
		expected.add("a");
		expected.add("e");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords9() {
		String s = "a b c d e f";
		int n = 2;
		List<Object> expected = new ArrayList<>();
		expected.add("c");
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSelectWords10() {
		String s = "a b c d e f";
		int n = 3;
		List<Object> expected = new ArrayList<>();
		List<Object> actual = SelectWords.selectWords(s, n);
		assertEquals(expected, actual);
	}
}