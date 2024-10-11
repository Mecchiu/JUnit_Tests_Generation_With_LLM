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
	* Constructor
	*
	* @param properties test properties
	*/
	public EnumeratedPropertiesTest() {
	}
	
	/**
	* Gets enumerated property value
	*/
	@Test
	void getEnumeratedPropertyValues() {
		
		List<String> values = new ArrayList<>();
				
		values.add("a");
		assertEquals("value set as expected", values, EnumeratedProperties.getEnumeratedPropertyValues("a"));
		values.add("a.b.c");
		assertEquals("value set as expected", values, EnumeratedProperties.getEnumeratedPropertyValues("a.b.c"));
		values.add("d.e.f");
		assertEquals("value set as expected", values, EnumeratedProperties.getEnumeratedPropertyValues("d.e.f"));
		values.add("-a.");
		values.add("null");
		assertEquals("value set as expected", values, EnumeratedProperties.getEnumeratedPropertyValues("-a."));
		values.add("\"test\"");
		assertEquals("value set as expected", values, EnumeratedProperties.getEnumeratedPropertyValues("\"test\""));
		
	}
	
	/**
	* Delimit properties value index when passed as a variable argument
	*/
	@Test
	void delimitPropertiesValueIndexWhenPassedAsVariableArgument() {
	
		String delimiter = "$.a";
		String prop = "a";
		Properties p = new Properties();
		p.setProperty(prop, "b"); // set the property value
		p.setProperty(delimiter, "c"); // get the property value
		String str = p.getProperty(prop); // return the property value as String
		assertEquals("Delimiting the property by '$' works if the property is a List value", "b", str);
		
	}
	
	/**
	* Delimit properties key if supplied with a variable argument
	*/
	@Test
	void delimitPropertiesKeyIfSuppliedWithVariableArgument() {
		String delimiter = "|";
		String prop = "a";
		Properties p = new Properties();
		p.setProperty(delimiter, "c"); // set the property value
		p.setProperty(prop, "d"); // get the property value
		String str = p.getProperty(prop); // return the property value as String
		assertEquals("Delimiting of the property by '|' works if the property is a List value", "c", str);
	}

	/**
	* Gets the value of property
	*/
	@Test
	void getEnumeratedPropertyValueDefaultWhenPropertyIsNotFound() {
		String delimiter = ".";
		String prop = "a.b.c";
		assertNull("Should not find Property with given name");
		Properties p = new Properties();
		p.setProperty("a", "b.c");
		List<String> values = EnumeratedProperties.getEnumeratedPropertyValues("c");
		assertEquals(0, values.size());
	}
	
}