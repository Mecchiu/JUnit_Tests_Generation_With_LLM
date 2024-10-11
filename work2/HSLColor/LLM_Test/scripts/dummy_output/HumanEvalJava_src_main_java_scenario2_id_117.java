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
			void testSelectWords() {
				List<Object> expected = new ArrayList<>();
				expected.add("bdf");
				expected.add("gj");
				expected.add("lmn");
				expected.add("pqrst");
				expected.add("vwxyz");
				assertEquals(expected, SelectWords.selectWords("a bdf c gj e lmn pqrst u vwxyz", 3));
			}

			@Test
			void testSelectWordsEmptyString() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 3));
			}

			@Test
			void testSelectWordsNoConsonants() {
				List<Object> expected = new ArrayList<>();
				expected.add("a");
				expected.add("e");
				expected.add("i");
				expected.add("o");
				expected.add("u");
				assertEquals(expected, SelectWords.selectWords("a e i o u", 0));
			}

			@Test
			void testSelectWordsNoConsonantsEmptyString() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowels() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("b c d f g h j k l m n p q r s t v w x y z", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowelsEmptyString() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowelsNoSpaces() {
				List<Object> expected = new ArrayList<>();
				expected.add("b");
				expected.add("c");
				expected.add("d");
				expected.add("f");
				expected.add("g");
				expected.add("h");
				expected.add("j");
				expected.add("k");
				expected.add("l");
				expected.add("m");
				expected.add("n");
				expected.add("p");
				expected.add("q");
				expected.add("r");
				expected.add("s");
				expected.add("t");
				expected.add("v");
				expected.add("w");
				expected.add("x");
				expected.add("y");
				expected.add("z");
				assertEquals(expected, SelectWords.selectWords("bcdfghjklmnpqrstvwxyz", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowelsNoSpacesEmptyString() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowelsNoSpacesNoWords() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords(" ", 0));
			}

			@Test
			void testSelectWordsNoConsonantsNoVowelsNoSpacesNoWordsEmptyString() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 0));
			}
}