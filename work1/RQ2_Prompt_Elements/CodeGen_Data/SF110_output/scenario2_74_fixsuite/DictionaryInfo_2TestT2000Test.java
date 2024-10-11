// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    /**
     * Returns a component given an id
     *
     * @param id - an id
     * @return a component given an id
     */
    public ComponentInfo getComponent(int id) {
        if (componentsById!= null) {
            return componentsById.get(id);
        }
        return null;
    }
}

// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
		private final List<ComponentInfo> componentsById = new ArrayList();

	@Test
	public void hashCode() {
	    assertEquals(componentsById.hashCode(), DictionaryInfo.class.hashCode());
	}

	@Test
	public void equals() {
		assertEquals(true, DictionaryInfo_2Test.class.equals(DictionaryInfo_2Test.class));
		assertEquals(true, DictionaryInfo_2Test.class.equals(DictionaryInfo_2Test.class));
	}

    @Test
    void putTest() {
        // put
        DictionaryInfo_2Test dictTest = new DictionaryInfo_2Test();
        dictTest.put(null, null);
        dictTest.put("", "1");
        dictTest.put("a:b:c", "ABC");
        assertEquals("1234abcd", dictTest.get("a:b:c", ""));
        assertFalse(dictTest.contains("b:c", "a:b:c"));
        assertNull(dictTest.get("d:c", "a:b:c"));
        assertNull(dictTest.get("x:", ""));

        // remove
        dictTest = new DictionaryInfo_2Test();
        dictTest.put("b:c:d:e", "A");
        dictTest.put("b:c:e", "B");
        assertEquals("ab1234abd", dictTest.get("b:c:d:e", ""));
        assertFalse(dictTest.equals(new DictionaryInfo_2Test()));
        assertFalse(dictTest.equals("ab1234abd", "B"));
        assertFalse(dictTest.equals("ab1234abd", "A"));
        assertTrue(dictTest.equals(new DictionaryInfo_2Test()));
    }

    @Test
    void removeTest() {
        // remove
        DictionaryInfo_2Test dictTest = new DictionaryInfo_2Test();
        dictTest.put("b:c:d:e", "B");
        assertEquals("b1234abd", dictTest.remove("b:c:d:e"));
        assertEquals("b1234abd", dictTest.remove("b:c:e"));
        assertEquals("", dictTest.remove("b:c:e"));
        assertNull(dictTest.remove("b:c:d:e"));
        assertNull(dictTest.remove("b:c:e"));

        // contains
        assertTrue(dictTest.contains("b:c:d:e", ""));
        assertFalse(dictTest.contains("b:c:d:e", "A"));
        assertTrue(dictTest.contains("b:c:e", ""));
        assertFalse(dictTest.contains("b:c:e", "B"));
    }

	@Test
	public void addAndContainsTest() {
		// add
		DictionaryInfo_2Test dictTest = new DictionaryInfo_2Test();
		List<String> names = new TreeMap<String, String>();
		dictTest.add("b:c:d:e   ", "1");
		dictTest.add("b:c:e", "   1");
		names.add("b:c:e");
		names.add("b:c:d");
		names.add("b:c:d:e");
		names.add("b:c:d:e");
		names.add("b:c:d:e");
		names.add("b:c:d");
		names.add("b:c:d:e");

		names.add("     ");
		names.add("     1");
		names.add("     2");
		names.add("     3");
		names.add("     4");
		names.add("     5");
		names.add("     6");

		assertTrue(dictTest.contains(null, ""));
		assertTrue(dictTest.contains("", ""));
		names.add("c:d:e");
		assertFalse(dictTest.contains(null, ""));
		assertFalse(dictTest.contains("", ""));
		names.add("a:b:c"); // contains test.
		names.add("b:c:d"); // contains test.
		names.add("b:c:d:e"); // not equals test.
		names.add("b:c:d:e"); // not equals test.
	}
}
