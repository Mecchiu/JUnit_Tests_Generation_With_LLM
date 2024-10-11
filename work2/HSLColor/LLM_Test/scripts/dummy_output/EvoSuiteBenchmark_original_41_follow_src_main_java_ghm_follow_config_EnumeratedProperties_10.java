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
		
	/**
	 * Test method getEnumeratedProperty method of {@link ghm.follow.config.EnumeratedProperties}.
	 */
	@Test
	void getEnumeratedPropertyTest() {
		final String[] values = { "a", "b", "c" };
		final EnumeratedProperties enumerantedProperties = new EnumeratedProperties();
		assertEquals(values[0], enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).
				get(0)
				);
		assertEquals(values[2], enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).
				get(2)
				);
		
		assertEquals(valueOf(values[3]), enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).get(3)
				);

	}

	
	/**
	 * Test method constructor of {@link ghm.follow.config.EnumeratedPropertiesTest}
	 */
	@Test
	void constructorTest() {
		final EnumeratedProperties enumerantedProperties = new EnumeratedProperties();
		assertTrue(enumerantedProperties instanceof EnumeratedProperties);
	}

	/**
	 * Test method setEnumeratedProperty
	 */
	@Test
	void setEnumeratedPropertyTest() {
		final String[] values = { "a", "b", "c" };
		final EnumeratedProperties enumerantedProperties = new EnumeratedProperties();
		assertEquals(values[0], enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).get(0)
				);
		assertEquals(values[2], enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).get(2)
				);
		
		assertEquals(valueOf(values[3]), enumerantedProperties.getEnumeratedProperty(getClass()
				.getSimpleName()).get(3)
				);

	}

}