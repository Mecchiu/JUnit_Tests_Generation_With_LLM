// IsHappyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains one unit test case for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

	@Test
	public void test_isHappy_returnsTrue_whenThereIsOneNumber() {
		assertTrue(new IsHappy().isHappy("23"));
		assertFalse(new IsHappy().isHappy("22"));
	}
	
}