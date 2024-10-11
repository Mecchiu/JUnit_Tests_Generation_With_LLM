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
		assertEquals(11, result.size());
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
	void testParseMusicWholeNotes() {
		List<Object> result = ParseMusic.parseMusic("o o o o");
		assertEquals(4, result.size());
		assertEquals(4, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(4, result.get(2));
		assertEquals(4, result.get(3));
	}
	
	@Test
	void testParseMusicQuarterNotes() {
		List<Object> result = ParseMusic.parseMusic(".| .| .| .|");
		assertEquals(4, result.size());
		assertEquals(1, result.get(0));
		assertEquals(1, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
	}
	
	@Test
	void testParseMusicMixedNotes() {
		List<Object> result = ParseMusic.parseMusic("o| .| o| .| o o| o o|");
		assertEquals(8, result.size());
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
	void testParseMusicMixedNotes2() {
		List<Object> result = ParseMusic.parseMusic("o| o| .| .| o o o o");
		assertEquals(8, result.size());
		assertEquals(2, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
		assertEquals(4, result.get(4));
		assertEquals(4, result.get(5));
		assertEquals(4, result.get(6));
		assertEquals(4, result.get(7));
	}
	
	@Test
	void testParseMusicMixedNotes3() {
		List<Object> result = ParseMusic.parseMusic("o| o| .| .| o o| o o|");
		assertEquals(8, result.size());
		assertEquals(2, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
		assertEquals(4, result.get(4));
		assertEquals(2, result.get(5));
		assertEquals(4, result.get(6));
		assertEquals(2, result.get(7));
	}
	
	@Test
	void testParseMusicMixedNotes4() {
		List<Object> result = ParseMusic.parseMusic("o| o| .| .| o o| o o| o| o| .| .| o o| o o|");
		assertEquals(16, result.size());
		assertEquals(2, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
		assertEquals(4, result.get(4));
		assertEquals(2, result.get(5));
		assertEquals(4, result.get(6));
		assertEquals(2, result.get(7));
		assertEquals(2, result.get(8));
		assertEquals(2, result.get(9));
		assertEquals(1, result.get(10));
		assertEquals(1, result.get(11));
		assertEquals(4, result.get(12));
		assertEquals(2, result.get(13));
		assertEquals(4, result.get(14));
		assertEquals(2, result.get(15));
	}
	
	@Test
	void testParseMusicMixedNotes5() {
		List<Object> result = ParseMusic.parseMusic("o| o| .| .| o o| o o| o| o| .| .| o o| o o| o| o| .| .| o o| o o|");
		assertEquals(24, result.size());
		assertEquals(2, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
		assertEquals(4, result.get(4));
		assertEquals(2, result.get(5));
		assertEquals(4, result.get(6));
		assertEquals(2, result.get(7));
		assertEquals(2, result.get(8));
		assertEquals(2, result.get(9));
		assertEquals(1, result.get(10));
		assertEquals(1, result.get(11));
		assertEquals(4, result.get(12));
		assertEquals(2, result.get(13));
		assertEquals(4, result.get(14));
		assertEquals(2, result.get(15));
		assertEquals(2, result.get(16));
		assertEquals(2, result.get(17));
		assertEquals(1, result.get(18));
		assertEquals(1, result.get(19));
		assertEquals(4, result.get(20));
		assertEquals(2, result.get(21));
		assertEquals(4, result.get(22));
		assertEquals(2, result.get(23));
	}
	
	@Test
	void testParseMusicMixedNotes6() {
		List<Object> result = ParseMusic.parseMusic("o| o| .| .| o o| o o| o| o| .| .| o o| o o| o| o| .| .| o o| o o| o| o| .| .| o o| o o|");
		assertEquals(32, result.size());
		assertEquals(2, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(1, result.get(2));
		assertEquals(1, result.get(3));
		assertEquals(4, result.get(4));
		assertEquals(2, result.get(5));
		assertEquals(4, result.get(6));
		assertEquals(2, result.get(7));
		assertEquals(2, result.get(8));
		assertEquals(2, result.get(9));
		assertEquals(1, result.get(10));
		assertEquals(1, result.get(11));
		assertEquals(4, result.get(12));
		assertEquals(2, result.get(13));
		assertEquals(4, result.get(14));
		assertEquals(2, result.get(15));
		assertEquals(2, result.get(16));
		assertEquals(2, result.get(17));
		assertEquals(1, result.get(18));
		assertEquals(1, result.get(19));
		assertEquals(4, result.get(20));
		assertEquals(2, result.get(21));
		assertEquals(4, result.get(22));
		assertEquals(2, result.get(23));
		assertEquals(2, result.get(24));
		assertEquals(2, result.get(25));
		assertEquals(1, result.get(26));
		assertEquals(1, result.get(27));
		assertEquals(4, result.get(28));
		assertEquals(2, result.get(29));
		assertEquals(4, result.get(30));
		assertEquals(2, result.get(31));
	}
}