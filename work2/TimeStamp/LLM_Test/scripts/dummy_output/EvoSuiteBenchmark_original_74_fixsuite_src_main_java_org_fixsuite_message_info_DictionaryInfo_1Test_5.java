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
		
	private static class FieldInfo {
		int tagNumber;
		String name; 
		int loadCount;
		double average;
	}
	
	DictionaryInfo dictionaryInfo;
	List<MessageInfo> messagesByName;
	List<FieldInfo> fieldsByTagNumber;
	List<FieldInfo> fieldsByName;
	List<ComponentInfo> componentsByName;
	List<ComponentInfo> componentsById;

	/**
	* Test
	* @throws Exception
	*/
	@Test
	void test() throws Exception {
		dictionaryInfo.startDictionary();
		dictionaryInfo.dictionaryLoaded();
		dictionaryInfo.dictionaryUpdated();
		dictionaryInfo.flush();
		List<FieldInfo> fieldList = dictionaryInfo.getFields();
		dictionaryInfo.endDictionary();
		assertTrue(fieldList.size() == 0);
		if (!dictionaryInfo.getMessages().isEmpty()) {
			dictionaryInfo.flush();
			fieldList = dictionaryInfo.getFields();
			dictionaryInfo.dictionaryLoaded();
			dictionaryInfo.dictionaryNotReady();
		}
		else {
			dictionaryInfo.setLoadCount(0);
			dictionaryInfo.getIdbyName().keySet().iterator().next();
		}
		fieldList = dictionaryInfo.getFields();
		dictionaryInfo.flush();
		dictionaryInfo.flush();
		fieldList = dictionaryInfo.getFields();
		dictionaryInfo.endDictionary();
        assertTrue(fieldList.size() == 0);
		assertTrue(fieldList.size() == 0);
		dictionaryInfo.flush();
		dictionaryInfo.flush();
		dictionaryInfo.flush();
	}

	@Test
	void testMessage() throws Exception {
		dictionaryInfo.startDictionary();
		messagesByName = dictionaryInfo.getMessagesByName();
		assertTrue(messagesByName.size() == 0);
		componentsByName = dictionaryInfo.getComponentByName();
		assertTrue(componentsByName.size() == 0);
		dictionaryInfo.flush();
		messagesByName = dictionaryInfo.getMessagesByName();
        assertTrue(messagesByName.size() == 0);
		componentsByName = dictionaryInfo.getComponentByName();
		assertTrue(componentsByName.size() == 0);
		dictionaryInfo.flush();
    List<ComponentInfo> loadedComponents = dictionaryInfo.getComponentByName();
    List<ComponentInfo> componentsById2 = dictionaryInfo.getComponents();
    componentsByName = dictionaryInfo.getComponentsByName();
		dictionaryInfo.deleteComponentsById();
		componentsByName = dictionaryInfo.getComponentsByName();
		
	}
}