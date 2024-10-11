// WordsStringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

	@Test
	void testWordsString() {
		List<Object> result = WordsString.wordsString("Hi, my name is John");
		assertEquals(5, result.size());
		assertEquals("Hi", result.get(0));
		assertEquals("my", result.get(1));
		assertEquals("name", result.get(2));
		assertEquals("is", result.get(3));
		assertEquals("John", result.get(4));
	}
	
	@Test
	void testWordsString2() {
		List<Object> result = WordsString.wordsString("One, two, three, four, five, six");
		assertEquals(6, result.size());
		assertEquals("One", result.get(0));
		assertEquals("two", result.get(1));
		assertEquals("three", result.get(2));
		assertEquals("four", result.get(3));
		assertEquals("five", result.get(4));
		assertEquals("six", result.get(5));
	}
	
	@Test
	void testWordsString3() {
		List<Object> result = WordsString.wordsString("Hi, my name");
		assertEquals(3, result.size());
		assertEquals("Hi", result.get(0));
		assertEquals("my", result.get(1));
		assertEquals("name", result.get(2));
	}
	
	@Test
	void testWordsString4() {
		List<Object> result = WordsString.wordsString("One,, two, three, four, five, six,");
		assertEquals(6, result.size());
		assertEquals("One", result.get(0));
		assertEquals("two", result.get(1));
		assertEquals("three", result.get(2));
		assertEquals("four", result.get(3));
		assertEquals("five", result.get(4));
		assertEquals("six", result.get(5));
	}
	
	@Test
	void testWordsString5() {
		List<Object> result = WordsString.wordsString("");
		assertEquals(0, result.size());
	}
	
	@Test
	void testWordsString6() {
		List<Object> result = WordsString.wordsString("ahmed     , gamal");
		assertEquals(2, result.size());
		assertEquals("ahmed", result.get(0));
		assertEquals("gamal", result.get(1));
	}
	
	@Test
	void testWordsString7() {
		List<Object> result = WordsString.wordsString("ahmed, gamal");
		assertEquals(2, result.size());
		assertEquals("ahmed", result.get(0));
		assertEquals("gamal", result.get(1));
	}
	
	@Test
	void testWordsString8() {
		List<Object> result = WordsString.wordsString("ahmed,gamal");
		assertEquals(2, result.size());
		assertEquals("ahmed", result.get(0));
		assertEquals("gamal", result.get(1));
	}
	
	@Test
	void testWordsString9() {
		List<Object> result = WordsString.wordsString("ahmed, gamal, mohamed");
		assertEquals(3, result.size());
		assertEquals("ahmed", result.get(0));
		assertEquals("gamal", result.get(1));
		assertEquals("mohamed", result.get(2));
	}
	
	@Test
	void testWordsString10() {
		List<Object> result = WordsString.wordsString("ahmed, gamal, mohamed, ali");
		assertEquals(4, result.size());
		assertEquals("ahmed", result.get(0));
		assertEquals("gamal", result.get(1));
		assertEquals("mohamed", result.get(2));
		assertEquals("ali", result.get(3));
	}
}