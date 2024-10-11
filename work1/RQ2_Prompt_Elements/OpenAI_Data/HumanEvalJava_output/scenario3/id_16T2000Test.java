// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
	@Test
			void testCountDistinctCharacters() {
				assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
				assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
				assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
				assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
				assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
				assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
				assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
				assertEquals(3, CountDistinctCharacters.countDistinctCharacters("abcABC123"));
				assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaa"));
				assertEquals(2, CountDistinctCharacters.countDistinctCharacters("abababab"));
			}
}