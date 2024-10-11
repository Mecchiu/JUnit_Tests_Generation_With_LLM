// HSSFDataFormatTest.java
/*
 * HSSFDataFormat.java
 *
 * Created on December 18, 2001, 12:42 PM
 */
package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.FormatRecord;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSSFDataFormat}.
* It contains one unit test case for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormatTest {
		
    /**
     * Testing {@link HSSFDataFormat#getFormat(String)}
     */
    @Test
    void testGetFormat() {
        assertEquals(18, HSSFDataFormat.getFormat(null));
        assertEquals(18, HSSFDataFormat.getFormat("0%"));
        assertEquals(21, HSSFDataFormat.getFormat(new char[]{'F'}));
        assertEquals(22, HSSFDataFormat.getFormat(new byte[]{'F'}));
        assertEquals(24, HSSFDataFormat.getFormat(new short[]{'F'}));
        assertEquals(18, HSSFDataFormat.getFormat(new char[]{'F'}, new int[]{0}));
        assertEquals(0, Math.abs(HSSFDataFormat.getFormat(new char[]{'F'}, new int[]{0})));
   }
	
	/**
	 * Test to make sure a builtin format is recognized
	 *  by its first character and can be referenced through this name.
	 */
	@Test
	void testGetBuiltinBuiltinFormat() {
		assertEquals(Integer.toString(36), new HSSFDataFormat().getBuiltinFormat(36));
	}
	
	@Test
	public void testSetFromList() {
		List builtins = new List();
		builtins.add(Integer.toString(36));
		HSSFDataFormat.setFromList(builtins);
		assertEquals(Integer.toString(36), HSSFDataFormat.getFormat(builtins));
	}
}