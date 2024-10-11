// IsHappyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

	@Test
	void testIsHappy() {
		assertTrue(IsHappy.isHappy("abc"));
		assertTrue(IsHappy.isHappy("aabbcc"));
		assertTrue(IsHappy.isHappy("aabbccddeeff"));
		assertTrue(IsHappy.isHappy("aabbccddeeffgg"));
		assertTrue(IsHappy.isHappy("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"));
		assertFalse(IsHappy.isHappy("aa"));
		assertFalse(IsHappy.isHappy("aaa"));
		assertFalse(IsHappy.isHappy("aaaa"));
		assertFalse(IsHappy.isHappy("aaaaa"));
		assertFalse(IsHappy.isHappy("aaaaaa"));
	}
}