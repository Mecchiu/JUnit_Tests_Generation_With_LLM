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

	@Test
	void testParseMusic() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(4);
		expected.add(4);
		assertEquals(expected, ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"));
		
		expected = new ArrayList<Object>();
		assertEquals(expected, ParseMusic.parseMusic(""));
		
		expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		assertEquals(expected, ParseMusic.parseMusic("o o o o"));
		
		expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(1);
		assertEquals(expected, ParseMusic.parseMusic(".| .| .| .|"));
		
		expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(1);
		expected.add(1);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		assertEquals(expected, ParseMusic.parseMusic("o| o| .| .| o o o o"));
		
		expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(4);
		expected.add(2);
		assertEquals(expected, ParseMusic.parseMusic("o| .| o| .| o o| o o|"));
	}
}