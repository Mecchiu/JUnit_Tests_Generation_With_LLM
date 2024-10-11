// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		/**
		 * Tests for {@link DictionaryInfo#getField(String)}.
		 */
	@Test
	void getField() {
		System.out.println("DictionaryInfo_3Test getField");
		// Setup
		DictionaryInfo dictionaryInfo = new DictionaryInfo(); // No name
		dictionaryInfo.incrementLoadCount();
		ComponentInfo componentInfo = dictionaryInfo.getComponent(ComponentInfo.FIELD_NAME_SITE_ID);
		assertTrue(componentInfo!= null);
		assertTrue(componentInfo.getId() > 1);

		assertNotNull(componentInfo);
		assertFalse(componentInfo.isGroup());
		List<String> nameList = new ArrayList<String>();
		nameList.addAll(componentInfo.getName().getName());
		assertTrue(!nameList.isEmpty());

		// Test
		String name = nameList.get(0);
		FieldInfo fieldInfo = dictionaryInfo.getField(name);
		assertNotNull(fieldInfo);
		assertTrue(fieldInfo.isGroup());
		Integer tagNumber = fieldInfo.getID();
		assertTrue(tagNumber > 1);

		List<FieldInfo> fields = dictionaryInfo.getFieldNames(tagNumber);
		List<FieldInfo> fields2 = dictionaryInfo.getFieldList(tagNumber, FieldInfo.FIELDS_TYPE_SUBFIELD);
		assertTrue(fields.size() == fields2.size());
		for (int i = 0; i < fields.size(); i++) {
			assertTrue(fields.get(i).getID() == fields2.get(i).getID());
		}
		for (int i = 1; i < fields.size(); i++) {
			FieldInfo fieldInfo1 = fields.get(i);
			FieldInfo fieldInfo2 = fields2.get(i);
			assertNotEquals(fieldInfo1.getID(), fieldInfo2.getID());
		}
	}
}