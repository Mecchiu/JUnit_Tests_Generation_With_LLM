// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField2() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField3() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField4() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField5() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField6() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField7() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField8() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField9() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
	
	@Test
	void testGetField10() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		fieldsByTagNumber.put(1, fieldInfo);
		dictionaryInfo.fieldsByTagNumber = fieldsByTagNumber;
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
	}
}