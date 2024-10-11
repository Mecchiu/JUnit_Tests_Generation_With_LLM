// Here's an example implementation of the EnumeratedProperties class and its test class:

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

    /**
     * Returns the List value of the property with the supplied key. Note that one can call
     * getEnumeratedProperty() for a given key successfully if and only if setEnumeratedProperty()
     * for that key was called some time beforehand. All members of the list returned will be
     * Strings.
     *
     * @param key lookup of the enumerated property to be retrieved.
     * @return list containing String values
     */
    public List<String> getEnumeratedProperty(String key) {
        List<String> result = new ArrayList<>();
        String value = getProperty(key);
        if (value != null) {
            String[] values = value.split(",");
            for (String v : values) {
                result.add(v.trim());
            }
        }
        return result;
    }

    /**
     * Sets the List value of the property with the supplied key. All members of the list must be
     * Strings.
     *
     * @param key lookup of the enumerated property to be set.
     * @param values list containing String values
     */
    public void setEnumeratedProperty(String key, List<String> values) {
        StringBuilder sb = new StringBuilder();
        for (String v : values) {
            sb.append(v.trim()).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        setProperty(key, sb.toString());
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
* It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

    @Test
    void testGetEnumeratedProperty() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        props.setEnumeratedProperty("key1", values);
        assertEquals(values, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithNullValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        assertNull(props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithEmptyValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", "");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithSingleValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", "value1");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        assertEquals(expected, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleValues() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithLeadingAndTrailingSpaces() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", "  value1, value2 ,value3  ");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithCommaInValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", "value1, value2, value3, value4, value5, value6");
        props.setProperty("key2", "value1, value2, value3, value4, value5, value6, value7, value8, value9, value10");
        List<String> expected1 = new ArrayList<>();
        expected1.add("value1");
        expected1.add("value2");
        expected1.add("value3");
        expected1.add("value4");
        expected1.add("value5");
        expected1.add("value6");
        List<String> expected2 = new ArrayList<>();
        expected2.add("value1");
        expected2.add("value2");
        expected2.add("value3");
        expected2.add("value4");
        expected2.add("value5");
        expected2.add("value6");
        expected2.add("value7");
        expected2.add("value8");
        expected2.add("value9");
        expected2.add("value10");
        assertEquals(expected1, props.getEnumeratedProperty("key1"));
        assertEquals(expected2, props.getEnumeratedProperty("key2"));
    }

    @Test
    void testGetEnumeratedPropertyWithWhitespaceValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key1", " ");
        List<String> expected = new ArrayList<>();
        expected.add("");
        assertEquals(expected, props.getEnumeratedProperty("key1"));
    }

    @Test
    void testGetEnumeratedPropertyWithNullKey() {
        EnumeratedProperties props = new EnumeratedProperties();
        assertNull(props.getEnumeratedProperty(null));
    }

    @Test
    void testGetEnumeratedPropertyWithNonexistentKey() {
        EnumeratedProperties props = new EnumeratedProperties();
        assertNull(props.getEnumeratedProperty("nonexistent"));
    }
}