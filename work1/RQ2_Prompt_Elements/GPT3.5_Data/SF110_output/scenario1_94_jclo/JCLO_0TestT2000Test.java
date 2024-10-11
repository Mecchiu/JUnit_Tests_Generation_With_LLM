// Here's an example of a test case for the JCLO class

@Test
void testGetValue() {
    JCLO jclo = new JCLO();
    String key = "someField";
    Object expectedValue = "someValue";
    setField(jclo, key, expectedValue);
    Object actualValue = jclo.getValue(key);
    assertEquals(expectedValue, actualValue);
}

// Helper method to set a private field value using reflection
private void setField(Object object, String fieldName, Object value) {
    try {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    } catch (Exception e) {
        fail("Failed to set field value: " + e.getMessage());
    }
}