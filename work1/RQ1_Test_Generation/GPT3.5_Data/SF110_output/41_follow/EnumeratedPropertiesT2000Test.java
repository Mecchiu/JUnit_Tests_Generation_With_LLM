```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnumeratedPropertiesTest {

    @Test
    void testGetEnumeratedProperty() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(2, retrievedValues.size());
        assertTrue(retrievedValues.contains("value1"));
        assertTrue(retrievedValues.contains("value2"));
    }

    @Test
    void testGetEnumeratedPropertyEmpty() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> retrievedValues = properties.getEnumeratedProperty("nonExistentKey");
        assertTrue(retrievedValues.isEmpty());
    }

    @Test
    void testGetEnumeratedPropertySingleValue() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("singleValue");
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(1, retrievedValues.size());
        assertTrue(retrievedValues.contains("singleValue"));
    }

    @Test
    void testGetEnumeratedPropertyMultipleValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        values.add("value3");
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(3, retrievedValues.size());
        assertTrue(retrievedValues.contains("value1"));
        assertTrue(retrievedValues.contains("value2"));
        assertTrue(retrievedValues.contains("value3"));
    }

    @Test
    void testGetEnumeratedPropertyNonSequentialIndexes() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key.0", "value1");
        properties.setProperty("key.2", "value2");

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(2, retrievedValues.size());
        assertTrue(retrievedValues.contains("value1"));
        assertTrue(retrievedValues.contains("value2"));
    }

    @Test
    void testGetEnumeratedPropertyWithOtherProperties() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("otherKey", "otherValue");
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(2, retrievedValues.size());
        assertTrue(retrievedValues.contains("value1"));
        assertTrue(retrievedValues.contains("value2"));
    }

    @Test
    void testGetEnumeratedPropertyWithDifferentDelimiter() {
        EnumeratedProperties.properties = new EnumeratedProperties();
        EnumeratedProperties.delimiter = '_';
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertEquals(2, retrievedValues.size());
        assertTrue(retrievedValues.contains("value1"));
        assertTrue(retrievedValues.contains("value2"));
    }

    @Test
    void testGetEnumeratedPropertyWithEmptyValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        properties.setEnumeratedProperty("key", values);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertTrue(retrievedValues.isEmpty());
    }

    @Test
    void testGetEnumeratedPropertyWithNullKey() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        properties.setEnumeratedProperty(null, values);

        List<String> retrievedValues = properties.getEnumeratedProperty(null);
        assertTrue(retrievedValues.isEmpty());
    }

    @Test
    void testGetEnumeratedPropertyWithNullValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setEnumeratedProperty("key", null);

        List<String> retrievedValues = properties.getEnumeratedProperty("key");
        assertTrue(retrievedValues.isEmpty());
    }
}
```
```