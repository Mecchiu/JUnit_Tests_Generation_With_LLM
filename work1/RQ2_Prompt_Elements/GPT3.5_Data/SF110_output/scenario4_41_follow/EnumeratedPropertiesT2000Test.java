// Here's an implementation of the test class for EnumeratedProperties:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class EnumeratedPropertiesTest {

    @Test
    void testGetEnumeratedProperty() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithNonexistentKey() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> result = props.getEnumeratedProperty("key");
        assertNull(result);
    }

    @Test
    void testGetEnumeratedPropertyWithNonListValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        props.setProperty("key", "value");
        List<String> result = props.getEnumeratedProperty("key");
        assertNull(result);
    }

    @Test
    void testGetEnumeratedPropertyWithEmptyListValue() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithSingleValueList() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value");
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleListValues() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        values.add("value3");
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithWhitespaceInListValues() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value 1");
        values.add("value 2");
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithDelimiterInListValues() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value.1");
        values.add("value.2");
        props.setEnumeratedProperty("key", values);
        List<String> result = props.getEnumeratedProperty("key");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithDelimiterInKey() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value");
        props.setEnumeratedProperty("key.1", values);
        List<String> result = props.getEnumeratedProperty("key.1");
        assertEquals(values, result);
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleKeys() {
        EnumeratedProperties props = new EnumeratedProperties();
        List<String> values1 = new ArrayList<>();
        values1.add("value1");
        values1.add("value2");
        props.setEnumeratedProperty("key1", values1);
        List<String> values2 = new ArrayList<>();
        values2.add("value3");
        values2.add("value4");
        props.setEnumeratedProperty("key2", values2);
        List<String> result1 = props.getEnumeratedProperty("key1");
        List<String> result2 = props.getEnumeratedProperty("key2");
        assertEquals(values1, result1);
        assertEquals(values2, result2);
    }
}