// Here's an example implementation of the EnumeratedPropertiesTest class:

class EnumeratedPropertiesTest {

    @Test
    void testGetEnumeratedProperty() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        expectedValues.add("value2");
        expectedValues.add("value3");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithNonExistentKey() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> actualValues = properties.getEnumeratedProperty("nonExistentKey");
        assertTrue(actualValues.isEmpty());
    }

    @Test
    void testGetEnumeratedPropertyWithEmptyList() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithSingleValue() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        expectedValues.add("value2");
        expectedValues.add("value3");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithNonStringValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("1");
        expectedValues.add("2");
        expectedValues.add("3");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithMixedStringAndNonStringValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        expectedValues.add("2");
        expectedValues.add("value3");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithDelimiterInValue() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        expectedValues.add("value2|value3");
        properties.setEnumeratedProperty("key", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void testGetEnumeratedPropertyWithDelimiterInKey() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("value1");
        expectedValues.add("value2");
        expectedValues.add("value3");
        properties.setEnumeratedProperty("key|with|delimiter", expectedValues);

        List<String> actualValues = properties.getEnumeratedProperty("key|with|delimiter");
        assertEquals(expectedValues, actualValues);
    }
}