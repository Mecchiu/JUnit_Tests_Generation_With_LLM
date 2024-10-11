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
/* 
Copyright (C) 2000-2003 Greg Merrill (greghmerrill@yahoo.com)

This file is part of Follow (http://follow.sf.net).

Follow is free software; you can redistribute it and/or modify
it under the terms of version 2 of the GNU General Public
License as published by the Free Software Foundation.

Follow is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Follow; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
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

    /**
     * Returns the List value of the property with the supplied key. Note that one can call
     * getEnumeratedProperty() for a given key successfully if and only if setEnumeratedProperty()
     * for that key was called some time beforehand. All members of the list returned will be
     * Strings.
     *
     * @param key
     *            lookup of the enumerated property to be retrieved.
     * @return list containing String values
     */
    public List<String> getEnumeratedProperty(String key) {
        ArrayList<String> values = new ArrayList<String>();
        int i = 0;
        String value;
        while ((value = this.getProperty(key + delimiter + i++))!= null) {
            values.add(value);
        }
        return values;
    }

    /**
     * Assigns the supplied array of String values to the supplied key.
     *
     * @param key
     *            property lookup
     * @param values
     *            values to be associated with the property lookup
     */
    public void setEnumeratedProperty(String key, List<String> values) {
        int i = 0;
        for (; i < values.size(); i++) {
            setProperty(key + delimiter + i, values.get(i));
        }
        while (getProperty(key + delimiter + i)!= null) {
            remove(key + delimiter + i);
            i++;
        }
    }

    /**
     * Delimiter between property name & list member index
     */
    protected static char delimiter = '.';
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
		private final Properties base = new Properties();
	/**
     * Initialize a test object with the given {@link Properties} object.
     * @param base the base Properties object.
     */
	public EnumeratedPropertiesTest(Properties base) {
	    this.base = base;}

		private List<String> properties = new ArrayList<String>();
	/**
     * Retrieve the list of the property with the supplied key.
     * @param key a key corresponding to a property; it may be a
     *             property name or value of a list
     *  @return the list of Strings.
     */
	public List<String> getEnumeratedProperty(String key) {
	    return this.properties.get(key);
	}
	/**
     * Set a property with a value of a list (will be executed immediately).
     * @param key the key to set the property with.  the value
     *                must be a List of Strings.
     * @param values an array of Strings that should be associated
     *                with the new property.
     */
	public void setEnumeratedProperty(String key, List<String> values) {
		this.properties.set(key, values);
	}
	protected static final String delimiter = ".";
	protected static final char delimiterChar = '.';
	@Test
	void createCopy() {
			EnumeratedPropertiesTest test = new EnumeratedPropertiesTest(base);
			String[] keys = {"key1", "key2", "key3"};
			String[][] values = {
				{"val1", "val3"}, {"val2", "val"}};
			assertTrue(test.hasProperty("key1"));
			assertTrue(test.getEnumeratedProperty("key1").size() == 1);
			assertTrue(test.getEnumeratedProperty("key1").get(key(key))
					.size() == values.length);
			for (int i = 0; i < values.length; i++) {
				assertTrue(
						test.hasProperty("key" + delimiter + i) &&!test.hasProperty(i + delimiterChar + "key" + delimiter + i));
				assertTrue(test.getEnumeratedProperty(i + delimiter + key(i)).size()
						== 1);
			}
			EnumeratedProperties eProps = new EnumeratedProperties(test);
			assertTrue(eProps.getEnumeratedProperty("key1") == values[0]);
			assertTrue(test.getEnumeratedProperty("key3").size() == 1);
	}
	@Test
	void testAddGetEnumeratedProperty()
	protected void testAddEnumeratedProperty()
	{
		/*
		 * Create test object with two properties
		 */
		EnumeratedProperties test = new EnumeratedProperties(base);
		test
		.setEnumeratedProperty(delimiter + "key1",
				new ArrayList<String>());
		String[] values = {"val1", "val2", "val3"};
		test.setEnumeratedProperty("key2", values);
		List<String> expected = new ArrayList<String>();
		expected
		.add(
				values[0]
		);
		expected
		.add(
				values[1]
		);
		expected
		.add(
				values[2]
		);
		List<String> result = test.getEnumeratedProperty(delimiter + "key1");
		List<String> result2 = new ArrayList<String>();
		for (int i = 0; i < result.size(); i++) {
			result2 = result;
			if (!result.get(i).equals(values[i])) {
				break;
			}
		}
		assertTrue(result.size() == expected.size());
		assertTrue(result == expected);
		test
		.setEnumeratedProperty(delimiter + "key2", values[0]);
	}
}
