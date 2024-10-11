// ParseMusicTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {

		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ParseMusic.parseMusic("");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains only one note.
		* The expected result is a list with one element.
		*/
		@Test
		void testCase2() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				List<Object> actual = ParseMusic.parseMusic("o");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one rest.
		* The expected result is a list with one element.
		*/
		@Test
		void testCase3() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic(".");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one double note.
		* The expected result is a list with one element.
		*/
		@Test
		void testCase4() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				List<Object> actual = ParseMusic.parseMusic("o|");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains only one double note and one single note.
		* The expected result is a list with two elements.
		*/
		@Test
		void testCase5() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(4);
				List<Object> actual = ParseMusic.parseMusic("o|o");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains only one double note and one rest.
		* The expected result is a list with two elements.
		*/
		@Test
		void testCase6() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o|.");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains only one single note and one rest.
		* The expected result is a list with two elements.
		*/
		@Test
		void testCase7() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o.");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains only one single note and one double note.
		* The expected result is a list with two elements.
		*/
		@Test
		void testCase8() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				List<Object> actual = ParseMusic.parseMusic("oo|");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains only one single note, one double note and one rest.
		* The expected result is a list with three elements.
		*/
		@Test
		void testCase9() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("oo|.");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains only one single note, one double note and one rest.
		* The expected result is a list with three elements.
		*/
		@Test
		void testCase10() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("oo|.oo|.");
				assertEquals(expected, actual);
		}
}