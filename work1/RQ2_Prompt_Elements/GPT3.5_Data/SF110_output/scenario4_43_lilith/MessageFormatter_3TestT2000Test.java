// MessageFormatter_3Test.java
package de.huxhorn.lilith.data.logging;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MessageFormatter}.
 * It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
 */
class MessageFormatter_3Test {

    @Test
    void testIdentityToStringNull() {
        String result = MessageFormatter.identityToString(null);
        assertEquals("null", result);
    }

    @Test
    void testIdentityToStringString() {
        String result = MessageFormatter.identityToString("test");
        assertTrue(result.startsWith("java.lang.String@"));
    }

    @Test
    void testIdentityToStringInteger() {
        Integer i = 42;
        String result = MessageFormatter.identityToString(i);
        assertTrue(result.startsWith("java.lang.Integer@"));
    }

    @Test
    void testIdentityToStringDate() {
        Date d = new Date();
        String result = MessageFormatter.identityToString(d);
        assertTrue(result.startsWith("java.util.Date@"));
    }

    @Test
    void testIdentityToStringArray() {
        String[] array = {"test", "array"};
        String result = MessageFormatter.identityToString(array);
        assertTrue(result.startsWith("java.lang.String[]@"));
    }

    @Test
    void testIdentityToStringMap() {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        String result = MessageFormatter.identityToString(map);
        assertTrue(result.startsWith("java.util.ImmutableCollections$MapN@"));
    }

    @Test
    void testIdentityToStringCollection() {
        Collection<String> collection = Arrays.asList("test", "collection");
        String result = MessageFormatter.identityToString(collection);
        assertTrue(result.startsWith("java.util.ImmutableCollections$ListN@"));
    }

    @Test
    void testIdentityToStringNestedArray() {
        String[][] nestedArray = {{"test1", "test2"}, {"test3", "test4"}};
        String result = MessageFormatter.identityToString(nestedArray);
        assertTrue(result.startsWith("java.lang.String[][]@"));
    }

    @Test
    void testIdentityToStringNestedMap() {
        Map<String, Map<String, String>> nestedMap = Map.of("key1", Map.of("key2", "value2"));
        String result = MessageFormatter.identityToString(nestedMap);
        assertTrue(result.startsWith("java.util.ImmutableCollections$MapN@"));
    }

    @Test
    void testIdentityToStringNestedCollection() {
        Collection<Collection<String>> nestedCollection = Arrays.asList(Arrays.asList("test1", "test2"), Arrays.asList("test3", "test4"));
        String result = MessageFormatter.identityToString(nestedCollection);
        assertTrue(result.startsWith("java.util.ImmutableCollections$ListN@"));
    }
}