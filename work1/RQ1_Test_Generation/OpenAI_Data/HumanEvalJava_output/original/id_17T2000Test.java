// ParseMusicTest.java
package original;

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
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string is empty.
			*/
			@Test
			void testEmptyString() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ParseMusic.parseMusic("");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only whole notes.
			*/
			@Test
			void testWholeNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(4);
				expected.add(4);
				expected.add(4);
				List<Object> actual = ParseMusic.parseMusic("o o o o");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only quarter notes.
			*/
			@Test
			void testQuarterNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(1);
				expected.add(1);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic(".| .| .| .|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only half notes.
			*/
			@Test
			void testHalfNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				List<Object> actual = ParseMusic.parseMusic("o| o| o| o|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only whole and half notes.
			*/
			@Test
			void testWholeAndHalfNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(4);
				expected.add(2);
				List<Object> actual = ParseMusic.parseMusic("o o| o o|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only whole and quarter notes.
			*/
			@Test
			void testWholeAndQuarterNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(1);
				expected.add(4);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o .| o .|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only half and quarter notes.
			*/
			@Test
			void testHalfAndQuarterNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(1);
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o| .| o| .|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only whole, half and quarter notes.
			*/
			@Test
			void testWholeHalfAndQuarterNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o o| .| o o| .|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains only whole, half and quarter notes.
			*/
			@Test
			void testWholeHalfAndQuarterNotes2() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				List<Object> actual = ParseMusic.parseMusic("o o| .| o o| .|");
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link ParseMusic#parseMusic(String)}.
			* It tests the case when the input string contains a mix of whole, half and quarter notes.
			*/
			@Test
			void testMixOfNotes() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				expected.add(2);
				expected.add(4);
				expected.add(1);
				expected.add(1);
				expected.add(1);
				expected.add(1);
				expected.add(4);
				expected.add(4);
				List<Object> actual = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o");
				assertEquals(expected, actual);
			}
}