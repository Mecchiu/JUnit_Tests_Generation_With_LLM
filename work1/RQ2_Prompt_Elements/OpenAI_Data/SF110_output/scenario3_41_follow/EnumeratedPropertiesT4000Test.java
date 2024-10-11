// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a null key.
	* The expected result is a NullPointerException.
	*/
	@Test
	void testGetEnumeratedPropertyWithNullKey() {
		EnumeratedProperties properties = new EnumeratedProperties();
		assertThrows(NullPointerException.class, () -> {
			properties.getEnumeratedProperty(null);
		});
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with an empty key.
	* The expected result is a IllegalArgumentException.
	*/
	@Test
	void testGetEnumeratedPropertyWithEmptyKey() {
		EnumeratedProperties properties = new EnumeratedProperties();
		assertThrows(IllegalArgumentException.class, () -> {
			properties.getEnumeratedProperty("");
		});
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that does not exist in the properties.
	* The expected result is a IllegalArgumentException.
	*/
	@Test
	void testGetEnumeratedPropertyWithNonExistingKey() {
		EnumeratedProperties properties = new EnumeratedProperties();
		assertThrows(IllegalArgumentException.class, () -> {
			properties.getEnumeratedProperty("key");
		});
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties but the value is not a list.
	* The expected result is a IllegalArgumentException.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyButNotListValue() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value");
		assertThrows(IllegalArgumentException.class, () -> {
			properties.getEnumeratedProperty("key");
		});
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue2() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue3() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		list.add("value11");
		list.add("value12");
		list.add("value13");
		list.add("value14");
		list.add("value15");
		list.add("value16");
		list.add("value17");
		list.add("value18");
		list.add("value19");
		list.add("value20");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue4() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		list.add("value11");
		list.add("value12");
		list.add("value13");
		list.add("value14");
		list.add("value15");
		list.add("value16");
		list.add("value17");
		list.add("value18");
		list.add("value19");
		list.add("value20");
		list.add("value21");
		list.add("value22");
		list.add("value23");
		list.add("value24");
		list.add("value25");
		list.add("value26");
		list.add("value27");
		list.add("value28");
		list.add("value29");
		list.add("value30");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue5() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		list.add("value11");
		list.add("value12");
		list.add("value13");
		list.add("value14");
		list.add("value15");
		list.add("value16");
		list.add("value17");
		list.add("value18");
		list.add("value19");
		list.add("value20");
		list.add("value21");
		list.add("value22");
		list.add("value23");
		list.add("value24");
		list.add("value25");
		list.add("value26");
		list.add("value27");
		list.add("value28");
		list.add("value29");
		list.add("value30");
		list.add("value31");
		list.add("value32");
		list.add("value33");
		list.add("value34");
		list.add("value35");
		list.add("value36");
		list.add("value37");
		list.add("value38");
		list.add("value39");
		list.add("value40");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue6() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		list.add("value11");
		list.add("value12");
		list.add("value13");
		list.add("value14");
		list.add("value15");
		list.add("value16");
		list.add("value17");
		list.add("value18");
		list.add("value19");
		list.add("value20");
		list.add("value21");
		list.add("value22");
		list.add("value23");
		list.add("value24");
		list.add("value25");
		list.add("value26");
		list.add("value27");
		list.add("value28");
		list.add("value29");
		list.add("value30");
		list.add("value31");
		list.add("value32");
		list.add("value33");
		list.add("value34");
		list.add("value35");
		list.add("value36");
		list.add("value37");
		list.add("value38");
		list.add("value39");
		list.add("value40");
		list.add("value41");
		list.add("value42");
		list.add("value43");
		list.add("value44");
		list.add("value45");
		list.add("value46");
		list.add("value47");
		list.add("value48");
		list.add("value49");
		list.add("value50");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue7() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> list = new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		list.add("value5");
		list.add("value6");
		list.add("value7");
		list.add("value8");
		list.add("value9");
		list.add("value10");
		list.add("value11");
		list.add("value12");
		list.add("value13");
		list.add("value14");
		list.add("value15");
		list.add("value16");
		list.add("value17");
		list.add("value18");
		list.add("value19");
		list.add("value20");
		list.add("value21");
		list.add("value22");
		list.add("value23");
		list.add("value24");
		list.add("value25");
		list.add("value26");
		list.add("value27");
		list.add("value28");
		list.add("value29");
		list.add("value30");
		list.add("value31");
		list.add("value32");
		list.add("value33");
		list.add("value34");
		list.add("value35");
		list.add("value36");
		list.add("value37");
		list.add("value38");
		list.add("value39");
		list.add("value40");
		list.add("value41");
		list.add("value42");
		list.add("value43");
		list.add("value44");
		list.add("value45");
		list.add("value46");
		list.add("value47");
		list.add("value48");
		list.add("value49");
		list.add("value50");
		list.add("value51");
		list.add("value52");
		list.add("value53");
		list.add("value54");
		list.add("value55");
		list.add("value56");
		list.add("value57");
		list.add("value58");
		list.add("value59");
		list.add("value60");
		properties.setEnumeratedProperty("key", list);
		assertEquals(list, properties.getEnumeratedProperty("key"));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case tests the method with a key that exists in the properties and the value is a list.
	* The expected result is a list with the same values as the one that was set.
	*/
	@Test
	void testGetEnumeratedPropertyWithExistingKeyAndListValue8() {
		EnumeratedProperties properties = new EnumeratedPro