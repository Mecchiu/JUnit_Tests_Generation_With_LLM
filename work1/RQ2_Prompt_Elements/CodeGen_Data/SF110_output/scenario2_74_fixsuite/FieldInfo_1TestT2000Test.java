// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {

	 /**
	* Test of isValidValue method, of class FieldInfo
	*/
    @Test
    public void test_IsValidValue() {
        System.out.println("isValidValue");
        boolean aBoolean = true;
        TreeMap<String, Object> bTreeMap = new TreeMap<String, Object>();
        List<String> aList = new ArrayList<String>();
        aList.add("c");
        aList.add("a");
        bTreeMap.put("b", aList);
        aTreeMap().put("c", aBoolean);
        boolean b = aTreeMap().isValidValue("b");
        boolean a = aTreeMap().isValidValue("c");
        assertTrue(b);
        assertTrue(a);
    }

    
    /**
	* Test of isValidValue method, of class FieldInfo.
	*/
    @Test
    public void test_isValidValue_NoField() {
        boolean b = false;
        TreeMap<String, Object> bTreeMap = new TreeMap<String, Object>();
        List<String> aList = new ArrayList<String>();
        aList.add("a");
        bTreeMap.put("b", aList);
        aTreeMap().put("c", b);
        boolean c = aTreeMap();
        bTreeMap().isValidValue("c");
        assertFalse(b);
    }
    
	/**
	* Test of isValidValue method, of class FieldInfo.
	*/
    @Test
    public void test_isValidValue_OneField() {
    	List<String> aList = new ArrayList<String>();
    	aList.add("a");
    	List<String> bList = new ArrayList<String>();
    	bList.add("b");
    	TreeMap<String, Object> aTreeMap = new TreeMap<String, Object>();
    	aTreeMap.put("c", true);
    	aTreeMap().put("d", bList);
    	aTreeMap().put("c", false);
    	TreeMap<String, Object> aTreeMap2 = new TreeMap<String, Object>();
    	aTreeMap2.put("f", true);
    	aTreeMap2.put("c", bList);
    	aTreeMap2().put("c", false);
    	aTreeMap2().put("d", aList);
    	aList.clear();
    	aTreeMap.put("b", aList);
    	aTreeMap2.put("b", aList);
    	boolean c = aTreeMap.isValidValue("c");
    	boolean d = aTreeMap2.isValidValue("d");
    	boolean f = aTreeMap2.isValidValue("f");
    	boolean c = bTreeMap.isValidValue("c");
    	boolean d = bTreeMap2.isValidValue("d");
    	boolean f = bTreeMap2.isValidValue("f");
    	boolean c = aTreeMap.isValidValue("c");
    	boolean d = aTreeMap2.isValidValue("d");
    	boolean f = aTreeMap2.isValidValue("f");
    	if (c && d && f) {
    		assertTrue(c && d);
    	} else {
    		assertFalse(c && d && f);
    	}
    }
// FieldInfo_1Test.java
}
