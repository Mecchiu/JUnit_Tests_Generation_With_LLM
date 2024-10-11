// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
/**
		 * Test case for the getValue method of {@link JCLO}.
		 */
        @Test
    public void testGetValue() {
    	assertEquals(null, JCLO.getValue("noValue"));
    	assertEquals("A string", JCLO.getValue("keyA"));
    	assertEquals("B string", JCLO.getValue("keyB"));
    	assertEquals("C string", JCLO.getValue("keyC"));
    }

        /**
         * Test case for the getField method of {@link JCLO}.
         */
    @Test
    public void testGetField() throws NoSuchFieldException {
        Class keyCls = String.class;
        Field field = keyCls.getDeclaredField("NO_VALUE");
        field.setAccessible(true);
        assertEquals(keyCls, field.getType());
        assertNotNull(field);
        assertTrue(Arrays.equals(new Object[] {"A"}, field.get(new String("A"))));
    }

        /**
         * Test case for the getArray field of {@link JCLO}.
         */
    @Test
    public void testGetArray() throws NoSuchFieldException {
        Class keyCls = String.class;
        Field field = keyCls.getDeclaredField("STRING_ARRAY");
        field.setAccessible(true);
        Object fieldValue = field.get(new String("A"));
        assertEquals(new Class(String.class), fieldValue.getClass());
        assertEquals(new String("A"), fieldValue.toString());
    }
}

