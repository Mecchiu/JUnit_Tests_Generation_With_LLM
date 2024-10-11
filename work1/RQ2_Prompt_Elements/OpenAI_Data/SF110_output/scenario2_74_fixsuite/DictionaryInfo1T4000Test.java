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

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX field.
 *
 * @author jramoyo
 */
public class FieldInfo {

    /**
     * Returns the field's name
     *
     * @return the field's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the field's name
     *
     * @param name - the field's name
     */
    public void setName(String name) {
        this.name = name;
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#getName()} method.
*/
class FieldInfoTest {
		
	@Test
	void testGetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName2() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName3() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName4() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName5() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName6() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName7() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName8() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName9() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testGetName10() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#setName(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testSetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName2() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName3() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName4() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName5() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName6() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName7() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName8() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName9() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName10() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#setName(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testSetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName2() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName3() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName4() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName5() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName6() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName7() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName8() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName9() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName10() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#setName(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testSetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName2() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName3() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName4() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName5() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName6() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName7() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
	}
	
	@Test
	void testSetName8() {
