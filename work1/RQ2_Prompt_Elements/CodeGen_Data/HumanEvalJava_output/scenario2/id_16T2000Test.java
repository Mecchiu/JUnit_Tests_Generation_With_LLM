// CountDistinctCharactersTest.java
package scenario2;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains one unit test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
private final String str1 = "Hello World";
		private final String str2 = "Hello";
		private final String str3 = "Hello World";
		
		@Test
		void testCountDistinctCharacters() {
			assertEquals(3, CountDistinctCharacters.countDistinctCharacters(str3));
			assertEquals(6, CountDistinctCharacters.countDistinctCharacters(str2));
		}
		
		@Test
		void testCountDistinctCharactersNonCase() {
			assertEquals(3, CountDistinctCharacters.countDistinctCharacters(str1));
			assertEquals(0, CountDistinctCharacters.countDistinctCharacters(str2));
			assertEquals(5, CountDistinctCharacters.countDistinctCharacters(str3));
		}
}
