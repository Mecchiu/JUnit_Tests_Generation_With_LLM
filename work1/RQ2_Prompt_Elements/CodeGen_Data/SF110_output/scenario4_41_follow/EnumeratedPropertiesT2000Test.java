// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

	@Test
	public void test() {
		
		String[] keys = {"a", "b"};
		List<String> values = new ArrayList<>();
		EnumeratedProperties.setEnumeratedProperty(keys[0], values);
		for (int i = 1 ; i < keys.length;i++) {
			EnumeratedProperties.setEnumeratedProperty(keys[i], values);
		}
		List<String> actual = new ArrayList<>(EnumeratedProperties.getEnumeratedProperty(keys[0]));

		assertEquals(keys.length, actual.size());
		
		for (int i = 0; i < keys.length;i++) {
			assertEquals("Key mismatch", actual.get(i), expectedValues.get(keys[i]));
		}
		
	}
}
