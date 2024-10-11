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
		
	/**
	 * Test case to
	 * {@link DictionaryInfo#getComponent(int)}.
	 *
	 * @throws Exception
	 * @see DictionaryInfo_1_4Test
	 */
    @Test public void getComponent_1_4Test() throws Exception {
        final String infoFile = "DictionaryInfo_1_4.info";

        // 1.4 version
    	dictionaryInfo = new DictionaryInfo(DictionaryInfoFactoryTest.getVersion_1_4());
    	assertEquals("DictionaryInfo version mismatch", 1.4, dictionaryInfo.getVersion().getMajor());
	}


	/**
	 * Test case to
	 * {@link DictionaryInfo#createCompactGroup(int)}.
	 *
	 * @throws Exception
	 * @see DictionaryInfo_2Test_1
	 */
    @Test public void createCompactGroup_1() throws Exception {
        final String groupType = "GROUP";
        final int groupID = 12345;
        final String category = "CATEGORY";

        dictionaryInfo = new DictionaryInfo(groupID, category);

        // Test 1.4 version
    	assertEquals("DictionaryInfo compact group mismatch", groupID, dictionaryInfo.getCompactGroupID().getInt());
    	assertEquals("DictionaryInfo compact category mismatch", category, dictionaryInfo.getCompactCategory());
    }


	/**
	 * Tests case when the version has not been set in DictionaryInfo.
	 *
	 * @throws Exception
	 * @see DictionaryInfo_2Test_2
	 */
    @Test public void createCompactGroup_2() throws Exception {
    	final String groupType = "GROUP";
    	final int groupID = 12345;
    	final String category = "CATEGORY";

        //Test 1.4 version
    	assertEquals("DictionaryInfoGroupID mismatch", groupID, dictionaryInfo.getGroupID().getInt());
    	assertEquals("DictionaryInfoGroupType mismatch", groupType, dictionaryInfo.getGroupType());
    	assertNotNull("DictionaryInfoCategory mismatch", dictionaryInfo.getCategory());
    }


	/**
	 * Tests case when the component has not been saved in DictionaryInfo.
	 *
	 * @throws Exception
	 */
    @Test public void createComponent_1() throws Exception {
    	final Integer componentTagNumber = 1;
    	final String componentValue = "VALUE";
    	final String fieldName = "FIELDNAME";
    	dictionaryInfo = new DictionaryInfo(componentTagNumber, componentValue, fieldName);

    	//Test 1.4 version
    	assertEquals("DictionaryInfoObjectTagNumber mismatch", componentTagNumber, dictionaryInfo.getObject());
    	assertEquals("DictionaryInfoObjectValue mismatch", componentValue, dictionaryInfo.getObject().get(fieldName));
    	assertEquals("DictionaryInfoObjectfieldName mismatch", fieldName, dictionaryInfo.getObject().get(componentValue));
    }


	/**
	 * Tests case when the list is too small.
	 *
	 * @throws Exception
	 * @see DictionaryInfo_4Test
	 */
    @Test public void createComponent_3() throws Exception {
    	final String fieldName = "FIELD1";
    	dictionaryInfo = dictionaryInfo.createCompactGroup(4);
    	dictionaryInfo = dictionaryInfo.createCompactGroup(4); //Test 2.4

			int position = 0;
			String[] list = new String[4];
			list[position] = fieldName;
			list[position + 1] = String.format("%s:%d", fieldName, 1); //Test 2.4
			list[position + 2] = String.format("%s:%d", fieldName, 2); //Test 2.4
	}


	/**
	 * Tests case when the list is too large.
	 *
	 * @throws Exception
	 * @see DictionaryInfo_4Test
	 */
    @Test public void createComponent_4() throws Exception {
    	final String fieldName = "FIELD1";
    	dictionaryInfo = dictionaryInfo.createCompactGroup(4);
    	dictionaryInfo = dictionaryInfo.createCompactGroup(4); //Test 2
}
}