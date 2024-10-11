// ParseMusicTest.java
package scenario2;

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
			* Test case for a string with only whole notes.
			*/
			@Test
			void testWholeNotes() {
						String musicString = "oooo";
						List<Object> expected = new ArrayList<>();
						expected.add(4);
						expected.add(4);
						expected.add(4);
						expected.add(4);
						List<Object> actual = ParseMusic.parseMusic(musicString);
						assertEquals(expected, actual);
			}

			/**
			* Test case for a string with only half notes.
			*/
			@Test
			void testHalfNotes() {
						String musicString = "o|o|o|o|";
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(2);
						expected.add(2);
						expected.add(2);
						List<Object> actual = ParseMusic.parseMusic(musicString);
						assertEquals(expected, actual);
			}

			/**
			* Test case for a string with only quarter notes.
			*/
			@Test
			void testQuarterNotes() {
						String musicString = ".|.|.|.||";
						List<Object> expected = new ArrayList<>();
						expected.add(1);
						expected.add(1);
						expected.add(1);
						expected.add(1);
						expected.add(2);
						List<Object> actual = ParseMusic.parseMusic(musicString);
						assertEquals(expected, actual);
			}

			/**
			* Test case for a string with a combination of whole, half and quarter notes.
			*/
			@Test
			void testMixedNotes() {
						String musicString = "o|o|.||o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|