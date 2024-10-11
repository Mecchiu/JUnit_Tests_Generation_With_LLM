// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
/**
		 * Test class of {@link DictionaryInfo_1Test}.
		 * It contains one unit test case for the single-tag case.
		 */
		class TestClass_1Tests {
				@Test
		    public void testSingleTag() {
		        TestClass_1 t = new TestClass_1();
		        t.testField1(t.getChildTag());
		        t.testField2(t.getChildTag());
		        assertEquals(1, t.getChildTag().length());
		        assertEquals("A Field", t.getChildTag());
		        assertArrayEquals(new String[] {}, t.getChildTags());
		    }
			}
	}

// DictionaryInfo_2Test.java
