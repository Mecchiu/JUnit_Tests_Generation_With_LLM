// MatchParensTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains one unit test case for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
static final String testParens = matchParens(new List<String>().subList(1,  2));

		@Test
		public void test() {
		assertEquals(MatchParens.testParens, testParens);
	}
}
