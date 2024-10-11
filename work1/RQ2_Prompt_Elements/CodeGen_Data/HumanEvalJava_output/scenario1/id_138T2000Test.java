// IsEqualToSumEvenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains one unit test case for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
// static {
		//   // For tests that test the actual implementation,
		//   // use the following line:
		//   // IsEqualToSumEvenTest.STATIC_ASSERT_PREDEFINED_FIELD_MESSAGE = "The code is implicitly defined within the static block";

		// }

		
		@Test
		public void test() {
			// Test 1 - check result
			System.out.println("1. Test 1");
			Boolean result = IsEqualToSumEven.isEqualToSumEven(12);
			// System.out.println("result ="+result);
			assertNotNull("result must not be null", result);
			assertTrue("result must be true", result);
			System.out.println("1. Test 2 - no effect");
		}
}