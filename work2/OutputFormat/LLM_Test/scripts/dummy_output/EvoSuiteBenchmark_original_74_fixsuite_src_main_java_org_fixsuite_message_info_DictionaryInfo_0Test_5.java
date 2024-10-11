// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		/**
		 * This unit test cases ensures the {@link TreeMap} type of the returned
		 * {@link Object} is properly constructed.
		 */
	@Test
    public void testTreeMap() {
    String s = DictionaryInfo.get().getField(1);
    assertNotNull(s);
    assertTrue(s.compareTo("field1") == 0, "wrong return value");
    List slist=new ArrayList();
    slist.addObject("Field1");
    Object o = DictionaryInfo.get().getField(slist);
    assertNotNull(o);
    assertTrue(s.compareTo(o.toString())==0, "wrong return value");
    }
}