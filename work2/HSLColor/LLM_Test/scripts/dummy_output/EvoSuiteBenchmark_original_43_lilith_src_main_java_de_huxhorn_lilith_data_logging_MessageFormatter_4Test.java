package de.huxhorn.lilith.data.logging;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageFormatter_4Test {

    @Test
    void testIdentityToString_NullObject() {
        assertEquals(null, MessageFormatter.identityToString(null));
    }

    @Test
    void testIdentityToString_NonNullObject() {
        Object obj = new Object();
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, MessageFormatter.identityToString(obj));
    }

    @Test
    void testIdentityToString_SameObject() {
        Object obj = new Object();
        String identity = MessageFormatter.identityToString(obj);
        assertEquals(identity, MessageFormatter.identityToString(obj));
    }

    @Test
    void testIdentityToString_DifferentObjects() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotEquals(MessageFormatter.identityToString(obj1), MessageFormatter.identityToString(obj2));
    }

    @Test
    void testIdentityToString_SameObjectHashCode() {
        Object obj = new Object();
        String identity = MessageFormatter.identityToString(obj);
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        assertEquals(expected, identity);
    }

    @Test
    void testIdentityToString_NullObjectHashCode() {
        Object obj = null;
        assertEquals(null, MessageFormatter.identityToString(obj));
    }

    @Test
    void testIdentityToString_SameObjectNull() {
        Object obj = new Object();
        String identity = MessageFormatter.identityToString(obj);
        assertEquals(identity, MessageFormatter.identityToString(obj));
    }

    @Test
    void testIdentityToString_DifferentObjectsHashCode() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotEquals(System.identityHashCode(obj1), System.identityHashCode(obj2));
    }

    @Test
    void testIdentityToString_SameObjectNullHashCode() {
        Object obj = new Object();
        String identity = MessageFormatter.identityToString(obj);
        assertEquals(System.identityHashCode(obj), System.identityHashCode(obj));
    }
}
