Here's the source code for the test class:

```
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
    void testNull() {
        assertNull(MessageFormatter.identityToString(null));
    }

    @Test
    void testObject() {
        Object obj = new Object();
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, MessageFormatter.identityToString(obj));
    }

    @Test
    void testString() {
        String str = "test";
        String expected = str.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str));
        assertEquals(expected, MessageFormatter.identityToString(str));
    }

    @Test
    void testArray() {
        int[] arr = {1, 2, 3};
        String expected = arr.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(arr));
        assertEquals(expected, MessageFormatter.identityToString(arr));
    }

    @Test
    void testCollection() {
        Collection<String> coll = Arrays.asList("a", "b", "c");
        String expected = coll.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(coll));
        assertEquals(expected, MessageFormatter.identityToString(coll));
    }

    @Test
    void testSet() {
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c"));
        String expected = set.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(set));
        assertEquals(expected, MessageFormatter.identityToString(set));
    }

    @Test
    void testMap() {
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        String expected = map.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(map));
        assertEquals(expected, MessageFormatter.identityToString(map));
    }

    @Test
    void testDate() {
        Date date = new Date();
        String expected = date.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(date));
        assertEquals(expected, MessageFormatter.identityToString(date));
    }

    @Test
    void testSimpleDateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String expected = sdf.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(sdf));
        assertEquals(expected, MessageFormatter.identityToString(sdf));
    }

    @Test
    void testCustomObject() {
        CustomObject obj = new CustomObject();
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, MessageFormatter.identityToString(obj));
    }

    private static class CustomObject {
    }
}
```