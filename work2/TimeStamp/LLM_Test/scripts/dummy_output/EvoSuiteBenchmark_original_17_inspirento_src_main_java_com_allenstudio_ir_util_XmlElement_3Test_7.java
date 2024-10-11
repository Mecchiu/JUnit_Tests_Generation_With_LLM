// XmlElement_3Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
		
	@Test
    public void test_XmlElement_AddSubElem_1() throws Exception {
		
		Object[] params = new Object[] {"testData1testData2",true};
		
		assertEquals("testData1testData2", XmlElement_1.addSubElement("testSubElement", "XmlElement_test_1"));
		
		List testData = (List)params[0];
		List testDataObject = (List)params[1];

		assertEquals(1, testData.size());
		assertEquals(2, testDataObject.size());

		Object testDataObj;
		Object testDataListObj=null;
		int number = -1;
		
		for( Iterator itr=testData.iterator(); itr.hasNext();) {
			testDataObj = itr.next();
			
			if( testDataObj instanceof String) {
				number++;
			}
		}

		assertTrue("We found more Test data elements!", testData.size()!=0);
		assertTrue("There are not Test Data elements as Object!", number>=0);
		assertEquals(number, 0);//testData.size());
	}

}