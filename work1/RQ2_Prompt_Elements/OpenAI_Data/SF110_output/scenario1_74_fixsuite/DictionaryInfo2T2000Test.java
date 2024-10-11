// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetComponent() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		dictionaryInfo.componentsById.put(1, new ComponentInfo());
		dictionaryInfo.componentsById.put(2, new ComponentInfo());
		dictionaryInfo.componentsById.put(3, new ComponentInfo());
		dictionaryInfo.componentsById.put(4, new ComponentInfo());
		dictionaryInfo.componentsById.put(5, new ComponentInfo());
		dictionaryInfo.componentsById.put(6, new ComponentInfo());
		dictionaryInfo.componentsById.put(7, new ComponentInfo());
		dictionaryInfo.componentsById.put(8, new ComponentInfo());
		dictionaryInfo.componentsById.put(9, new ComponentInfo());
		dictionaryInfo.componentsById.put(10, new ComponentInfo());
		
		assertEquals(dictionaryInfo.componentsById.get(1), dictionaryInfo.getComponent(1));
		assertEquals(dictionaryInfo.componentsById.get(2), dictionaryInfo.getComponent(2));
		assertEquals(dictionaryInfo.componentsById.get(3), dictionaryInfo.getComponent(3));
		assertEquals(dictionaryInfo.componentsById.get(4), dictionaryInfo.getComponent(4));
		assertEquals(dictionaryInfo.componentsById.get(5), dictionaryInfo.getComponent(5));
		assertEquals(dictionaryInfo.componentsById.get(6), dictionaryInfo.getComponent(6));
		assertEquals(dictionaryInfo.componentsById.get(7), dictionaryInfo.getComponent(7));
		assertEquals(dictionaryInfo.componentsById.get(8), dictionaryInfo.getComponent(8));
		assertEquals(dictionaryInfo.componentsById.get(9), dictionaryInfo.getComponent(9));
		assertEquals(dictionaryInfo.componentsById.get(10), dictionaryInfo.getComponent(10));
	}
}