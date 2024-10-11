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
	public void testEnumeratedPropertiesWithDelimiter() {
		// Valid Properties
		Properties properties = new Properties();
				
		// One property value.
		properties.setProperty("a", "One");
			
		// Two different value.
		properties.setProperty("b", "Two");
		properties.setProperty("c", "Three");
		
		// Two different properties and list items
		properties.setProperty("d", "Three");
		List<String> l = new ArrayList<>();
		l.add("One");
		properties.setProperty("d", l);
		
		// List of String
		properties.setProperty("e", "Three"); 
		List<String> list = new ArrayList<String>();
		list.add("One");
		l.add(list);
		properties.setProperty("e", list);
		
		// List of List
		properties.setProperty("f", new ArrayList<String>());
		List<List<String>> list2 = new ArrayList<>();
		list2.add(new ArrayList<String>());
		l.add(list2);
		list2.add(5, "Five", "Six");
		properties.setProperty("f", list2);
		
		// List of list of string
		properties.setProperty("g", new ArrayList<String>());
		List<List<String>> list4 = new ArrayList<>();
		list4.add(new ArrayList<String>());
		List<String> list5 = new ArrayList<>();
		list5.add("Five");
		list4.add(list5);
		properties.setProperty("g", list4);
		
		// List of List
		properties.setProperty("h", new ArrayList<String>());
		List<List<String>> list6 = new ArrayList<>();
		list6.add(new ArrayList<String>());
		properties.setProperty("h", list6);
		
		// One null value
		list = null;
		properties.setProperty("i", "");
		properties.setProperty("j", "");
		
		// Two null values
		l = null;
		properties.setProperty("k", l);
		l = null;
		properties.setProperty("l", l);
		
		// Two null properties
		properties = null;
		properties.setProperty("m", "One");
		properties.setProperty("n", "Three");
			
		// Three null values
		properties = null;
		properties.setProperty("o", "");
		properties.setProperty("p", "");
		
		// Null
		properties = null;
		properties.setProperty("r", null);
		
		// Null Properties
		properties = null;
		properties.setProperty("s", null);
		properties.setProperty("t", null);
		properties = null;
		properties.setProperty("u", null);
		properties.setProperty("v", null);
		properties = null;
		properties.setProperty("w", null);
		properties.setProperty("x", null);
		
		assertEquals(null, properties.getProperty("a"));
		assertEquals(null, properties.getProperty("b"));
		assertEquals(null, properties.getProperty("c"));
		assertEquals(null, properties.getProperty("d"));
		assertEquals(null, l);
		assertEquals(null, properties.getProperty("e"));
		assertEquals(null, properties.getProperty("f"));
		assertEquals(null, properties.getProperty("g"));
		assertEquals(null, properties.getProperty("h"));
		assertEquals(null, properties.getProperty("i"));
		assertEquals(null, properties.getProperty("j"));
		assertEquals(null, properties.getProperty("k"));
		assertEquals(null, properties.getProperty("l"));
		assertEquals(null, properties.getProperty("m"));
		assertEquals(null, properties.getProperty("n"));
		assertEquals(null, properties.getProperty("o"));
		assertEquals(null, properties.getProperty("p"));
		assertEquals(null, properties.getProperty("r"));
		assertEquals(null, properties.getProperty("s"));
		assertEquals(null, properties.getProperty("t"));
		assertEquals(null, properties.getProperty("u"));
		assertEquals(null, properties.getProperty("v"));
		assertEquals(null, properties.getProperty("w"));
		assertEquals(null, properties.getProperty("x"));
	}

	/**
	 * Returns a List using the Delimiter defined by the specified key.
	 *
	 * @param key
	 *            the key.
	 * @return a List of Strings
	 */
	public List<String> getEnumeratedProperty(String key);
}