// CheckDictCaseTest.java
package scenario1;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains one unit test case for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	@Test
	public void tests() {
		checkDictCase(new Map<String, String>());
		checkDictCase(new Map<String, Integer>());
		checkDictCase(new Map<String, Integer>(2));
		checkDictCase(new Map<Integer, Character>());
		checkDictCase(new Map<Integer, Double>());
		checkDictCase(new Map<String, Double>());
	}
		
}
