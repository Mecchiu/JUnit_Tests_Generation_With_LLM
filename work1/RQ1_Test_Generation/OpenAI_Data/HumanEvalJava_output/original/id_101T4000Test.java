// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<Object> expected = new ArrayList<Object>(Arrays.asList("Hi", "my", "name", "is", "John"));
		List<Object> actual = WordsString.wordsString("Hi, my name is John");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString2() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("One", "two", "three", "four", "five", "six"));
		List<Object> actual = WordsString.wordsString("One, two, three, four, five, six");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString3() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("Hi", "my", "name"));
		List<Object> actual = WordsString.wordsString("Hi, my name");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString4() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("One", "two", "three", "four", "five", "six"));
		List<Object> actual = WordsString.wordsString("One,, two, three, four, five, six,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString5() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString6() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
		List<Object> actual = WordsString.wordsString("ahmed     , gamal");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString7() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
		List<Object> actual = WordsString.wordsString("ahmed,gamal");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString8() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
		List<Object> actual = WordsString.wordsString("ahmed, gamal");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString9() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
		List<Object> actual = WordsString.wordsString("ahmed,gamal,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString10() {
		List<Object> expected = new ArrayList<Object>(Arrays.asList("ahmed", "gamal"));
		List<Object> actual = WordsString.wordsString("ahmed, gamal,");
		assertEquals(expected, actual);
	}
}