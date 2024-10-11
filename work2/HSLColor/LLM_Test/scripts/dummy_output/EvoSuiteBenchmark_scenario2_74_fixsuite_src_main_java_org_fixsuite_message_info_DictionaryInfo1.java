// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfoTest {
		
	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField2() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField3() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField4() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField5() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField6() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField7() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField8() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField9() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
	
	@Test
	void testGetField10() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
	}
}