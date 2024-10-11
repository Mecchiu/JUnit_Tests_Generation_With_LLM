// IsHappyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains one unit test case for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    /**
     * Constructor of {@link IsHappyTest}.
     */
		public IsHappyTest() {
    }
		
		/**
		 * Test calling {@link IsHappy#isHappy(String)} on some {@link String} objects.
		 */
		@Test
		public void shouldReturnTrueIfAndNotFalseIfTheStringIsHappy() {
			assertTrue(IsHappy.isHappy("Hello, world."));
			assertFalse(IsHappy.isHappy("Hello, world!"));

			assertTrue(IsHappy.isHappy("Hello, world!"));
			assertTrue(IsHappy.isHappy("Hello, world!"));

			assertTrue(IsHappy.isHappy("Hello, world!"));
		}
}