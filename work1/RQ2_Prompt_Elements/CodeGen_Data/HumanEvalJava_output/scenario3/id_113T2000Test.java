// OddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains one unit test case for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
//testcase_for_oddCount(oddCount([]), "0")
		@Test
		public void testcase_for_oddCount() {
				assertEquals("the number of odd elements 4n the str4ng 4 of the 4nput.",
						4,
						oddCount(['4', '4']));
		}
}

// OddCountTest is generated at runtime from testOddCount's testcase_for_oddCount class.
// For reference read the comment the file
