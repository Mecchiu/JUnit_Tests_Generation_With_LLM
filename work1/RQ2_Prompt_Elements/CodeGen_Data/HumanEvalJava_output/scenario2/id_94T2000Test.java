// SkjkasdkdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains one unit test case for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
// Declare your own test case.
		// Class name of your test case must be {@link Skjkasdkd#testName()}.
		String testName;
		
		// Instance test case.
		public SkjkasdkdTest() {
			testName = "testName";
		}
		@Test
		void test() {
			
			// Verify results.  
			System.out.printf("** SKJASDKD Test: %s**\n", testName);
			assertEquals(0, null, skjkasdkd(List.of(2, 3, 4))); // 1, 3, 4
			assertEquals(0, null, skjkasdkd(List.of(2, 3, 4), 10)); // 1, 3, 4
			assertEquals(0, null, skjkasdkd(4, 2, 3));
		}
	}
