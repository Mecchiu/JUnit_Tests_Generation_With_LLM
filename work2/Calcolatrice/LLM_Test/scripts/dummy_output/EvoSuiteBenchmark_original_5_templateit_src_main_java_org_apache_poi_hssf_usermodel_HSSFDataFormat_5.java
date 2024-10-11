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
		
    @Test
    public void testFormat() {
         //System.out.println( "---------------------------------\nTest: getFormat - test.hssf.test.dataformat\n");
       
         // Test that null is passed over to a builtin format
        assertNull( HSSFDataFormat.getBuiltinFormat( 0 ) );
       
        // Test that a string that doesn't exist is returned
        String out = HSSFDataFormat.getBuiltinFormat( FormatRecord.TEXT );
        assertNotNull( out );

        // Create a new format with a builtin format
        // and check that its output matches the builtin format
        String origFormat = "foo";
        HSSFDataFormat hssfDataFormat = new HSSFDataFormat( workbook );
        assertTrue( hssfDataFormat.getFormat( origFormat ) == origFormat );
        assertTrue( origFormat.equals( hssfDataFormat.getFormat( origFormat ) ) );
       
        origFormat = "12345";
        hssfDataFormat = new HSSFDataFormat( workbook );
        assertNotNull( origFormat );
        assertTrue(!hssfDataFormat.getFormat(origFormat).equals(origFormat) );
        assertTrue( origFormat.equals( hssfDataFormat.getFormat(origFormat) ) );
        
        origFormat = "3.14";
        hssfDataFormat = new HSSFDataFormat( workbook );
        assertNotNull( origFormat );
        assertTrue(!hssfDataFormat.getFormat(origFormat).equals(origFormat) );
        assertTrue( origFormat.equals( hssfDataFormat.getFormat( origFormat ) ) );
	
        originalFormat.length();
        origFormat = "3.14.44";
        hssfDataFormat = new HSSFDataFormat( workbook );
        assertNotNull( originalFormat );
        assertTrue(!hssfDataFormat.getFormat(originalFormat).equals( originalFormat ) );
        assertTrue( originalFormat.equals( hssfDataFormat.getFormat(originalFormat) ) );
    }

}