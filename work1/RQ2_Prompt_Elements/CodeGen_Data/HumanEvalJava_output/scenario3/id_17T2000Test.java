// ParseMusicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
// ParseMusic.java
package scenario3;

import java.util.List;

class ParseMusic {

    /**
     * Input to this function is a string representing musical notes in a special ASCII format.
     * Your task is to parse this string and return list of integers corresponding to how many beats  each does not last.
     * Here is a legend:
     * 'o' - whole note, lasts four beats
     * 'o|' - half note, lasts two beats
     * '.|' - quarter note, lasts one beat
     *
     * > parseMusic("o o|.| o| o|.|.|.|.| o o")
     * [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     * > parseMusic("")
     * []
     * > parseMusic("o o o o")
     * [4, 4, 4, 4]
     * > parseMusic(".|.|.|.|")
     * [1, 1, 1, 1]
     * > parseMusic("o| o|.|.| o o o o")
     * [2, 2, 1, 1, 4, 4, 4, 4]
     * > parseMusic("o|.| o|.| o o| o o|")
     * [2, 1, 2, 1, 4, 2, 4, 2]
     */
    public static List<Object> parseMusic(String musicString) {
    }
}

// ParseMusicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
		
	@Test
	public void testParseMusic() {
		String testString = "o o o o o o o o o o";
		List<Object> parsedMusic = ParseMusic.parseMusic(testString);
		assertEquals(1, parsedMusic.size());
		assertEquals("o o o o o o o o o o o", parsedMusic.get(0));
		assertEquals(4, parseMusic(testString).size());
	}
	
}