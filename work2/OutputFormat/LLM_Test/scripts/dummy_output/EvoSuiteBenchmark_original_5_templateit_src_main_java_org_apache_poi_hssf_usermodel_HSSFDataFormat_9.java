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
		/** The number of builtin formats. */
	@Test
		public void TestGetNumberOfBuiltinBuiltinFormats() {
			HSSFDataFormat d = new HSSFDataFormat();
	    	assertEquals(HSSFDataFormat.getBuiltinFormat(d.getNumberOfBuiltinBuiltinFormats()),d.getFormat(0));
	    }
}