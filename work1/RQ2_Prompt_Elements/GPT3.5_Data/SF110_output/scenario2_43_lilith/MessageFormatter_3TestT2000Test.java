Here's the source code for the `MessageFormatter_3Test` class:

```java
package de.huxhorn.lilith.data.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class of {@link MessageFormatter}.
 * It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
 */
class MessageFormatter_3Test {

    @Test
    void testNull() {
        assertNull(MessageFormatter.identityToString(null));
    }

    @Test
    void testObject() {
        assertEquals("java.lang.Object@" + Integer.toHexString(System.identityHashCode(new Object())),
                MessageFormatter.identityToString(new Object()));
    }

    @Test
    void testString() {
        assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode("test")),
                MessageFormatter.identityToString("test"));
    }

    @Test
    void testInteger() {
        assertEquals("java.lang.Integer@" + Integer.toHexString(System.identityHashCode(42)),
                MessageFormatter.identityToString(42));
    }

    @Test
    void testDate() {
        Date date = new Date();
        assertEquals("java.util.Date@" + Integer.toHexString(System.identityHashCode(date)),
                MessageFormatter.identityToString(date));
    }

    @Test
    void testArray() {
        int[] array = {1, 2, 3};
        assertEquals("int[]@" + Integer.toHexString(System.identityHashCode(array)),
                MessageFormatter.identityToString(array));
    }

    @Test
    void testCollection() {
        Collection<String> collection = Arrays.asList("one", "two", "three");
        assertEquals("java.util.Arrays$ArrayList@" + Integer.toHexString(System.identityHashCode(collection)),
                MessageFormatter.identityToString(collection));
    }

    @Test
    void testMap() {
        Map<String, Integer> map = Map.of("one", 1, "two", 2, "three", 3);
        assertEquals("java.util.ImmutableCollections$MapN@" + Integer.toHexString(System.identityHashCode(map)),
                MessageFormatter.identityToString(map));
    }

    @Test
    void testSet() {
        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three"));
        assertEquals("java.util.HashSet@" + Integer.toHexString(System.identityHashCode(set)),
                MessageFormatter.identityToString(set));
    }

    @Test
    void testCustomObject() {
        CustomObject customObject = new CustomObject();
        assertEquals("de.huxhorn.lilith.data.logging.CustomObject@" + Integer.toHexString(System.identityHashCode(customObject)),
                MessageFormatter.identityToString(customObject));
    }

    private static class CustomObject {
    }
}
```

This class contains ten unit test cases for the `identityToString` method of the `MessageFormatter` class. The tests cover various types of objects, including null, `Object`, `String`, `Integer`, `Date`, arrays, collections, maps, custom objects, and more. The tests ensure that the `identityToString` method returns the expected identity string for each object.