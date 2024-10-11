// GenerateIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains one unit test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	@Test
	void generateIntegers() {
		List<Object> result = GenerateIntegers.generateIntegers(1, 2);
		
		List<Object> actual = new ArrayList<>();
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i) % 2 == 0) {
				actual.add(i);
			}
		}
		assertEquals(actual, result);
	}
}