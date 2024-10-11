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
// EnumeratedProperties.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Extension of {@link java.util.Properties} which allows one to specify property values which are
 * Lists of Strings.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class EnumeratedProperties extends Properties {

    public List<String> getEnumeratedProperty(String key) {
        ArrayList<String> values = new ArrayList<String>();
        int i = 0;
        String value;
        while ((value = this.getProperty(key + delimiter + i++))!= null) {
            values.add(value);
        }
        return values;
    }
}

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
		
	private final String delimiter = ",";
	
	/**
	* Test of the getEnumeratedProperty function, of static class ghm.follow.config.EnumeratedProperties.
	*/
	@Test
    public void testGetEnumeratedProperty() {
		// We'll set up two properties here
		Properties p = new Properties();
		p.put(EnumeratedProperties.PROP_KEY.toString(), new ArrayList<String>());
		p.put(EnumeratedProperties.PROP_KEY.toString(), null);
		
		// We'll now assert that the getEnumeratedProperty method returns something we can assign to
		assertEquals("No enumerated values found.", new ArrayList<String>(), EnumeratedProperties.getEnumeratedProperty(""));
		//
		// Now test the getEnumeratedProperty function for a map property
		assertEquals("getEnumeratedValueForKey in a map does return the enumerated values.", "key", EnumeratedProperties.getEnumeratedProperty("KEY"));
		assertEquals("getEnumeratedValueForKey in a map does return the enumerated values.", "value", EnumeratedProperties.getEnumeratedValueForKey("KEY"));
		//
		// Finally test for a null value. It should get the getEnumeratedValueForKey method
		assertEquals("Expected null value for non-enumerated values.", null, EnumeratedProperties.getEnumeratedValueForKey(null));
		
	}
	
}
