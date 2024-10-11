// CountDistinctCharactersTest.java
package original;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains one unit test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
/**
		 * The constructor of CountDistinctCharactersTest and its implementation.
		 */
		CountDistinctCharactersTest() throws Exception {
			assertEquals(3, countDistinctCharacters("xyz").size());
			assertEquals(4, countDistinctCharacters("Jerry").size());
		}

		/**
		 * Assert the value of the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
		 */
		@Test
		void testCountDistinctCharacters() {
			assertEquals(3, countDistinctCharacters("xyz").size());
		}
}

