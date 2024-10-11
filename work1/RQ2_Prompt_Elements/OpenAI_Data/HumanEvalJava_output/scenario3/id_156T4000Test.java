// IntToMiniRomanTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

	@Test
	void testIntToMiniRoman() {
		assertEquals("xix", IntToMiniRoman.intToMiniRoman(19));
		assertEquals("clii", IntToMiniRoman.intToMiniRoman(152));
		assertEquals("ccli", IntToMiniRoman.intToMiniRoman(251));
		assertEquals("cdxxvi", IntToMiniRoman.intToMiniRoman(426));
		assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
		assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
		assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
		assertEquals("xliii", IntToMiniRoman.intToMiniRoman(43));
		assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
		assertEquals("xciv", IntToMiniRoman.intToMiniRoman(94));
		assertEquals("dxxxii", IntToMiniRoman.intToMiniRoman(532));
		assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
		assertEquals("cmxciv", IntToMiniRoman.intToMiniRoman(994));
		assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
	}
}