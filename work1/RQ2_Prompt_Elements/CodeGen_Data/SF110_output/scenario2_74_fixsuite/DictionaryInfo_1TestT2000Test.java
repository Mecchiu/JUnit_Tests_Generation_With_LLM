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
     * Returns a field given a name
     *
     * @param name - a name
     * @return a field given a name
     */
    public FieldInfo getField(String name) {
        if (fieldsByName!= null) {
            return fieldsByName.get(name);
        }
        return null;
    }
}

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
		
	/** Creates a new instance of DictionaryInfo_1Test */
	public DictionaryInfo_1Test() {
	}
	
	/*
	 * Test cases.
	 */
	@Test
	public void test1(){
		/*
		 * Initialization
		 */
	}

	@Test
	public void test2() {
		/*
		 * FieldInfo
		 */
		
		/*
		 * Set fields in DictionaryInfo
		 */
		List<FieldInfo> fields = new ArrayList<>();		
		fields.add(new DefaultFieldInfo("Field1", FieldInfo.Type.TEXT, null));
	

		/*
		 * Add fields in DictionaryInfo
		 */
		DictionaryInfo dictionary = new DictionaryInfo();
		assertEquals(null, dictionary.getField("Field1"));
		dictionary.putField("Field1", fields);

		/*
		 * Check fields
		 */
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(1, dictionary.getDictionary().size());

	}
	
	@Test
	public void test3(){
		/*
		 * FieldInfo
		 */
		
		/*
		 * Set fields in DictionaryInfo
		 */
		List<FieldInfo> fields = new ArrayList<>();		
		fields.add(new DefaultFieldInfo("Field1", FieldInfo.Type.TEXT, null));
	

		/*
		 * Add fields in DictionaryInfo
		 */
	
		/*
		 * Set fields in DictionaryInfo
		 */
		DictionaryInfo dictionary = new DictionaryInfo();
		assertEquals(null, dictionary.getField("Field1"));
		dictionary.putField("Field1", fields);

		/*
		 * Check fields
		 */
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(fields, dictionary.getField("Field1"));
		assertEquals(1, dictionary.getDictionary().size());

	} 

	
	@Test
	public void test4(){
		/*
		 * Test cases.
		 */

		
		/*
		 * Set fields in DictionaryInfo
		 */

		List<String> dictionary = new ArrayList<>();

		/*
		 * Add field in DictionaryInfo
		 */

		/*
		 * Set fields in DictionaryInfo
		 */

		/*
		 * Add field in DictionaryInfo
		 */
		dictionary.add("Item1");
		
		/*
		 * Add field in DictionaryInfo
		 */
		dictionary.put("Item2", "Field2");

		/*
		 * Add field in DictionaryInfo
		 */
		dictionary.put("Item3", "Field3");

		/*
		 * Add field in DictionaryInfo
		 */

		/*
		 * Set fields in DictionaryInfo
		 */
		dictionary.add("Item4");
		dictionary.add("Item5");
		dictionary.add("Item6");

		List<DictionaryInfo> dictionaryInfoList = new ArrayList<>();
		dictionaryInfoList.add(dictionary);

		//check what field in DictionaryInfo is null.
		assertEquals(1, dictionaryInfoList.size());
		List<FieldInfo> fieldInfoList = dictionary.getFields();
		assertEquals(1, fieldInfoList.size());

		
		//check how many information there are in DictionaryInfo.
		List<FieldInfo> fieldInfo = dictionary.getField("Item1");
		assertEquals(2, fieldInfo.size());
		
		//check if dictionaries are equal.
		assertTrue("DictionaryInfo has item1", dictionaryInfoList.contains(dictionary));
		assertTrue("FieldInfo has ", fieldInfo.contains(dictionaryInfoList.iterator().next()));

		
		
	} 




    private static class FieldInfo {
        /** Field name. */
        private String name;
        public FieldInfo(String name) {
            this.name = name;
        }
        /**
         * getName()
         *
         * @return a string with the name
         */
        public String getName() {
            return name;
        }
        /**
         * setName()
         *
         * @param name - string containing the name
         */
        public void setName(String name) {
            this.name = name;
        }

       /**
        * getType()
        *
        * @return the type of object
        * @Deprecated
        */
        @Deprecated
        @Deprecated
        public FieldInfoType getType() {
            return null;
        }


        public void setType(FieldInfoType type) {

        }
    }
} 









