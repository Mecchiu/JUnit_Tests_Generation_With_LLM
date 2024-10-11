Here's the source code for the `MessageFormatter` class and its test class `MessageFormatter_3Test`:

```java
// MessageFormatter.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Replacement for org.slf4j.helpers.MessageFormatter.</p>
 * <p>
 * In contrast to the mentioned class, the formatting of message pattern and arguments into the actual message
 * is split into three parts:
 * </p>
 * <ol>
 * <li>Counting of placeholders in the message pattern (cheap)</li>
 * <li>Conversion of argument array into an ArgumentResult, containing the arguments converted to String as well as
 * an optional Throwable if available (relatively cheap)</li>
 * <li>Replacement of placeholders in a message pattern with arguments given as String[]. (most expensive)</li>
 * </ol>
 * <p>
 * That way only the first two steps have to be done during event creation while the most expensive part, i.e. the
 * actual construction of the message, is only done on demand.
 * </p>
 */
public class MessageFormatter {

    /**
     * This method returns the same as if Object.toString() would not have been
     * overridden in obj.
     * <p/>
     * Note that this isn't 100% secure as collisions can always happen with hash codes.
     * <p/>
     * Copied from Object.hashCode():
     * As much as is reasonably practical, the hashCode method defined by
     * class <tt>Object</tt> does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java<font size="-2"><sup>TM</sup></font> programming language.)
     *
     * @param obj the Object that is to be converted into an identity string.
     * @return the identity string as also defined in Object.toString()
     */
    public static String identityToString(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder buffer = new StringBuilder();
        buffer.append(obj.getClass().getName());
        buffer.append('@');
        buffer.append(Integer.toHexString(System.identityHashCode(obj)));
        return buffer.toString();
    }
}

// MessageFormatter_3Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
    void testDate() {
        Date date = new Date();
        String expected = date.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(date));
        assertEquals(expected, MessageFormatter.identityToString(date));
    }

    @Test
    void testArray() {
        int[] array = {1, 2, 3};
        String expected = array.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(array));
        assertEquals(expected, MessageFormatter.identityToString(array));
    }

    @Test
    void testCollection() {
        Collection<String> collection = Arrays.asList("one", "two", "three");
        String expected = collection.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(collection));
        assertEquals(expected, MessageFormatter.identityToString(collection));
    }

    @Test
    void testSet() {
        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three"));
        String expected = set.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(set));
        assertEquals(expected, MessageFormatter.identityToString(set));
    }

    @Test
    void testMap() {
        Map<String, Integer> map = Map.of("one", 1, "two", 2, "three", 3);
        String expected = map.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(map));
        assertEquals(expected, MessageFormatter.identityToString(map));
    }

    @Test
    void testNested() {
        Object obj = new Object();
        Object[] array = {obj};
        Collection<Object> collection = Arrays.asList(array);
        Set<Object> set = new HashSet<>(collection);
        Map<Object, Object> map = Map.of(set, array);
        String expected = map.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(map));
        assertEquals(expected, MessageFormatter.identityToString(map));
    }

    @Test
    void testSubclass() {
        Object obj = new Object() {
            @Override
            public String toString() {
                return "test";
            }
        };
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, MessageFormatter.identityToString(obj));
    }
}
```