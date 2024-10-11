// CheckDictCaseTest.java
package scenario2;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains one unit test case for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	/**
	* Test method for {@link org.junit.jupiter.api.Assertions#assertAll(org.junit.jupiter.api.Assertions.Condition)}.
	*/
	@Test
    public void testAssertAllTrue() {
        // arrange
        Map<String, String> map = new java.util.HashMap<>();
        map.put("a", "b");
        map.put("c", "d");

        // act
        CheckDictCase.checkDictCase(map);

        // assert
        assertAll(map);

    }
	
}
