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
		private final String name;
		private final Properties properties;
		
		public EnumeratedPropertiesTest(String name, Properties properties) {
			this.name = name;
			this.properties = properties;
		}

		@Test
		void testSetEnumeratedProperty() {
			String propertyKey = name + "_index";
			System.out.println("Property Key: " + propertyKey);
			properties.setProperty(propertyKey, "4");
			assertEquals(properties.getProperty(propertyKey), "4");

			// propertyKey=key -> propertyKey[0] = '0' or propertyKey[1] = null
			List<String> parsedList = new ArrayList<>(1);
			propertyKey = name + "_size";
			parsedList.add("0");
			parsedList.add("0");
			properties.setProperty(propertyKey, parsedList);
			assertEquals(properties.getProperty(propertyKey), parsedList);
		}

}