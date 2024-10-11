// ParseMusicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
			@Test
			void testParseMusic() {
				List<Object> result = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o");
				assertEquals(4, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(1, result.get(2));
				assertEquals(2, result.get(3));
				assertEquals(2, result.get(4));
				assertEquals(1, result.get(5));
				assertEquals(1, result.get(6));
				assertEquals(1, result.get(7));
				assertEquals(1, result.get(8));
				assertEquals(4, result.get(9));
				assertEquals(4, result.get(10));
			}
			
			@Test
			void testParseMusicEmpty() {
				List<Object> result = ParseMusic.parseMusic("");
				assertEquals(0, result.size());
			}
			
			@Test
			void testParseMusicAllWholeNotes() {
				List<Object> result = ParseMusic.parseMusic("o o o o");
				assertEquals(4, result.get(0));
				assertEquals(4, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(4, result.get(3));
			}
			
			@Test
			void testParseMusicAllQuarterNotes() {
				List<Object> result = ParseMusic.parseMusic(".| .| .| .|");
				assertEquals(1, result.get(0));
				assertEquals(1, result.get(1));
				assertEquals(1, result.get(2));
				assertEquals(1, result.get(3));
			}
			
			@Test
			void testParseMusicAllHalfNotes() {
				List<Object> result = ParseMusic.parseMusic("o| o| o| o|");
				assertEquals(2, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(2, result.get(2));
				assertEquals(2, result.get(3));
			}
			
			@Test
			void testParseMusicAllMixedNotes() {
				List<Object> result = ParseMusic.parseMusic("o| .| o| .| o| .| o| .|");
				assertEquals(2, result.get(0));
				assertEquals(1, result.get(1));
				assertEquals(2, result.get(2));
				assertEquals(1, result.get(3));
				assertEquals(2, result.get(4));
				assertEquals(1, result.get(5));
				assertEquals(2, result.get(6));
				assertEquals(1, result.get(7));
			}
			
			@Test
			void testParseMusicAllMixedNotes2() {
				List<Object> result = ParseMusic.parseMusic("o| .| o| .| o o| o o|");
				assertEquals(2, result.get(0));
				assertEquals(1, result.get(1));
				assertEquals(2, result.get(2));
				assertEquals(1, result.get(3));
				assertEquals(4, result.get(4));
				assertEquals(2, result.get(5));
				assertEquals(4, result.get(6));
				assertEquals(2, result.get(7));
			}
			
			@Test
			void testParseMusicAllMixedNotes3() {
}
}